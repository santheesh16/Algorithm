package ArraysString;

public class MergeSort {

    public static void mergeSort(int[] nums) {
        int length = nums.length;
        if (length <= 1) {
            return;
        }
        int mid = length / 2;
        int[] leftArr = new int[mid];
        int[] rightArr = new int[length - mid];
        for (int i = 0; i < length; i++) {
            if (i < mid) {
                leftArr[i] = nums[i];
            } else {
                rightArr[i - mid] = nums[i];
            }
        }
        mergeSort(leftArr);
        mergeSort(rightArr);
        mergeSort(leftArr, rightArr, nums);

    }

    private static void mergeSort(int[] leftArr, int[] rightArr, int[] nums) {
        int leftSize = leftArr.length;
        int rightSize = rightArr.length;
        int i = 0, j = 0, k = 0;
        while (i < leftSize && j < rightSize) {
            if (leftArr[i] <= rightArr[j]) {
                nums[k] = leftArr[i];
                i++;
            } else {
                nums[k] = leftArr[j];
                j++;
            }
            k++;
        }

        while (i < leftSize) {
            nums[k] = leftArr[i];
            i++;
            k++;
        }
        while (j < rightSize) {
            nums[k] = rightArr[j];
            j++;
            k++;
        }
    }

    public static void main(String[] args) {

    }
}
