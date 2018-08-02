package day_3;

/**
 * Created by chengzstory on 2018/7/31.
 *
 * Link: https://leetcode.com/problems/rectangle-overlap/description/
 *
 * Difficulty: Easy
 *
 * Acceptance: 42.2%
 */
public class Rectangle_Overlap {

    // 分别判断x 和 y是否重叠    例如 rec1 x 范围 {0, 3}
    // 那么只有 0 大于等于 rec2 x的大值 或 3 大于等于 rec2 x 的小值不在rec1 x 的范围
    // 同理判断y 是否在范围内     只有x 和 y同时在rec1范围内, 才算重叠
    public static boolean isRectangleOverlap(int[] rec1, int[] rec2) {
        int x1 = rec1[0], y1 = rec1[1], x2 = rec1[2], y2 = rec1[3];
        int _x1 = rec2[0], _y1 = rec2[1], _x2 = rec2[2], _y2 = rec2[3];

        int xL = Math.min(x1, x2), yD = Math.min(y1, y2);
        int xR = Math.max(x1, x2), yU = Math.max(y1, y2);
        int _xL = Math.min(_x1, _x2), _yD = Math.min(_y1, _y2);
        int _xR = Math.max(_x1, _x2), _yU = Math.max(_y1, _y2);

        boolean containX = !(xL >= _xR || xR <= _xL);

        boolean containY = !(yD >= _yU || yU <= _yD);

        return containX && containY;
    }

    public static void main(String args[]) {
        System.out.println(isRectangleOverlap(new int[]{0, 0, 1, 1}, new int[]{0, 0, 1, 1}));
    }
}

