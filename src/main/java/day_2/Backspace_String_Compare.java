package day_2;

import java.util.Stack;

/**
 * Created by chengzstory on 2018/7/30.
 *
 * Link: https://leetcode.com/problems/backspace-string-compare/description/
 *
 * Difficulty: Easy
 *
 * Acceptance: 45.4%
 */
public class Backspace_String_Compare {
    public static boolean backspaceCompare(String S, String T) {
        Stack<Character> stack1 = new Stack<>();
        Stack<Character> stack2 = new Stack<>();
        for (char c : S.toCharArray()) {
            if (c == '#') {
                if (!stack1.isEmpty()) {
                    stack1.pop();
                }
            } else {
                stack1.push(c);
            }
        }
        for (char c : T.toCharArray()) {
            if (c == '#') {
                if (!stack2.isEmpty()) {
                    stack2.pop();
                }
            } else {
                stack2.push(c);
            }

        }
        while (!stack1.isEmpty() && !stack2.isEmpty()) {
            if (!(stack1.pop() == stack2.pop())) {
                return false;
            }
        }
        return stack1.isEmpty() && stack2.isEmpty();
    }
    public static void main(String args[]) {
        System.out.println(backspaceCompare("bxj##tw", "bxj###tw"));
    }
}
