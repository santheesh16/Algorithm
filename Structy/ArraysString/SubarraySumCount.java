package ArraysString;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SubarraySumCount {

    public static int subarraySumCount(List<Integer> numbers, int targetSum) {
        List<Integer> prefixSums = new ArrayList<>();
        prefixSums.add(0);
        int total = 0;
        for (int num : numbers) {
            total += num;
            prefixSums.add(total);
        }
        Map<Integer, Integer> countMap = new HashMap<>();
        int count = 0;
        for (int n : prefixSums) {
            int curr = n - targetSum;
            if (countMap.containsKey(curr)) {
                count += countMap.get(curr);
            }
            countMap.put(n, countMap.getOrDefault(n, 0) + 1);
        }
        return count;
    }

    public static void main(String[] args) {
        subarraySumCount(
                List.of(1, 3, 1, 4, -2, 3),
                5); // -> 3

    }

}
