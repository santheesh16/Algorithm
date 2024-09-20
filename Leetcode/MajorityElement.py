def majorityElement(nums):
    nums.sort()
    n = len(nums)
    return nums[n//2]

nums =[2,3,2]
print(majorityElement(nums))