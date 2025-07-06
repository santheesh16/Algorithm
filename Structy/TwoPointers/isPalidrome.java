package TwoPointers;

public class isPalidrome {

    public static boolean isPalindrome(String s) {
        int L = 0, R = s.length() - 1;
        while (L <= R) {
            if (s.charAt(L) != s.charAt(R))
                return false;
            L++;
            R--;
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(isPalindrome("pop"));
    }
}