package azure.lane.solutions.PeakIndexInAMountainArray;

import azure.lane.utils.PrintUtils;

/**
 * @author Zheyuan Fu
 * @date 2019.04.24
 */
public class PeakIndexInAMountainArray {
    /**
     * Let's call an array A a mountain if the following properties hold:
     *
     * A.length >= 3
     * There exists some 0 < i < A.length - 1 such that A[0] < A[1] < ... A[i-1] < A[i] > A[i+1] > ... > A[A.length - 1]
     * Given an array that is definitely a mountain, return any i such that A[0] < A[1] < ... A[i-1] < A[i] > A[i+1] > ... > A[A.length - 1].
     *
     * Example 1:
     *
     * Input: [0,1,0]
     * Output: 1
     * Example 2:
     *
     * Input: [0,2,1,0]
     * Output: 1
     * Note:
     *
     * 3 <= A.length <= 10000
     * 0 <= A[i] <= 10^6
     * A is a mountain, as defined above.
     * */
    public int peakIndexInMountainArray(int[] A) {
        int res = 0;
        for(int i = 1; i < A.length; i ++) {
            if(A[i] < A[i - 1]) {
                return i - 1;
            }
        }
        return res;
    }

    public static void main(String[] args) {
        PeakIndexInAMountainArray peakIndexInAMountainArray = new PeakIndexInAMountainArray();
        int[] array1 = {0,1,0};
        int[] array2 = {0,2,1,0};
        System.out.println(peakIndexInAMountainArray.peakIndexInMountainArray(array1));
        System.out.println(peakIndexInAMountainArray.peakIndexInMountainArray(array2));
    }
}
