from typing import List


class Solution:
    def construct2DArray(self, original: List[int], m: int, n: int) -> List[List[int]]:

        two_arr, k = [], 0
        if m * n == len(original):
            for _ in range(m):
                new_row = []
                for _ in range(n):
                    new_row.append(original[k])
                    k += 1
                two_arr.append(new_row)
        else:
            return [[]]
        return two_arr


if __name__ == "__main__":
    sol = Solution()
    arr = [1, 2, 3, 4]
    print(sol.construct2DArray(arr, 2, 2))
