from typing import List

def peak_of_mountain_array(arr: List[int]) -> int:
    left,right=0,len(arr)-1
    res = -1
    while left <= right:
        mid = (left + right)//2
        if mid == len(arr) - 1 or arr[mid] > arr[mid + 1]:
            res = mid
            right = mid - 1
        else:
            left = mid + 1
    return res

def peak_of_mountain_array(arr: List[int]) -> int:
    alen = len(arr)
    left, right = 0, alen - 1
    boundary_index = -1

    while left <= right:
        mid = (left + right) // 2
        if mid == alen - 1 or arr[mid] > arr[mid + 1]:
            boundary_index = mid
            right = mid - 1
        else:
            left = mid + 1

    return boundary_index

if __name__ == '__main__':
    arr = [0,1,2,12,22,32,42,52,62,72,82,92,102,112,122,132,133,132,111,0]
    res = peak_of_mountain_array(arr)
    print(res)
