from typing import List


def maxDistance(arrays: List[List[int]]) -> int:
    smallest,biggest,max_distance=arrays[0][0],arrays[0][-1],0
    for i in range(1, len(arrays)):
        array = arrays[i]
        max_dis = max(max_distance, abs(array[-1] - smallest), abs(biggest - array[0]))
        smallest = min(array[0], smallest)
        biggest = max(array[-1], biggest)
    return max_distance

arrays = [[1,5],[3,4]]
print(maxDistance(arrays))