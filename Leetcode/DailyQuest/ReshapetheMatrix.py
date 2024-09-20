from typing import List


class Solution:
    def matrixReshape(self, mat: List[List[int]], r: int, c: int) -> List[List[int]]:
        flatten = []
        new_mat = []
        for row in mat:
            for num in row:
                flatten.append(num)
        print(flatten[0:2])
        m, n = 0, 0
        if len(flatten) == r * c:
            for row_index in range(r):
                new_mat.append(flatten[row_index * c: row_index * c + c])
            return new_mat
        else:
            return mat


if __name__ == "__main__":
    sol = Solution()
    arr = [[1, 2], [3, 4]]

    print(sol.matrixReshape(arr, 1, 4))
