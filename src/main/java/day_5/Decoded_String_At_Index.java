package day_5;


import java.util.Arrays;

/**
 * Created by chengzstory on 2018/8/7.
 *
 * Link: https://leetcode.com/contest/weekly-contest-96/problems/decoded-string-at-index/
 *
 * Difficulty: Medium
 *
 * Acceptance:
 */
public class Decoded_String_At_Index {
    public static int weightAllocation(int[] weights) {
        int n = weights.length;
        // 随机分配
        int weightSum = 0;
        for (int i = 0; i < n; i++) {
            weightSum += weights[i];
        }
        int random = (int) (Math.random() * weightSum);
        int m = 0;
        for (int i = 0; i < n; i++) {
           if (m <= random && random < m + weights[i]) {
               return i;
           }
           m += weights[i];
        }
        return (int) (Math.random() * n);
    }



    public static void main(String args[]) {
        int one = 0, two = 0, three = 0;
        int n = 100000000;
        for (int i = 0; i < n; i++) {
            int ret = weightAllocation(new int[]{20, 40, 40});
//            if (ret == 0) {
//                one++;
//            } else if (ret == 1) {
//                two++;
//            } else if (ret == 2) {
//                three++;
//            }
        }

        System.out.println("0 rating: " + ((float) one) / n);
        System.out.println("1 rating: " + ((float) two) / n);
        System.out.println("2 rating: " + ((float) three) / n);
    }
}
