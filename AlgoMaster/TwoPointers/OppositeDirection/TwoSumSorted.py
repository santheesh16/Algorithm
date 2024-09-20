from typing import List


def two_sum_sorted(arr: List[int], target: int) -> List[int]:
    L, R = 0, len(arr) - 1
    while L < R:
        if arr[L] + arr[R] == target:
            return [L,R]
        elif arr[L] + arr[R] < target:
            L += 1
        else:
            R -= 1
    return []



if __name__ == '__main__':
    arr = [2, 3, 4, 5, 8, 11, 18]
    target = 8
    res = two_sum_sorted(arr, target)
    print(' '.join(map(str, res)))
