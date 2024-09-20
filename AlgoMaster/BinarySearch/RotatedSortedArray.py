from typing import List

def find_min_rotated(arr: List[int]) -> int:
    left , right = 0,len(arr) - 1
    while left <= right:
        mid = (left + right)//2
        if arr[mid - 1] > arr[mid]:
            return mid
        elif arr[mid] > arr[-1]:
            left = mid + 1
        else:
            right = mid - 1
    return 0

if __name__ == '__main__':
    arr = [1,2, 3, 5, 8, 0]
    res = find_min_rotated(arr)
    print(res)
    arr = [40, 50,60, 10, 20, 30]
    res = find_min_rotated(arr)
    print(res)
