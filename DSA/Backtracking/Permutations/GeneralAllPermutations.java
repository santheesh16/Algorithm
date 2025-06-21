package Permutations;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class GeneralAllPermutations {

    public List<String> permutations(String s) {
        char[] letters = s.toCharArray();
        List<String> res = new ArrayList<>();
        backtrack(0, new ArrayList<>(), new boolean[letters.length], res, letters);
        return res;
    }

    private void backtrack(int startIndex, List<Character> path, boolean[] used, List<String> res,
            char[] letters) {
        if (startIndex == letters.length) {
            res.add(path.stream().map(e -> e.toString()).collect(Collectors.joining()));
            return;
        }

        for (int i = 0; i < used.length; i++) {
            if (used[i]) {
                continue;
            }
            path.add(letters[i]);
            used[i] = true;
            backtrack(startIndex + 1, path, used, res, letters);
            path.remove(path.size() - 1);
            used[i] = false;
        }
    }

    public static void main(String[] args) {
        GeneralAllPermutations gPermutations = new GeneralAllPermutations();
        System.out.println(gPermutations.permutations("abc"));
    }
}
