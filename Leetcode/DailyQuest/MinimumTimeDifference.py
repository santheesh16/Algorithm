from typing import List


def findMinDifference(timePoints: List[str]) -> int:
    if len(timePoints) > 24 * 60:
        return 0

    seconds = []
    for time in timePoints:
        time = time.split(":")
        seconds.append(int(time[0]) * 60 + int(time[1]))

    seconds.sort()
    ans = seconds[0] + 24 * 60 - seconds[-1]
    for i in range(len(seconds) - 1):
        ans = min(ans, seconds[i + 1] - seconds[i])
    return ans


timePoints = ["00:00", "23:59", "00:00"]
print(findMinDifference(timePoints))
