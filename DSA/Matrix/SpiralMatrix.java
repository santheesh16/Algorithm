package DSA.Matrix;

import java.util.ArrayList;
import java.util.List;

public class SpiralMatrix {

    public List<Integer> spiralOrder(int[][] matrix) {
        int rowStart = 0, rowEnd = matrix.length - 1, colStart = 0, colEnd = matrix[0].length - 1;
        List<Integer> res = new ArrayList<>();
        while (rowEnd <= rowEnd && colStart <= colEnd) {

            for (int col = colStart; col <= colEnd; col++) {
                res.add(matrix[rowStart][col]);
            }

            rowStart++;

            for (int row = rowStart; row <= rowEnd; row++) {
                res.add(matrix[row][colEnd]);
            }

            colEnd--;
            if (rowStart <= rowEnd) {
                for (int col = colEnd; col >= colStart; col--) {
                    res.add(matrix[rowEnd][col]);
                }
            }

            rowEnd--;

            if (colStart <= colEnd) {
                for (int row = rowEnd; row >= rowStart; row--) {
                    res.add(matrix[row][colStart]);
                }
            }

            colStart++;
        }
        return res;
    }

    public static void main(String[] args) {
        System.out.println(new SpiralMatrix().spiralOrder(new int[][] { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } }));
    }
}
