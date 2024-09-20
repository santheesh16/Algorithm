from math import inf
from typing import List


def largestNumber(nums: List[int]) -> str:
    numStrings = [str(num) for num in nums]
    numStrings.sort(key=lambda a: a * 10, reverse=True)
    if numStrings[0] == "0":
        return "0"
    return "".join(numStrings)

nums = [2,10]
print(largestNumber(nums))
nums = [3,30,34,5,9]
print(largestNumber(nums)) # 9534330
nums = [34323, 3432]
print(largestNumber(nums))  # 343234323
