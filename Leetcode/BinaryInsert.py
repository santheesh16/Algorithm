def searchInsert(nums, target):
    """
    :type nums: List[int]
    :type target: int
    :rtype: int
    """

    n = len(nums)
    left,right = 0, n - 1
    while left <= right:
        mid = (left+right)//2
        if nums[mid] == target:
            return mid
        elif nums[mid] < target:
            left = mid + 1
        else:
            right = mid - 1
    # print(mid, left, right)
    # print(mid, left ,right)
    if nums[mid] > target:
        mid = mid - 1
    else:
        mid = mid + 1
    return mid

if __name__ == '__main__':
    # newspapers_read_times = [1,3,5,6]
    # num_coworkers = 0
    # res = searchInsert(newspapers_read_times, num_coworkers)
    # print(res)
    newspapers_read_times = [1,3,5,6]
    num_coworkers = 0
    res = searchInsert(newspapers_read_times, num_coworkers)
    print(res)