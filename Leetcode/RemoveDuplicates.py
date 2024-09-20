# MySolution

# Worked TestCase 2 [0,0,1,1,1,2,2,3,3,4] not worked Test Case 1 [1,1,2] - output: nums = [1] expected: nums = [1,2]
def removeDuplicatesMine(nums):
    r = 0
    for i in range(len(nums) - 1):
        j, k = i + 1, 0
        while j < len(nums) - r:
            if nums[i] != nums[j]:
                break
            k += 1
            j += 1
        j = i + 1
        while k != 0 and j < len(nums) - k:
            nums[j] = nums[j + k]
            j += 1
        while k != 0 and j < len(nums):
            nums[j] = '_'
            j += 1
        r += k
    return r


def removeDuplicates(nums):
    j = 1
    for i in range(1, len(nums)):
        if nums[i] != nums[i - 1]:
            nums[j] = nums[i]
            j += 1
    return j


nums = [0,0,1,1,1,2,2,3,3,4]
print(removeDuplicates(nums))
print(nums)
