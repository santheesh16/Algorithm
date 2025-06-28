package Blind75;

public class SetMatrixZeroes {

    public void setZeroes(int[][] matrix) {

        int[] row = 0;
        for (int col = 0; col < matrix.length; col++) {
            int curr = matrix[row][col];
            if (curr > 1) {
                matrix[row][0] = 0;
            } else {
                firstZero = true;
            }
        }

        if (matrix[0][0] == 0) {

        }

    }

    public static void main(String[] args) {

    }
}