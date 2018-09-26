package day_5;

import java.util.Arrays;

/**
 * Created by chengzstory on 2018/8/7.
 *
 * Link: https://leetcode.com/contest/weekly-contest-96/problems/boats-to-save-people/
 *
 * Difficulty: Medium
 *
 * Acceptance:
 */
public class Boats_To_Save_People {

    public static int numRescueBoats(int[] people, int limit) {
        Arrays.sort(people);
        int i = 0, j = people.length - 1;
        int ans = 0;

        while (i <= j) {
            ans++;
            if (people[i] + people[j] <= limit) {
                i++;
            }
            j--;
        }
        return ans;
    }

    public static void main(String args[]) {
        int[] people = new int[]{1, 1, 1, 1};
        int limit = 4;
        System.out.println(numRescueBoats(people, limit));
    }
}
