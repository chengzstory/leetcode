package day_6;

/**
 * Created by chengzstory on 2018/9/23.
 *
 * Link: https://leetcode.com/problems/plus-one/description/
 *
 * Difficulty: Easy
 *
 * Acceptance: 40.0%
 */
public class PlusOne {
    public static int[] plusOne(int[] digits) {
        int carry = 1, n = digits.length;
        for (int i = n - 1; i >= 0; i--) {
            int sum = digits[i] + carry;
            digits[i] = (sum) % 10;
            carry = (sum) / 10;
        }
        if (carry > 0) {
                int[] nums = new int[n + 1];
                nums[0] = carry;
                for (int i = 1; i < n; i++) {
                    nums[i] = digits[i];
                }
            return nums;
        }
        return digits;
    }

    public static void main(String args[]) {
        System.out.println(plusOne(new int[]{9}));
    }
}
