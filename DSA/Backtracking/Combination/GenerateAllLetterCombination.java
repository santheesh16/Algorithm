package Combination;

import java.util.ArrayList;
import java.util.List;

public class GenerateAllLetterCombination {

    private List<String> res = new ArrayList<>();
    private String[] phoneCom = new String[] { "", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz" };

    public List<String> letterCombinationsOfPhoneNumber(String digits) {
        if (digits.isEmpty())
            return res;
        backtrack(0, "", digits);
        return res;
    }

    private void backtrack(int i, String cur, String digits) {
        if (cur.length() == digits.length()) {
            res.add(cur);
            return;
        }
        String curLetter = phoneCom[digits.charAt(i) - '0'];
        for (char c : curLetter.toCharArray()) {
            backtrack(i + 1, cur + c, digits);
        }
    }

    public static void main(String[] args) {
        GenerateAllLetterCombination gen = new GenerateAllLetterCombination();
        System.out.println(gen.letterCombinationsOfPhoneNumber("23"));
    }
}