package Blind75;

public class ValidPalindrome {

    public boolean isPalindrome(String s) {
        StringBuilder str = new StringBuilder();
        for (char c : s.toCharArray()) {
            if (Character.isLetterOrDigit(c)) {
                str.append(Character.toLowerCase(c));
            }
        }
        return str.toString().equals(str.reverse().toString());
    }

    public static void main(String[] args) {

    }
}