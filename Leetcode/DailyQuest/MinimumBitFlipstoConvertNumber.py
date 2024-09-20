
class MinimumBitFlipstoConvertNumber:
    def minBitFlips(self, start: int, goal: int) -> int:
        diff = start ^ goal
        count_flips = 0
        while diff > 0:
            count_flips += diff & 1
            diff >>= 1
        return count_flips


minBit = MinimumBitFlipstoConvertNumber()
start, goal = 10, 7
print(minBit.minBitFlips(start, goal))
