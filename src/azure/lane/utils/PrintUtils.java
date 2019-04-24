package azure.lane.utils;

/**
 * @author Zheyuan Fu
 * @date 2019.04.24
 */
public class PrintUtils {
    public static void printIntArray(int[] array) {
        for(int num : array) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
