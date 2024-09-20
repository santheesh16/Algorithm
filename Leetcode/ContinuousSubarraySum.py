from typing import List


class ContinuousSubarraySum:
    def checkSubarraySum(self, nums: List[int], k: int) -> bool:
        s, prev_d, set_d = 0, 0, set()
        for num in nums:
            s += num
            d = s%k
            if d in set_d:
                return True
            set_d.add(prev_d)
            prev_d = d
        return False

nums = [23,2,4,6,6]
k = 7
count = ContinuousSubarraySum()
print(count.checkSubarraySum(nums,k))