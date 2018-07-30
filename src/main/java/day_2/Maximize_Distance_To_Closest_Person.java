package day_2;

/**
 * Created by chengzstory on 2018/7/30.
 *
 * Link: https://leetcode.com/problems/maximize-distance-to-closest-person/description/
 *
 * Difficulty: Easy
 *
 * Acceptance: 38.2%
 */
public class Maximize_Distance_To_Closest_Person {
    // 使用数组记录1位置的下标   并计算最左侧1和最后侧1距离边界的位置
    public static int maxDistToClosest(int[] seats) {
        int[] index = new int[seats.length];
        int num = 0;
        for (int i = 0; i < seats.length; i++) {
            if (seats[i] == 1) {
                index[num++] = i;
            }
        }
        int distance = 0;
        for (int i = 0; i < num - 1; i++) {
            distance = Math.max(distance, index[i + 1] - index[i]);
        }
        return Math.max(Math.max(index[0], seats.length - index[num - 1] - 1), distance / 2);
    }

    public static void main(String args[]) {
        System.out.print(maxDistToClosest(new int[]{1,0,0,0,1,0,1}));
    }
}
