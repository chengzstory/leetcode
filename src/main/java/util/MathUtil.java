package util;

/**
 * Created by chengzstory on 2018/7/27.
 */
public class MathUtil {
    public static void swap(int[] array, int i, int j) {
        int tmp = array[i];
        array[i] = array[j];
        array[j] = tmp;
    }
}
