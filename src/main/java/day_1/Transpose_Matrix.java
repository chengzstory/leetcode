package day_1;

import util.MatrixUtil;

/**
 * Created by chengzstory on 2018/7/27.
 *
 * Link: https://leetcode.com/problems/transpose-matrix/description/
 *
 * Difficulty: Easy
 *
 * Acceptance: 66.9%
 */
public class Transpose_Matrix {
    public static int[][] transpose(int[][] A) {
        if (A.length == 0) {
            return new int[0][0];
        }
        int rows = A.length;
        int cols = A[0].length;
        int[][] tpMatrix = new int[cols][rows];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                tpMatrix[j][i] = A[i][j];
            }
        }
        return tpMatrix;
    }

    public static void main(String args[]) {
        int[][] matrix = new int[][]{{1, 2, 3}, {4, 5, 6}};
        MatrixUtil.printMatrix(transpose(matrix));
    }
}
