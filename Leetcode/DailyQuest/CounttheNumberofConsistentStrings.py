from typing import List


class CounttheNumberofConsistentStrings:
    def countConsistentStrings(self, allowed: str, words: List[str]) -> int:
        allowed_set = set(allowed)
        print(allowed_set)

        consistent_count= 0
        for word in words:
            if all(char in allowed_set for char in word):
                consistent_count +=1
        return consistent_count


count = CounttheNumberofConsistentStrings()
allowed = "ab"
words = ["ad", "bd", "aaab", "baa", "badab"]
print(count.countConsistentStrings(allowed, words))
