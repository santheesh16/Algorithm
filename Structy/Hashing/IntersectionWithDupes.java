package Hashing;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class IntersectionWithDupes {

    public static List<String> intersectionWithDupes(List<String> listA, List<String> listB) {
        List<String> res = new ArrayList<>();
        List<String> listSizeLow;
        Set<String> listSet;
        if (listA.size() > listB.size()) {
            listSet = new HashSet<>(listA);
            listSizeLow = listB;
        } else {
            listSet = new HashSet<>(listB);
            listSizeLow = listA;
        }

        for (String s : listSizeLow) {
            if (listSet.contains(s)) {
                res.add(s);
            }
        }
        return res;
    }

    public static void main(String[] args) {
        System.out.println(
                intersectionWithDupes(
                        List.of("a", "b", "c", "b"),
                        List.of("x", "y", "b", "b"))); // -> ["b", "b"]

    }

}
