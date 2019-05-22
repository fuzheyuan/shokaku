package azure.lane.utils;

/**
 * @author Zheyuan Fu
 * @date 2019.04.25
 */
public class ArrayUtils {
    public static void swap(int[] array, int i, int j) {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }

    public static void swap(char[] array, int i, int j) {
        char temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }

    public static void swapFromTo(char[] array, int from, int to) {
        while(from < to) {
            char temp = array[from];
            array[from] = array[to];
            array[to] = temp;
            from ++; to --;
        }
    }
}
