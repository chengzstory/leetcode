package day_3;

import util.MatrixUtil;

/**
 * Created by chengzstory on 2018/8/2.
 *
 * Link: https://leetcode.com/problems/flipping-an-image/description/
 *
 * Difficulty: Easy
 *
 * Acceptance: 69.4%
 */
public class Flipping_An_Image {

    public static int[][] flipAndInvertImage(int[][] A) {
        flipImage(A);
        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < A[i].length; j++) {
                A[i][j] = Math.abs(A[i][j] - 1);
            }
        }
        return A;
    }

    public static void flipImage(int[][] A) {
        for (int i = 0; i < A.length; i++) {
             for (int j = 0; j < A[i].length / 2; j++) {
                 swap(A[i], j, A[i].length - 1 - j);
             }
        }
    }

    public static void swap(int[] arr, int i, int j) {
        int tmp = arr[i];
        arr[i] = arr[j];
        arr[j] = tmp;
    }

    public static void main(String args[]) {
        MatrixUtil.printMatrix(flipAndInvertImage(new int[][]{{1, 1, 0, 0}, {1, 0, 0, 1}, {0, 1, 1, 1}, {1, 0, 1, 0}}));
    }
}
