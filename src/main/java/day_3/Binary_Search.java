package day_3;

/**
 * Created by chengzstory on 2018/8/2.
 *
 * Link: https://leetcode.com/problems/binary-search/description/
 *
 * Difficulty: 21.5%
 *
 * Acceptance: Easy
 */
public class Binary_Search {

    public static int search(int[] nums, int target) {
        int l = 0, r = nums.length - 1;
        while (l <= r) {
            int mid = l + (r - l) / 2;
            if (nums[mid] == target) {
                return mid;
            } else if (nums[mid] > target) {
                r = mid - 1;
            } else {
                l = mid + 1;
            }
        }
        return -1;
    }

    public static void main(String args[]) {
        int[] arr = new int[]{9};
        System.out.println(search(arr, 9));
    }
}
