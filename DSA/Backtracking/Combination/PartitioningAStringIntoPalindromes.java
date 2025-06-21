package Combination;

import java.util.ArrayList;
import java.util.List;

public class PartitioningAStringIntoPalindromes {

    public static boolean isPalindrome(String s) {
        int l = 0, r = s.length() - 1;
        while (l < r) {
            if (s.charAt(l) != s.charAt(r))
                return false;
            l++;
            r--;
        }
        return true;
    }

    public List<List<String>> partition(String s) {
        List<List<String>> res = new ArrayList<>();
        backtrack(0, new ArrayList<String>(), res, s);
        return res;
    }

    private void backtrack(int start, ArrayList<String> part, List<List<String>> res, String s) {
        if (start == s.length()) {
            List<String> list = new ArrayList<String>(part);
            res.add(list);
            return;
        }
        for (int end = start; end < s.length(); end++) {
            if (isPalindrome(s.substring(start, end + 1))) {
                part.add(s.substring(start, end + 1));
                backtrack(end + 1, part, res, s);
                part.remove(part.size() - 1);
            }
        }
    }

    public static void main(String[] args) {
        PartitioningAStringIntoPalindromes palindromes = new PartitioningAStringIntoPalindromes();
        System.out.println(palindromes.partition("aab"));
    }
}
