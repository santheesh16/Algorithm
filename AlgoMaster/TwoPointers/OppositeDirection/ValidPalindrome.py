
def is_palindrome(s: str) -> bool:

    s = ''.join(char for char in s if char.isalnum()).lower()
    L , R =0 ,len(s) - 1
    while L < R:
        if s[L] != s[R]:
            return False
        L += 1
        R -= 1
    return True


if __name__ == '__main__':
    s = "Do geese see God"
    res = is_palindrome(s)
    print(res)
