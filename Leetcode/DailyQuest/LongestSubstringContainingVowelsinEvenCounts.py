from collections import Counter


def findTheLongestSubstring(s: str) -> int:
    # Dictionary to map vowels to their respective bit positions
    vowels = {'a': 0, 'e': 1, 'i': 2, 'o': 3, 'u': 4}

    # Dictionary to store the first occurrence of each prefix XOR bitmask
    prefix_xor_map = {0: -1}  # bitmask 0 at index -1 (before the string starts)

    bitmask = 0
    max_len = 0

    # Iterate over the string
    for i, char in enumerate(s):
        # If the character is a vowel, toggle the corresponding bit in the bitmask
        if char in vowels:
            bitmask ^= (1 << vowels[char])

        # Check if this bitmask has been seen before
        if bitmask in prefix_xor_map:
            # Calculate the length of the valid substring
            max_len = max(max_len, i - prefix_xor_map[bitmask])
        else:
            # Store the first occurrence of this bitmask
            prefix_xor_map[bitmask] = i

    return max_len



s = "leetcodeisgreat"
print(findTheLongestSubstring(s))
