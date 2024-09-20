
def minSubArrayLen(target, nums):
    L,R = 0,0
    min_length = float('inf')
    window_sum = 0
    while R < len(nums):
        window_sum += nums[R]
        while window_sum >= target:
            min_length = min(min_length, R - L + 1)
            window_sum -= nums[L]
            L += 1
        R += 1
    return 0 if min_length == float('inf') else min_length

if __name__ == '__main__':
    target = int(input())
    nums = [int(x) for x in input().split()]
    print(minSubArrayLen(target, nums))