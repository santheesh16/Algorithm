from typing import List


def subarray_sum_fixed(nums: List[int], k: int) -> int:
    curr_max_sub = window_sum = sum(nums[:k])
    for i in range(len(nums) - k):
        curr_max_sub -= nums[i]
        curr_max_sub += nums[i+k]
        window_sum = max(window_sum, curr_max_sub)
    return window_sum


if __name__ == '__main__':
    nums = [int(x) for x in input().split()]
    k = int(input())
    res = subarray_sum_fixed(nums, k)
    print(res)
