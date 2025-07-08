package ArraysString;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class HasSub {

    public static boolean hasSubarraySum(List<Integer> numbers, int targetSum) {
        List<Integer> prefixSum = new ArrayList<>();
        prefixSum.add(0);
        int total = 0;
        for (int num : numbers) {
            total += num;
            prefixSum.add(total);
        }

        Set<Integer> seen = new HashSet<>();

        for (int num : prefixSum) {
            int curr = num - targetSum;
            if (seen.contains(curr)) {
                return true;
            }
            seen.add(num);
        }

        System.out.println(prefixSum.toString());
        return false;
    }

    public static void main(String[] args) {
        System.out.println(hasSubarraySum(List.of(1, 3, 1, 1, 3), 2));
    }
}
