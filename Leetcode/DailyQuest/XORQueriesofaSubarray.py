from typing import List


class XORQueriesofaSubarray:
    def xorQueries(self, arr: List[int], queries: List[List[int]]) -> List[int]:

        print(8^2^10)
        querieSum,res =0, []
        for querie in queries:
            for i in range(querie[0],querie[1]+1):
                querieSum=querieSum^arr[i]
            res.append(querieSum)
            querieSum =0
        return res


xOR = XORQueriesofaSubarray()
arr = [1,3,4,8]
queries = [[0,1],[1,2],[0,3],[3,3]]
print(xOR.xorQueries(arr,queries))
arr = [4,8,2,10]
queries = [[2,3],[1,3],[0,0],[0,3]]
print(xOR.xorQueries(arr,queries))