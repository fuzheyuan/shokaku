package azure.lane.utils;

/**
 * @author Zheyuan Fu
 * @date 2019.04.26
 */
public class StringUtils {
    public static String swap(String s, int i, int j) {
        char[] array = s.toCharArray();
        char temp = array[i];
        array[i] = array[j];
        array[j] = temp;
        return String.valueOf(array);
    }

    public static String swap(char[] array, int start, int end) {
        while(start < end) {
            char temp = array[start];
            array[start] = array[end];
            array[end] = temp;
            start ++;
            end --;
        }
        return String.valueOf(array);
    }
}
