package Recursion;

import java.util.List;

public class SumOfLengths {

    public static int sumOfLengths(List<String> strings) {
        if (strings.size() == 0) {
            return 0;
        }
        return strings.get(0).length() + sumOfLengths(strings.subList(1, strings.size()));
    }

    public static void main(String[] args) {
        System.out.println(sumOfLengths(List.of("goat", "cat", "purple"))); // -> 13
    }

}
