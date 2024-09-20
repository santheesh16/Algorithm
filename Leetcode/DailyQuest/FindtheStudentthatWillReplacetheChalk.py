import bisect
from typing import List


class Solution:
    def chalkReplacer(self, chalk: List[int], k: int) -> int:
        n = len(chalk)
        i, curr_chulk = 0, k
        while True:
            if chalk[i] <= curr_chulk:
                curr_chulk = curr_chulk - chalk[i]
            else:
                break
            if i < n - 1:
                i += 1
            else:
                i = 0
        return i

    def chalkReplacer2(self, chalk: List[int], k: int) -> int:
            for i in range(1, len(chalk)):
                chalk[i] += chalk[i-1]
            k %= chalk[-1]
            return bisect.bisect_right(chalk, k)

if __name__ == "__main__":
    sol = Solution()
    chalk = [3,4,1,2]
    print(sol.chalkReplacer2(chalk, 25))
