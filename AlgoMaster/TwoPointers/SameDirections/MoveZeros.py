from typing import List

def move_zeros(nums: List[int]) -> None:
    slow = 0
    for fast in range(1, len(nums)):
        if nums[fast] != 0 and nums[slow] == 0:
            nums[slow], nums[fast] = nums[fast], nums[slow]
            slow += 1
        elif nums[slow] != 0:
            slow += 1
    pass

if __name__ == '__main__':
    nums = [int(x) for x in input().split()]
    move_zeros(nums)
    print(' '.join(map(str, nums)))
