package day_1;

/**
 * Created by chengzstory on 2018/7/27.
 *
 * Link: https://leetcode.com/problems/lemonade-change/description/
 *
 * Difficulty: Easy
 *
 * Acceptance: 49.5%
 */
public class Lemonade_Change {
    // 5  10 -> 5   20 -> 5 + 10 或 5 + 5 + 5
    public static boolean lemonadeChange(int[] bills) {
        int count5 = 0;
        int count10 = 0;
        for (int i = 0; i < bills.length; i++) {
            if (bills[i] == 5) {
                count5++;
            }
            if (bills[i] == 10) {
                if (count5 == 0) {
                    return false;
                }
                count5--;
                count10++;
            }
            if (bills[i] == 20) {
                if (count5 == 0) {
                    return false;
                }
                if (count10 == 0 && count5 < 3) {
                    return false;
                }
                if (count10 > 0) {
                    count10--;
                    count5--;
                } else {
                    count5-=3;
                }
            }
        }
        return true;
    }
    public static void main(String args[]) {

    }

}
