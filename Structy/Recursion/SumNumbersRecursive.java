package Recursion;

import java.util.List;

public class SumNumbersRecursive {
    public static int recursion(int i, int res, List<Integer> numbers) {
        if (i == -1) {
            return res;
        }
        res += numbers.get(i);
        return recursion(i - 1, res, numbers);
    }

    public static int sumNumbersRecursive(List<Integer> numbers) {
        if (numbers.size() == 0) {
            return 0;
        }
        return numbers.get(0) + sumNumbersRecursive(numbers.subList(1, numbers.size()));
    }

    public static void main(String[] args) {
        sumNumbersRecursive(List.of(5, 2, 9, 10)); // -> 26
    }
}
