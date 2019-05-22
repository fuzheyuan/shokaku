package azure.lane.solutions.SortArrayByParityII;

import azure.lane.utils.ArrayUtils;
import azure.lane.utils.PrintUtils;

/**
 * @author Zheyuan Fu
 * @date 2019.04.25
 */
public class SortArrayByParityII {
    /**
     * Given an array A of non-negative integers, half of the integers in A are odd, and half of the integers are even.
     *
     * Sort the array so that whenever A[i] is odd, i is odd; and whenever A[i] is even, i is even.
     *
     * You may return any answer array that satisfies this condition.
     *
     *
     *
     * Example 1:
     *
     * Input: [4,2,5,7]
     * Output: [4,5,2,7]
     * Explanation: [4,7,2,5], [2,5,4,7], [2,7,4,5] would also have been accepted.
     *
     *
     * Note:
     *
     * 2 <= A.length <= 20000
     * A.length % 2 == 0
     * 0 <= A[i] <= 1000
     * */
    public int[] sortArrayByParityII(int[] A) {
        int i = 0, j = 1, n = A.length;
        while (i < n && j < n) {
            while (i < n && A[i] % 2 == 0) {
                i += 2;
            }
            while (j < n && A[j] % 2 == 1) {
                j += 2;
            }
            if (i < n && j < n) {
                ArrayUtils.swap(A, i, j);
            }
        }
        return A;
    }

    public static void main(String[] args) {
        int[] array1 = {4,2,5,7};
        int[] array2 = {2,3};
        SortArrayByParityII sortArrayByParityII = new SortArrayByParityII();
        PrintUtils.printIntArray(sortArrayByParityII.sortArrayByParityII(array1));
        PrintUtils.printIntArray(sortArrayByParityII.sortArrayByParityII(array2));
    }
}
