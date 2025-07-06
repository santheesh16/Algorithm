package TwoPointers;

public class Uncompress {
    public static String uncompress(String s) {
        int i = 0, j = 0;
        String nums = "012345789";
        String res = "";
        while (j < s.length()) {
            if (nums.contains(String.valueOf(s.charAt(j)))) {
                j += 1;
            } else {
                int n = Integer.valueOf(s.substring(i, j));
                for (int k = 0; k < n; k++) {
                    res += s.charAt(j);
                }
                j += 1;
                i = j;
            }
        }
        return res;
    }

    public static void main(String[] args) {
        System.out.println(uncompress("2t4d1u"));
    }

}
