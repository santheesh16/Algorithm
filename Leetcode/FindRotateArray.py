def search(nums, target):
    """
    :type nums: List[int]
    :type target: int
    :rtype: int
    """
    n = len(nums)
    left, right = 0, n - 1

    while left < right:
        mid = (left + right) // 2
        # if <= last element, then belongs to lower half
        if nums[0] <= nums[mid]:
            if nums[0] <= target <= nums[mid]:
                right = mid
            else:
                left = mid + 1
        else:
            if nums[mid] < target <= nums[-1]:
                left = mid + 1
            else:
                right = mid
    return left if nums[left] == target else -1

nums = [4,5,6,7,0,1,2]
print(search(nums, 0))