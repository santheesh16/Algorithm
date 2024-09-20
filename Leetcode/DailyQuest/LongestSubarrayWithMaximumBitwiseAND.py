from typing import List


def longestSubarray(nums: List[int]) -> int:

    maxi = float('-inf')
    count = 0
    ans = 0

    for num in nums:
        if num > maxi:
            maxi = num
            count = 1
            ans = 1
        elif num == maxi:
            count += 1
        else:
            count = 0

        ans = max(ans, count)

    return ans
nums = [1,2,3,3,2,2]
# print(longestSubarray(nums))
print(1 & 1)
print(2 & 2)
print(3 & 3)