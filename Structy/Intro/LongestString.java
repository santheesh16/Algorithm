package Intro;

public class LongestString {
    public static String longestWord(String sentence) {
        String[] str = sentence.split(" ");
        String res = "";
        for (String s : str) {
            if (res.length() < s.length()) {
                res = s;
            }
        }
        System.out.println(res);
        return res;
    }

    public static void main(String[] args) {
        longestWord("what a wonderful world"); // -> "wonderful"
        longestWord("have a nice day"); // -> "nice"
        longestWord("the quick brown fox jumped over the lazy dog"); // -> "jumped"
        longestWord("who did eat the ham"); // -> "ham"
        longestWord("potato"); // -> "potato"
    }

}
