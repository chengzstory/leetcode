package day_4;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by chengzstory on 2018/8/3.
 *
 * Link: https://leetcode.com/contest/leetcode-weekly-contest-20/problems/contiguous-array/
 *
 * Difficulty: Medium
 *
 * Acceptance:
 */
public class Contiguous_Array {

    // 1. 将 0 置为 -1
    public static int findMaxLength(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            nums[i] = nums[i] == 0 ? -1 : nums[i];
        }
        int max = 0;
        for (int i = 0; i < nums.length; i++) {
            int sum = 0;
            int index = 0;
            for (int j = i; j < nums.length; j++) {
                sum += nums[j];
                index = sum == 0 ? j - i + 1 : index;
            }
            max = Math.max(max, index);
        }
        return max;
    }

    // !
    public static int optFindMaxLength(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        map.put(0, -1);
        int maxlen = 0, count = 0;
        for (int i = 0; i < nums.length; i++) {
            count = count + (nums[i] == 1 ? 1 : -1);
            if (map.containsKey(count)) {
                maxlen = Math.max(maxlen, i - map.get(count));
            } else {
                map.put(count, i);
            }
        }
        return maxlen;
    }

    // 1 1 1 -1 -1

    // map.put(0, -1)
    // count = 1      map.put(1, 0)   i = 0         [0, -1], [1, 0]
    // count = 2      map.put(2, 1)   i = 1         [0, -1], [1, 0], [2, 1]
    // count = 3      map.put(3, 2)   i = 2         [0, -1], [1, 0], [2, 1], [3, 2]
    // count = 2      maxLen = 2      i = 3         [0, -1], [1, 0], [2, 1], [3, 2]
    // count = 1      maxLen = 4      i = 4         [0, -1], [1, 0], [2, 1], [3, 2]




    public static void main(String[] args) {

    }
}
