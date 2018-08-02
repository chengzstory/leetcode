package day_3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by chengzstory on 2018/8/2.
 *
 * Link: https://leetcode.com/problems/positions-of-large-groups/description/
 *
 * Difficulty: Easy
 *
 * Acceptance: 46.6%
 */
public class Positions_Of_Large_Groups {

    public static List<List<Integer>> largeGroupPositions(String S) {
        List<List<Integer>> resList = new ArrayList<>();

        char[] chars = S.toCharArray();
        int[] array = new int[chars.length];
        int index = 0;
        char ch = chars[0];
        array[index] = 1;
        for (int i = 1; i < chars.length; i++) {
            if (chars[i] != ch) {
                array[++index]++;
                ch = chars[i];
            } else {
                array[index]++;
            }
        }
        int count = 0;
        for (int i = 0; i <= index; i++) {
            if (array[i] >= 3) {
                resList.add(Arrays.asList(count, count + array[i] - 1));
            }
            count+=array[i];
        }

        return resList;
    }


    public static void main(String args[]) {
        System.out.print(largeGroupPositions("abbxxxxzzy"));
    }

}
