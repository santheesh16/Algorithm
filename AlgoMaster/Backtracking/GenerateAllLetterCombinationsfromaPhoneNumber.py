from typing import List


def letter_combinations_of_phone_number(digits: str) -> List[str]:
    apl = ["", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"]

    def dsf(start_index, path):
        if start_index == len(digits):
            res.append(''.join(path))
            return

        n = digits[start_index]
        for i in apl[int(n) - 1]:
            path.append(i)
            dsf(start_index + 1, path)
            path.pop()


    res = []
    dsf(0,[])
    return res


if __name__ == '__main__':
    digits = input()
    res = letter_combinations_of_phone_number(digits)
    print(' '.join(res))
