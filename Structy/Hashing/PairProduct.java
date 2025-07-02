package Hashing;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PairProduct {
    public static List<Integer> pairProduct(List<Integer> numbers, int target) {
        Map<Double, Integer> prevProd = new HashMap<>();

        for (int i = 0; i < numbers.size(); i++) {
            double twoProd = (double) target / numbers.get(i);
            if (prevProd.containsKey(twoProd)) {
                return List.of(prevProd.get(twoProd), i);
            }
            prevProd.put(Double.valueOf(numbers.get(i)), i);
        }
        return null;
    }

    public static void main(String[] args) {
        System.out.println(pairProduct(List.of(3, 2, 5, 4, 1), 8));
    }
}
