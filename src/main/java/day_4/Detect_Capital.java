package day_4;

/**
 * Created by chengzstory on 2018/8/3.
 *
 * Link: https://leetcode.com/contest/leetcode-weekly-contest-20/problems/detect-capital/
 *
 * Difficulty: Easy
 *
 * Acceptance:
 */
public class Detect_Capital {

    public static boolean detectCapialUse(String word) {
        int N = word.length();

        int index = 0;
        for (int i = 0; i < N; i++) {
            index = Character.isUpperCase(word.charAt(i)) ? index + 1 : index;
        }
        return index == 0 || index == N || (index == 1 && Character.isUpperCase(word.charAt(index - 1)));
    }

    public static void main(String args[]) {
        System.out.print(detectCapialUse("FlaG"));
    }
}
