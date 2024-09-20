
def JumpEnd(nums):
    index,n = 0,len(nums) - 1
    i = 0
    while i < n:
        if index != len(nums) and nums[i] != 0:
            index = nums[i]
        i += index
    return index == len(nums)

def canJump(nums):
    last_position = 0
    for i in range(len(nums)):
        if i > last_position:
            return False
        last_position = max(last_position, i + nums[i])
        if last_position >= len(nums) - 1:
            return True
    return last_position >= len(nums) - 1

# Intuition
# Imagine you have a car, and you have some distance to travel (the length of the array).
# This car has some amount of gasoline, and as long as it has gasoline, it can keep traveling on this road (the array).
# Every time we move up one element in the array, we subtract one unit of gasoline.
# However, every time we find an amount of gasoline that is greater than our current amount, we "gas up" our car by replacing our current amount of gasoline with this new amount.
# We keep repeating this process until we either run out of gasoline (and return false), or we reach the end with just enough gasoline (or more to spare), in which case we return true.
# Note: We can let our gas tank get to zero as long as we are able to gas up at that immediate location (element in the array) that our car is currently at.
def canJump(nums):

    jumps = nums[0]
    for i in nums:
        if jumps < 0:
            return False
        if i > jumps:
            jumps = i
        jumps -= 1
    return True

nums = [2,3,1,1,4]
print(canJump(nums))
nums = [3,2,1,0,4]
print(canJump(nums))
nums = [2, 0]
print(canJump(nums))