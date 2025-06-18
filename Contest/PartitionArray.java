package Contest;

import java.util.HashSet;
import java.util.Set;

public class  PartitionArray {

    public static boolean checkEqualPartitions(int[] nums, long target) {
        int products = 1;
        for (int n : nums) {
            products *= n;
        }
        return products/target == target;

    }
    public static void main(String[] args) {
        int[] nums = new int[]{3,1,6,8,4};
        int target = 24;
        System.out.println(checkEqualPartitions(nums, target));
    }
}
