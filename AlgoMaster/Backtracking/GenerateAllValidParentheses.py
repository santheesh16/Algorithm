from typing import List


def generate_parentheses(n: int) -> List[str]:
    def dsf(start_index, path, open_count, close_count, res):
        if start_index == 2 * n:
            res.append(''.join(path))
            return
        if open_count < n:
            path.append('(')
            dsf(start_index + 1, path, open_count + 1, close_count, res)
            path.pop()
        if close_count < open_count:
            path.append(')')
            dsf(start_index + 1, path, open_count, close_count + 1, res)
            path.pop()

    ans = []
    dsf(0, [], 0, 0, ans)
    return ans


if __name__ == '__main__':
    n = int(input())
    res = generate_parentheses(n)
    for line in sorted(res):
        print(line)
