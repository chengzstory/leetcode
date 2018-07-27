package day_1;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by chengzstory on 2018/7/27.
 *
 * Link: https://leetcode.com/problems/letter-case-permutation/description/
 *
 * Difficulty: Easy
 *
 * Acceptance: 53.2%
 */
public class Letter_Case_Permutation {
    public static List<String> letterCasePermutation(String s) {
        List<String> resList = new ArrayList<>();
        resList.add(s);
        permutation(resList, s.toCharArray(), 0);
        return resList;
    }

    public static void permutation(List<String> resList, char[] chars, int index) {
        if (index == chars.length) {
            return;
        }
        if (Character.isLetter(chars[index])) {
            chars[index] = Character.toLowerCase(chars[index]);
            if (!resList.contains(new String(chars)))
                resList.add(new String(chars));
            permutation(resList, chars, index + 1);
            chars[index] = Character.toUpperCase(chars[index]);
            if (!resList.contains(new String(chars)))
                resList.add(new String(chars));
            permutation(resList, chars, index + 1);
        } else {
            permutation(resList, chars, index + 1);
        }
    }

    // a1b1 A1b1 A1B1 a1B1
    public static void main(String args[]) {
        System.out.println(letterCasePermutation("a1b1"));
    }
}
