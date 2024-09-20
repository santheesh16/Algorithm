from typing import List


def permute(nums):
    n = len(nums)

    def dsf(start_index, path, used, res):
        if start_index == len(nums):
            res.append(path)
            return
        for i, letter in enumerate(nums):
            if used[i]:
                continue
            path.append(letter)
            used[i] = True
            dsf(start_index + 1, path, used, res)
            path.pop()
            used[i] =False

    res = []
    dsf(0, [], [False] * n, res)
    return res


if __name__ == '__main__':
    nums = [1, 2, 3]
    res = permute(nums)
    for line in sorted(res):
        print(line)
