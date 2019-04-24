package azure.lane.solutions.SquaresOfASortedArray;

import azure.lane.utils.PrintUtils;

/**
 * @author Zheyuan Fu
 * @date 2019.04.24
 */
public class SquaresOfASortedArray {
    /**
     * Given an array of integers A sorted in non-decreasing order, return an array of the squares of each number, also in sorted non-decreasing order.
     * <p>
     * <p>
     * <p>
     * Example 1:
     * <p>
     * Input: [-4,-1,0,3,10]
     * Output: [0,1,9,16,100]
     * Example 2:
     * <p>
     * Input: [-7,-3,2,3,11]
     * Output: [4,9,9,49,121]
     * <p>
     * <p>
     * Note:
     * <p>
     * 1 <= A.length <= 10000
     * -10000 <= A[i] <= 10000
     * A is sorted in non-decreasing order.
     */
    public int[] sortedSquares(int[] A) {
        if (A == null || A.length == 0) {
            return new int[0];
        }
        int[] res = new int[A.length];
        int i = (A.length - 1) / 2, j = i + 1;
        int index = 0;
        if(j >= A.length) {
            res[0] = A[0] * A[0];
            return res;
        }

        while (i >= 0 && j <= A.length - 1) {
            if (A[i] * A[i] <= A[j] * A[j]) {
                res[index ++] = A[i] * A[i];
                i --;
            } else {
                res[index ++] = A[j] * A[j];
                j ++;
            }
        }

        while(i >= 0) {
            res[index ++] = A[i] * A[i];
            i --;
        }
        while(j <= A.length - 1) {
            res[index ++] = A[j] * A[j];
            j ++;
        }

        return res;
    }

    public static void main(String[] args) {
        SquaresOfASortedArray squaresOfASortedArray = new SquaresOfASortedArray();
        int[] array1 = {-4,-1,0,3,10};
        int[] array2 = {-7,-3,2,3,11};
        int[] array3 = {-1,2,2};
//        PrintUtils.printIntArray(squaresOfASortedArray.sortedSquares(array1));
//        PrintUtils.printIntArray(squaresOfASortedArray.sortedSquares(array2));
        PrintUtils.printIntArray(squaresOfASortedArray.sortedSquares(array3));
    }
}
