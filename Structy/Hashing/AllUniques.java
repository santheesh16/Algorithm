package Hashing;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class AllUniques {

    public static boolean allUniques(List<String> items) {
        Set<String> res = new HashSet<>(items);
        return res.size() == items.size();
    }

    public static void main(String[] args) {
        System.out.println(allUniques(List.of()));
    }

}
