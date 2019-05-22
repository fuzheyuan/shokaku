package azure.lane.solutions.SmallestRangeI;

/**
 * @author Zheyuan Fu
 * @date 2019.04.26
 */
public class SmallestRangeI {
    /**
     * Given an array A of integers, for each integer A[i] we may choose any x with -K <= x <= K, and add x to A[i].
     *
     * After this process, we have some array B.
     *
     * Return the smallest possible difference between the maximum value of B and the minimum value of B.
     *
     *
     *
     * Example 1:
     *
     * Input: A = [1], K = 0
     * Output: 0
     * Explanation: B = [1]
     * Example 2:
     *
     * Input: A = [0,10], K = 2
     * Output: 6
     * Explanation: B = [2,8]
     * Example 3:
     *
     * Input: A = [1,3,6], K = 3
     * Output: 0
     * Explanation: B = [3,3,3] or B = [4,4,4]
     *
     *
     * Note:
     *
     * 1 <= A.length <= 10000
     * 0 <= A[i] <= 10000
     * 0 <= K <= 10000
     * */
    /**
     * wrong answer
     * boring question
     * */
    public int smallestRangeI(int[] A, int K) {
        if(K == 0) return 0;
        if(K < 0) K = Math.abs(K);
        int diff = Integer.MAX_VALUE;
        for(int i = -K; i <= K; i ++) {
            Integer min = Integer.MAX_VALUE, max = Integer.MIN_VALUE;
            int newVal = 0;
            for(int j = 0; j < A.length; j ++) {
                newVal = A[j] + i;
                min = Math.min(min, newVal);
                max = Math.max(max, newVal);
            }
            diff = Math.min(diff, max - min);
        }
        return diff;
    }

    public static void main(String[] args) {
        int[] array = {0,10};
        int k = 2;
        SmallestRangeI smallestRangeI = new SmallestRangeI();
        System.out.println(smallestRangeI.smallestRangeI(array, k));
    }
}
