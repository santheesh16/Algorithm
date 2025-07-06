package TwoPointers;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class FiveSort {

    public static List<Integer> fiveSort(List<Integer> array) {

        int n = array.size();
        int i = 0, j = 1;
        while (j < n) {
            if (array.get(j) != 5) {
                int temp = array.get(i);
                array.set(i, array.get(j));
                array.set(j, temp);
                i++;
            } else if (array.get(i) != 5) {
                i = j;
            }
            j++;
        }
        return array;
    }

    public static List<Integer> fiveSortStructy(List<Integer> array) {

        int i = 0, j = array.size() - 1;
        while (i < j) {
            if (array.get(j) == 5) {
                j -= 1;
            } else if (array.get(i) != 5) {
                i += 1;
            } else {
                Collections.swap(array, i, j);
            }
        }
        return array;
    }

    public static void main(String[] args) {
        List<Integer> array = new ArrayList<>(List.of(12, 5, 1, 5, 12, 7));
        System.out.println(fiveSortStructy(array));
        // -> [0, 5]

    }

}
