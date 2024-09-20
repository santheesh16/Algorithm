from typing import List


class Solution:
    def missingRolls(self, rolls: List[int], mean: int, n: int) -> List[int]:
        m=len(rolls)
        sum_rolles=sum(rolls)
        total=(n+m)*mean
        miss=total-sum_rolles
        if miss>6*n or miss<n: return []
        q,r=divmod(miss, n)
        return [q+1]*r+[q]*(n-r)



if __name__ == "__main__":
    sol = Solution()
    # rolls, mean, n = [3,5,3], 5, 3
    # print(sol.missingRolls(rolls, mean, n))
    rolls, mean, n = [3, 2, 4, 3], 4, 2
    print(sol.missingRolls(rolls, mean, n))
    rolls, mean, n = [1, 5, 6], 3, 4
    print(sol.missingRolls(rolls, mean, n))
    # rolls, mean, n = [1, 2, 3, 4], 6, 4
    # print(sol.missingRolls(rolls, mean, n))
