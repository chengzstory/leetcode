package day_2;

/**
 * Created by chengzstory on 2018/7/30.
 *
 * Link: https://leetcode.com/problems/peak-index-in-a-mountain-array/description/
 *
 * Difficulty: Easy
 *
 * Acceptance: 67.9%
 */
public class Peak_Index_In_A_Mountain_Array {
    public static int peakIndexInMountainArray(int[] A) {
        int max_index = 0;
        for (int i = 0; i < A.length - 1; i++) {
            max_index = A[i + 1] > A[i] ? i + 1 : max_index;
        }

        boolean isPeak = true;
        for (int i = 0; i < max_index; i++) {
            if (A[i + 1] <= A[i]) {
                isPeak = false;
            }
        }
        for (int i = max_index + 1; i < A.length - 1; i++) {
            if (A[i + 1] >= A[i]) {
                isPeak = false;
            }
        }
        return isPeak ? max_index : -1;
    }



    public static void main(String args[]) {
//        System.out.println(peakIndexInMountainArray(new int[] {0, 1, 0}));
    }
}
