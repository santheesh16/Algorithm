from typing import List

def subarray_sum(arr: List[int], target: int) -> List[int]:
    # prefix_sum 0 happens when we have an empty array
    prefix_sums = {0: 0}
    cur_sum = 0
    for i in range(len(arr)):
        cur_sum += arr[i]
        complement = cur_sum - target
        if complement in prefix_sums:
            return [prefix_sums[complement], i + 1]
        prefix_sums[cur_sum] = i + 1

if __name__ == '__main__':
    arr = [int(x) for x in input().split()]
    target = int(input())
    res = subarray_sum(arr, target)
    print(' '.join(map(str, res)))