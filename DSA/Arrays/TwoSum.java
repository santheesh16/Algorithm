import java.util.HashMap;

public class TwoSum {
    public static void main(String[] args) {
        int[] nums = {2, 7, 11, 15};
        int target = 9;
        int[] result = twoSum(nums, target);
        System.out.println("Indices: " + result[0] + ", " + result[1]);
    }

    private static int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> prevMap = new HashMap<>();
        for (int i =0 ;i < nums.length;i++){
            int diff = target - nums[i];
            if(prevMap.containsKey(diff)){
                return new int[] {prevMap.get(diff), i};
            }
            prevMap.put(nums[i], i);
        }
        return new int[0];
    }
}