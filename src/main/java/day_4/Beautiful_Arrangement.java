package day_4;

/**
 * Created by chengzstory on 2018/8/3.
 *
 * Link: https://leetcode.com/contest/leetcode-weekly-contest-20/problems/beautiful-arrangement/
 *
 * Difficulty: Medium
 *
 * Acceptance:
 */
public class Beautiful_Arrangement {
    // num[i + 1] / i  || i / num[i + 1]
    public static int countArrangement(int N) {
        int[] nums = new int[N + 1];
        for (int i = 1; i < nums.length; i++) {
            nums[i] = i;
        }

        return recrusive(nums, new boolean[N + 1], 1, 1);
    }
    //
    public static int recrusive(int[] nums, boolean[] used, int pos, int value) {
        // 第一位value 为 1  canDiv肯定为true
        if (!(canDiv(value, pos))) {
            return 0;
        }
        // 最后一位也可以整除 返回 1 (中间如果有不能整除的会直接返回0)
        if (pos == nums.length - 1 && canDiv(value, pos)) {
            return 1;
        }
        int res = 0;
        for (int i = 1; i < used.length; i++) {
            if (!used[i]) {
                used[i] = true;
                res += recrusive(nums, used, pos + 1, nums[i]);
                used[i] = false;
            }

        }
        return res;
    }

    public static boolean canDiv(int a, int b) {
        return a % b == 0 || b % a == 0;
    }

    public static void main(String args[]) {
        System.out.println(countArrangement(2));
    }
}
