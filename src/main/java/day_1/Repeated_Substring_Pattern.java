package day_1;

/**
 * Created by chengzstory on 2018/7/27.
 *
 * Link: https://leetcode.com/problems/repeated-substring-pattern/description/
 *
 * Difficulty: Easy
 *
 * Acceptance: 38.4%
 */
public class Repeated_Substring_Pattern {
    /*
    abcded  取a, ab, abc 分别加上 总长度 / 子串 的 子串
    a + a + a + a + a + a
    ab + ab + ab
    abc + abc
     */
    public static boolean repeatedSubstringPattern(String s) {
        for (int i = 1; i <= s.length() / 2; i++) {
            if (s.length() % i != 0) { // 不能整除 直接跳过
                continue;
            }
            String str = s.substring(0, i);
            StringBuilder sb = new StringBuilder();
            for (int j = 1; j <= s.length() / i; j++) {
                sb.append(str);
            }
            if (sb.toString().equals(s)) {
                return true;
            }
        }
        return false;
    }

    public static void main(String args[]) {
        String s = "abaababaab";
        System.out.println(repeatedSubstringPattern(s));
    }
}
