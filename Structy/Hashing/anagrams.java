package Hashing;

import java.util.HashMap;

public class anagrams {

    public static HashMap<Character, Integer> charCount(String s) {
        HashMap<Character, Integer> count = new HashMap<Character, Integer>();
        for (char c : s.toCharArray()) {
            count.put(c, count.getOrDefault(c, 0) + 1);
        }
        return count;
    }

    public static boolean anagrams(String s1, String s2) {
        return charCount(s1).equals(charCount(s2));
    }
    /*
     * public static boolean anagrams(String s1, String s2) {
     * if (s1.length() != s2.length()) {
     * return false;
     * }
     * int[] count = new int[26];
     * for (int i = 0; i < s1.length(); i++) {
     * count[s1.charAt(i) - 'a']++;
     * count[s2.charAt(i) - 'a']--;
     * }
     * for (int i = 0; i < 26; i++) {
     * if (count[i] != 0) {
     * return false;
     * }
     * }
     * return true;
     * }
     */

    public static void main(String[] args) {
        anagrams("restful", "fluster"); // -> true
    }

}
