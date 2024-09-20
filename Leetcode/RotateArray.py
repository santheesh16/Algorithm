# Worked TestCase 1 [1,2,3,4,5,6,7] not worked Test Case 2 [-1,-100,3,99] - output: nums = [99,-1,-100,3] expected: nums = [3,99,-1,-100]
def rotateArray(nums, k):

    n = len(nums)
    i = 0
    while i < k+1:
        a = nums[0]
        for j in range(n):
            if j + 1 < n:
                 nums[j] = nums[j + 1]
            else:
                nums[-1] = a
        i+=1
    return nums

def rotateArr(nums, k):

    n = len(nums)
    k =  k % n
    nums[:]=nums[-k:]+nums[:-k]

    print(nums)
    # [1,2,3,4,5,6,7] ->
    # [-1,-100,3,99] ->

nums1= [1,2,3,4,5,6,7]
nums2= [-1,-100,3,99]

print(rotateArr(nums1, 3))
print(rotateArr(nums2, 2))