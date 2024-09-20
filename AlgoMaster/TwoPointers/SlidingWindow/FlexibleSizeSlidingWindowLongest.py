from typing import List


def subarray_sum_longest(nums, target):
    window_sum, length = 0, 0
    left = 0
    for right in range(len(nums)):
        window_sum += nums[right]
        while window_sum > target:
            window_sum -= nums[left]
            left += 1
        length = min(length, right-left+1)
    return length


if __name__ == '__main__':
    nums = [int(x) for x in input().split()]
    target = int(input())
    res = subarray_sum_longest(nums, target)
    print(res)
