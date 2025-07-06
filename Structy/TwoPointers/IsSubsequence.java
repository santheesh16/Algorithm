package TwoPointers;

public class IsSubsequence {

    public static boolean isSubsequence(String string1, String string2) {
        if (string1.length() > string2.length()) {
            return false;
        }
        int L = 0, R = 0;
        while (R < string2.length()) {
            if (L == string1.length()) {
                return true;
            } else if (string1.charAt(L) == string2.charAt(R)) {
                L++;
                R++;
            } else {
                R++;
            }
        }
        return L == string1.length();
    }

    public static void main(String[] args) {
        // System.out.println(isSubsequence("bde", "abcdef")); // -> true
        System.out.println(isSubsequence("ser", "super")); // -> true
    }
}
