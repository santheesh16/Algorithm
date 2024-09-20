from typing import List


def find_boundary(arr: List[bool]) -> int:
    left, right = 0, len(arr) - 1
    mid = (left + right) // 2
    boundary_index = -1
    while left <= right:
        mid = (left + right) // 2
        if arr[mid]:
            boundary_index = mid
            right = mid - 1
        else:
            left = mid + 1
    return boundary_index


def feasible(mid):
    pass


def binary_search(arr: List[int], target: int) -> int:
    left, right = 0, len(arr) - 1
    first_true_index = -1
    while left <= right:
        mid = (left + right) // 2
        if feasible(mid):
            first_true_index = mid
            right = mid - 1
        else:
            left = mid + 1

    return first_true_index

if __name__ == '__main__':
    arr = [False, False, True, True, True]
    res = find_boundary(arr)
    print(res)
    arr = [False, True, True, True, True]
    res = find_boundary(arr)
    print(res)
