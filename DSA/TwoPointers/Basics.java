import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;

public class Basics {

    public static int sumOfDigits(int n){
        int sum = 0;
        while (n > 0) {
            sum += n % 10; 
            n /= 10;
        }
        return sum;
    }

    // Function to return min swaps required to sort by digit sums
    public static int minSwaps(int[] nums) {
        int n = nums.length;

        // Step 1: Create array of [original index, value, digit sum]
        int[][] arr = new int[n][3];
        for (int i = 0; i < n; i++) {
            arr[i][0] = i;
            arr[i][1] = nums[i];
            arr[i][2] = sumOfDigits(nums[i]);
        }

        // Step 2: Sort based on digit sum
        Arrays.sort(arr, Comparator.comparingInt(a -> a[2]));

        // Step 3: Count minimum swaps required to move from original index to sorted index
        boolean[] visited = new boolean[n];
        int swaps = 0;

        for (int i = 0; i < n; i++) {
            if (visited[i] || arr[i][0] == i)
                continue;

            int cycleSize = 0;
            int j = i;
            while (!visited[j]) {
                visited[j] = true;
                j = arr[j][0];
                cycleSize++;
            }
            if (cycleSize > 1) {
                swaps += (cycleSize - 1);
            }
        }

        return swaps;
    }

    public static void main(String[] args) {
        int[] nums = new int[]{18, 43, 34, 16};  // digit sums: 9, 7, 7, 7
        System.out.println("Min swaps to sort by digit sum: " + minSwaps(nums));
    }
}
