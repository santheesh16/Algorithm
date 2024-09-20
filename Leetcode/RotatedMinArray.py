
def findMin(nums):
    """
    :type nums: List[int]
    :rtype: int
    """
    n = len(nums)
    left, right =0, n - 1
    ans = 0
    while left <= right:
        mid = (left + right)//2
        if nums[mid] <= nums[-1]:
            ans = mid
            right = mid - 1
        else:
            left = mid + 1
    return ans

n = [3,4,5,1,2]
print(findMin(n))