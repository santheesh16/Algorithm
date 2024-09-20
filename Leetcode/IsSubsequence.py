
def isSubsequence(s, t):
    if len(s) > len(t): return False
    if len(s) == 0: return True
    left = 0
    for right in range(len(t)):
        if left <= len(s) - 1:
            if s[left] == t[right]:
                left += 1
    return left == len(s)

if __name__ == '__main__':
    s = str(input())
    t = str(input())
    print(isSubsequence(s, t))