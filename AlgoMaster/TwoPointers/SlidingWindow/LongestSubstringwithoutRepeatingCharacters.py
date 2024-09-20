def longest_substring_without_repeating_characters(s: str) -> int:

    L, R = 0, 0
    longest_sub_length = 0
    seen_letters = {}
    while R < len(s):
        if s[R] in seen_letters:
            seen_letters[s[R]] += 1
        else:
            seen_letters[s[R]] = 1
        while seen_letters[s[R]] > 1:
            seen_letters[s[L]] -= 1
            L += 1
        curr_long_length = R - L + 1
        if curr_long_length > longest_sub_length:
            longest_sub_length = curr_long_length
        R += 1
    return longest_sub_length
if __name__ == '__main__':
    s = input()
    res = longest_substring_without_repeating_characters(s)
    print(res)
