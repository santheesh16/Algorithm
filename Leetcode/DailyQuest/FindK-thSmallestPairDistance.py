from typing import List


def smallestDistancePair(nums: List[int], k: int) -> int:
    nums.sort()
    n = len(nums)
    low, high = 0, nums[-1] - nums[0]

    def count_pairs(max_distance):
        count, j = 0, 0
        for i in range(n):
            while j < n and nums[j] - nums[i] <= max_distance:
                j += 1
            count += j - i - 1
        return count

    while low < high:
        mid = (low + high) // 2
        if count_pairs(mid) < k:
            low = mid + 1
        else:
            high = mid

    return low
def smallestDistancePairOld(nums: List[int], k: int) -> int:
    n = len(nums)
    slow, fast = 0, 1
    f_point, s_point = 0, 0
    res = []

    while slow < n - 1:
        f_point = nums[slow]
        while fast < n:
            s_point = nums[fast]
            res.append(abs(s_point - f_point))
            fast += 1
        slow += 1
        f_point = nums[slow]
        res.append(abs(f_point - s_point))
    res.sort()
    return res[k - 1]


nums = [9, 10, 7, 10, 6, 1, 5, 4, 9, 8]
k = 18
print(smallestDistancePair(nums, k))
