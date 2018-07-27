package day_1;

/**
 * Created by chengzstory on 2018/7/27.
 *
 * Link: https://leetcode.com/problems/binary-gap/description/
 *
 * Difficulty: Easy
 *
 * Acceptance: 61.0%
 */
public class Binary_Gap {
    public static int binaryGap(int N) {
        int step = 0;
        int count_1 = 0;
        int result = 0;
        boolean addStep = false;
        while (N != 0) {
            int mod = N % 2;
            N /= 2;
            if (mod == 1) {
                count_1++;
                addStep = true;
                if (count_1 > 1) {
                    result = Math.max(result, step);
                    step = 0;
                }
            }
            step = addStep ? step + 1 : step;
        }
        return result;
    }

    //别人的solution   使用索引数组记录1的下标
    public static int optBinaryGap(int N) {
        int[] A = new int[32];
        int t = 0;
        for (int i = 0; i < 32; ++i) {
            if ((N & 1) != 0) {
                A[t++] = i;
            }
            N = N >> 1;
        }
        int ans = 0;
        for (int i = 0; i < t - 1; ++i) {
            ans = Math.max(ans, A[i+1] - A[i]);
        }
        return ans;
    }
    public static void main(String args[]) {
        System.out.println(optBinaryGap(22));
    }
}
