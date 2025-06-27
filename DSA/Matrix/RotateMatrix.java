package DSA.Matrix;

import java.util.Arrays;

public class RotateMatrix {

    public void rotate(int[][] matrix) {

        int n = matrix.length;
        for (int row = 0; row < (n + 1) / 2; row++) {
            for (int col = 0; col < n / 2; col++) {

                // temp = bottom left
                int temp = matrix[n - 1 - col][row];

                // bottom left = bottom right
                matrix[n - 1 - col][row] = matrix[n - 1 - row][n - col - 1];

                // bottom right = top right
                matrix[n - 1 - row][n - col - 1] = matrix[col][n - 1 - row];

                // top right = top left
                matrix[col][n - 1 - row] = matrix[row][col];

                // top left = temp
                matrix[row][col] = temp;

            }
        }
        for (int[] is : matrix) {
            System.out.println(Arrays.toString(is));
        }
    }

    public static void main(String[] args) {
        new RotateMatrix().rotate(new int[][] { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } });
    }

}
