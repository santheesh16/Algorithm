package Blind75;

public class MinimuminRotatedSortedArray {
    public static void main(String[] args) {
        int[] nums = new int[]{3,4,5,1,2};

        int n = nums.length;
        int L = 0, R = n;
        int res = 0;
        while (L <= R){
            int mid = (L + R)/2;
            if (nums[mid] <= nums[n - 1]) {
                res = mid;
                R = mid - 1;
            }
            else
            {   
                L = mid + 1;
            }
        }
        System.out.println(nums[res]);
    }
}
