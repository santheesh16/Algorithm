from collections import Counter
from typing import List


def minIncrementForUnique(nums: List[int]) -> int:

    countArr = [0] * (max(nums) + 1)
    res = 0
    for i in range(len(nums)):
        countArr[nums[i]] += 1
        while countArr[nums[i]] > 1:
            nums[i] += 1
            res += 1
            countArr[nums[i] - 1] -= 1
    return res

nums = [1,2,2]
print(minIncrementForUnique(nums))
