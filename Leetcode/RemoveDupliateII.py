
def remveDuplicate(num):
    k,v=0,
    for i in range(len(num) - 1):
        for j in range(i+1, len(num) -1):
            if num[i] == num[j] and k <= 0:
                while j < len(num) - 1:
                    num[j] = num[j + 1]
                num[j] = '_'
            k -= 1
            v += k
            j += 1
    return num

def removeDup(nums):
    n = len(nums)
    if n < 3:
        return n
    j = 2
    for i in range(2, len(nums)):
        if nums[i] != nums[j - 2]:
            nums[j] = nums[i]
            j += 1
    return j
def removeDuplicates(nums):
    i=0
    j=1
    k=2
    count=0
    for _ in range (0, len(nums)-2):
        if (nums[i]==nums[j] and nums[j]==nums[k]):
            nums[i]= 1000000
            count=count+1
        i=i+1
        j=j+1
        k=k+1
    nums.sort()
    for p in range(0,count):
        nums.pop(-1)
    return k

num = [0,0,1,1,2,2,2,3,3]
print(removeDuplicates(num))