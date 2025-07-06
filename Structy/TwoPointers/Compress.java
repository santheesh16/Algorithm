package TwoPointers;

public class Compress {

    public static String compress(String s) {
        int i = 0, j = 0;
        String res = "";
        while (i < s.length() && j < s.length() + 1) {
            if (j < s.length() && s.charAt(i) == s.charAt(j)) {
                j += 1;
            } else {
                int n = j - i;
                if (n != 1) {
                    res += String.valueOf(n) + String.valueOf(s.charAt(i));
                } else {
                    res += String.valueOf(s.charAt(i));
                }
                i = j;
            }

        }
        return res;
    }

    public static void main(String[] args) {
        System.out.println(compress("ccaaatsss")); // -> "2c3at3s"
    }

}
