def square_root(n: int) -> int:
    left, right = 0, n
    c = 0
    while left <= right:
        mid = (left + right) // 2
        if mid * mid == n:
            return mid
        elif mid * mid > n:
            c = mid
            right = mid - 1
        else:
            left = mid + 1
    return c - 1


if __name__ == '__main__':
    n = 16
    res = square_root(n)
    print(res)
