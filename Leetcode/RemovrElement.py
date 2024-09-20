

def removeElement(nums, val):
    j= 0
    for i in range(0, len(nums)):
        if nums[i] != val:
            nums[j] = nums[i]
            j += 1
    for k in range(j, len(nums)):
        nums[k] = '_'
    return j

nums = [0,1,2,2,3,0,4,2]
print(removeElement(nums, 2))