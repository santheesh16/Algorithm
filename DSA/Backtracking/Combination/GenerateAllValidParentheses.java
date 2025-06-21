package Combination;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class GenerateAllValidParentheses {

    public List<String> generateParentheses(int n) {
        List<String> res = new ArrayList<>();
        backtrack(0, new ArrayList<>(), 0, 0, n, res);
        return res;
    }

    private void backtrack(int startIndex, List<Character> path, int openCount, int closeCount, int n,
            List<String> res) {
        if (path.size() == 2 * n) {
            res.add(path.stream().map(e -> e.toString()).collect(Collectors.joining()));
            return;
        }
        if (openCount < n) {
            path.add('(');
            backtrack(startIndex + 1, path, openCount + 1, closeCount, n, res);
            path.remove(path.size() - 1);
        }
        if (closeCount < openCount) {
            path.add(')');
            backtrack(startIndex + 1, path, openCount, closeCount + 1, n, res);
            path.remove(path.size() - 1);
        }
    }

    public static void main(String[] args) {
        GenerateAllValidParentheses gLetterCombination = new GenerateAllValidParentheses();
        System.out.println(gLetterCombination.generateParentheses(2));
        System.out.println(gLetterCombination.generateParentheses(3));
    }
}
