package Hashing;

import java.util.ArrayList;
import java.util.List;

public class ExclusiveItems {

    public static List<Integer> exclusiveItems(List<Integer> a, List<Integer> b) {
        List<Integer> res = new ArrayList<>();

        for (int item : a) {
            if (!b.contains(item)) {
                res.add(item);
            }
        }

        for (int item : b) {
            if (!a.contains(item)) {
                res.add(item);
            }
        }
        return res;

        /*
         * Map<Integer, Integer> map = new HashMap<>();
         * 
         * for (Integer n : a) {
         * map.put(n, map.getOrDefault(n, 0) + 1);
         * }
         * for (Integer n : b) {
         * map.put(n, map.getOrDefault(n, 0) + 1);
         * }
         * 
         * for (Integer n : map.keySet()) {
         * if (map.get(n) == 1) {
         * res.add(n);
         * }
         * }
         */
    }

    public static void main(String[] args) {
        List<Integer> a = List.of(4, 2, 1, 6);
        List<Integer> b = List.of(3, 6, 9, 2, 10);
        System.out.println(exclusiveItems(a, b).toString());
        ; // -> [4,1,3,9,10]

    }
}
