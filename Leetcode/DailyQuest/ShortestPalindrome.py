
def shortestPalindrome(s: str) -> str:
    if not s:
        return ""
    rev_s=s[::-1]
    x=len(s)
    for i in range(x):
        if s[:x-i] == rev_s[i:]:
            return rev_s[:i]+s


s = "aacecaaa"
print(shortestPalindrome(s))
s = "abcd"
print(shortestPalindrome(s))
