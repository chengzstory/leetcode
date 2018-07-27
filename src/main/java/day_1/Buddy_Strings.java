package day_1;

/**
 * Created by chengzstory on 2018/7/27.
 *
 * Link: https://leetcode.com/problems/buddy-strings/description/
 *
 * Difficulty: Easy
 *
 * Acceptance: 26.8%
 */
public class Buddy_Strings {
    //     aacc      acac
    public static boolean buddyStrings(String A, String B) {
        if (A.length() != B.length()) {
            return false;
        }
        int[] diffPos = new int[A.length()];
        int t = 0;

        for (int i = 0; i < A.length(); i++) {
            if (A.charAt(i) != B.charAt(i)) {
                diffPos[t++] = i;
            }
        }
        if (t == 0) {
            for (int i = 0; i < A.length(); i++) {
                for (int j = i + 1; j < A.length(); j++) {
                    if (A.charAt(i) == A.charAt(j)) {
                        return true;
                    }
                }
            }
        }

        if (t == 2) {
            return A.charAt(diffPos[0]) == B.charAt(diffPos[1]) && A.charAt(diffPos[1]) == B.charAt(diffPos[0]);
        }
        return false;
    }
    //别人的代码!
    public static boolean optBuddyStrings(String A, String B) {
        if (A == null || B == null || A.length() != B.length())  return false;
        int a = -1, b = -1, diff = 0;
        int[] count = new int[26];
        // check if able to switch with the same character.
        boolean canSwitch = false;
        for (int i = 0; i < A.length(); i++) {
            //相同的字母 count[pos]++  如果 count[pos] >= 2  说明有两个以上同样的字母
            if (++count[A.charAt(i) - 'a'] >= 2)  canSwitch = true;
            if (A.charAt(i) != B.charAt(i)) {
                diff++;
                if (a == -1)  a = i;   //使用 a 和 b记录首先碰到的两处不同的位置下标
                else if (b == -1)  b = i;
            }
        }
        return (diff == 0 && canSwitch) || (diff == 2 && A.charAt(a) == B.charAt(b) && A.charAt(b) == B.charAt(a));
    }
    public static void main(String args[]) {
        System.out.println(optBuddyStrings("ab", "ba"));
    }
}
