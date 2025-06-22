package Subsets;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Subsets {

    public static List<List<Integer>> subsets(List<Integer> nums) {
        List<List<Integer>> res = new ArrayList<>();
        backtrack(0, new ArrayList<>(), nums, res);
        return res;
    }

    private static void backtrack(int i, List<Integer> curr, List<Integer> nums, List<List<Integer>> res) {
        if (i == nums.size()) {
            res.add(new ArrayList<>(curr));
            return;
        }
        curr.add(nums.get(i));
        backtrack(i + 1, curr, nums, res);
        curr.remove(curr.size() - 1);
        backtrack(i + 1, curr, nums, res);
    }

    public static void main(String[] args) {
        new Subsets();
        System.out.println(Subsets.subsets(Arrays.asList(1, 2, 3)));
    }

}
