package day_3;

import java.util.Arrays;

/**
 * Created by chengzstory on 2018/8/2.
 *
 * Link: https://leetcode.com/problems/shortest-distance-to-a-character/description/
 *
 * Difficulty: Easy
 *
 * Acceptance: 60.8%
 */
public class Shortest_Distance_To_A_Character {

    public static int[] shortestToChar(String S, char C) {
        int N = S.length();
        int[] ans = new int[N];
        int prev = Integer.MIN_VALUE / 2;
        for (int i = 0; i < N; ++i) {
            if (S.charAt(i) == C) {
                prev = i;
            }
            ans[i] = i - prev;
        }
        System.out.println(Arrays.toString(ans));
        prev = Integer.MAX_VALUE / 2;
        for (int i = N - 1; i >= 0; --i) {
            if (S.charAt(i) == C) {
                prev = i;
            }
            ans[i] = Math.min(ans[i], prev - i);
        }
        return ans;
    }

    public static void main(String args[]) {
        System.out.println(Arrays.toString(shortestToChar("abcdeaabe", 'e')));
    }
}
