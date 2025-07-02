package Structy.Hashing;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PairSum {

    public static List<Integer> pairSum(List<Integer> numbers, int target) {
        Map<Integer, Integer> hashSet = new HashMap<>();
        for (int i = 0; i < numbers.size(); i++) {
            int curr = target - numbers.get(i);
            if (hashSet.containsKey(curr)) {
                return List.of(hashSet.get(curr), i);
            }
           hashSet.put(numbers.get(i), i);
        }
    return null;
  }

    public static void main(String[] args) {        
        System.out.println(pairSum(List.of(3, 2, 5, 4, 1), 8));
    }
}
