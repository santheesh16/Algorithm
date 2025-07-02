package Hashing;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Intersection {

    public static List<Integer> intersection(List<Integer> listA, List<Integer> listB) {
        Set<Integer> set = new HashSet<>();

        for (Integer n : listA) {
            set.add(n);
        }
        List<Integer> res = new ArrayList<>();
        for (Integer n : listB) {
            if (set.contains(n)) {
                res.add(n);
            }
        }
        return res;
    }

    public static void main(String[] args) {
        List<Integer> a = List.of(4, 2, 1, 6);
        List<Integer> b = List.of(3, 6, 9, 2, 10);
        System.out.println(intersection(a, b).toString()); // -> [2,6]

    }

}
