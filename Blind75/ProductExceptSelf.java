package Blind75;

import java.util.Arrays;

public class ProductExceptSelf {
    public static void main(String[] args) {
        int[] nums = new int[]{1,2,3,4};
        int[] product = new int[nums.length];
        product[0] = 1;
        for (int i = 1; i < nums.length; i++) {
            product[i] = product[i - 1] * nums[i - 1];
        }
        int postfix = 1;
        for (int i = nums.length - 1; i >= 0; i--) {
            product[i] *= postfix;
            postfix *= nums[i]; 
        }
        System.out.println(Arrays.toString(product));
    }
}
