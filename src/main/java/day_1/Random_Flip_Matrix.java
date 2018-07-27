package day_1;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by chengzstory on 2018/7/27.
 *
 * Link: https://leetcode.com/problems/random-flip-matrix/description/
 *
 * Difficulty: Easy
 *
 * Acceptance: N/A
 */
public class Random_Flip_Matrix {
    int[][] matrix;
    int rows;
    int cols;
    List<int[]> indexs;
    public Random_Flip_Matrix(int n_rows, int n_cols) {
        this.rows = n_rows;
        this.cols = n_cols;
        matrix = new int[n_rows][n_cols];
        initIndexs();
    }

    // Memory Limit Exceeded
    public int[] flip() {
        if (indexs.size() == 0) {
            return null;
        }
        int random = (int) (Math.random() * indexs.size());
        int array[] = indexs.get(random);
        matrix[array[0]][array[1]] = 1;
        indexs.remove(random);
        return array;
    }

    public void reset() {
        matrix = new int[rows][cols];
        initIndexs();
    }

    public void initIndexs() {
        indexs = new ArrayList<>();
        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix[0].length; col++) {
                indexs.add(new int[]{row, col});
            }
        }
    }


    public void printMatrix() {
        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix[0].length; col++) {
                System.out.print(matrix[row][col] + "\t");
            }
            System.out.println();
        }
    }

    public static void main(String args[]) {
        Random_Flip_Matrix matrix = new Random_Flip_Matrix(2, 3);
        matrix.flip();
        matrix.flip();
        matrix.flip();
        matrix.flip();
        matrix.flip();
        matrix.flip();
        matrix.flip();
        matrix.printMatrix();
    }
}
