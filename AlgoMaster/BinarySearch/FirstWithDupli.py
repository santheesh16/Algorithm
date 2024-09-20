from typing import List


def find_first_occurrence(arr: List[int], target: int) -> int:
    left,right=0, len(arr) - 1
    boundary_index = -1
    while left <= right:
        mid = (left + right)//2
        if target == arr[mid]:
            boundary_index = mid
            right = mid - 1
        elif arr[mid] > target:
            right = mid - 1
        else:
            left = mid + 1
    return boundary_index


if __name__ == '__main__':
    arr = [4,6,7,7,7,20]
    target = 8
    res = find_first_occurrence(arr, target)
    print(res)
    # arr = [2, 3, 5, 7, 11, 13, 17, 19]
    # target = 6
    # res = find_first_occurrence(arr, target)
    # print(res)
