package Leetcode.DailyQuest;

public class MaximumDifference {
    public int maximumDifference(int[] nums) {
        int L = 0, R = 1, n = nums.length, res = 0;
        while (R < n - 1){
            if(nums[L] > nums[R]){
                L = R;
            }
            R++;
            res = Math.max(res, nums[L] - nums[R]);
        }
        return res;
    }

    public static void main(String[] args) {
        MaximumDifference maximumDifference = new MaximumDifference();
        System.out.println(maximumDifference.maximumDifference(new int[]{7,1,5,4}));
    }
}
