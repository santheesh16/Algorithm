from typing import List


def canJump(nums: List[int]) -> bool:

    c=0
    for i in nums:
        if c<0:
            return False
        elif i>c:
            c=i
        c-=1
    return True

# nums =[3,2,1,0,4]
# print(canJump(nums))
# nums =[2,3,1,1,4]
# print(canJump(nums))
nums =[0,1]
print(canJump(nums))