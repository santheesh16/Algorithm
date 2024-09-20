from typing import List


def first_not_smaller(arr: List[int], target: int) -> int:
    left, right = 0, len(arr) - 1
    first_ele = -1
    while left <= right:
        mid = (left + right) // 2
        if target <= arr[mid]:
            first_ele = mid
            right = mid - 1
        else:
            left = mid + 1
    return first_ele


if __name__ == '__main__':
    arr = [2, 3, 5, 7, 11, 13, 17, 19]
    target = 6
    res = first_not_smaller(arr, target)
    print(res)
    arr = [1, 3, 3, 5, 8, 8, 10]
    target = 2
    res = first_not_smaller(arr, target)
    print(res)
