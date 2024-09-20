from typing import List


def permutations(letters: str) -> List[str]:
    n = len(letters)

    def dsf(start_index, path, used, res):
        if start_index == n:
            res.append(''.join(path))
            return
        for i, letter in enumerate(letters):
            if used[i]:
                continue
            path.append(letter)
            used[i] = True
            dsf(start_index + 1, path, used, res)
            path.pop()
            used[i] = False
    res = []
    dsf(0, [], [False] * len(letters), res)
    return res


if __name__ == '__main__':
    letters = input()
    res = permutations(letters)
    for line in sorted(res):
        print(line)
