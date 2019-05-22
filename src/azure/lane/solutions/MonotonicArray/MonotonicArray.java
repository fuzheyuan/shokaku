package azure.lane.solutions.MonotonicArray;

/**
 * @author Zheyuan Fu
 * @date 2019.04.30
 */
public class MonotonicArray {
    /**
     * An array is monotonic if it is either monotone increasing or monotone decreasing.
     *
     * An array A is monotone increasing if for all i <= j, A[i] <= A[j].  An array A is monotone decreasing if for all i <= j, A[i] >= A[j].
     *
     * Return true if and only if the given array A is monotonic.
     *
     *
     *
     * Example 1:
     *
     * Input: [1,2,2,3]
     * Output: true
     * Example 2:
     *
     * Input: [6,5,4,4]
     * Output: true
     * Example 3:
     *
     * Input: [1,3,2]
     * Output: false
     * Example 4:
     *
     * Input: [1,2,4,5]
     * Output: true
     * Example 5:
     *
     * Input: [1,1,1]
     * Output: true
     *
     *
     * Note:
     *
     * 1 <= A.length <= 50000
     * -100000 <= A[i] <= 100000
     * */
    public boolean isMonotonic(int[] A) {
        if(A == null || A.length <= 2) return true;
        boolean monotonic = false;
        int start = 1;
        for(; start < A.length; start ++) {
            if(A[start] != A[start - 1]) {
                monotonic = A[start] - A[start - 1] > 0;
                break;
            }
        }
        if(start == A.length) return true;

        for(int i = start; i < A.length; i ++) {
            if(A[i] == A[i - 1]) continue;
            if(A[i] > A[i - 1] != monotonic) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int[] array1 = {1,2,2,3};
        int[] array2 = {6,5,4,4};
        int[] array3 = {1,3,2};
        int[] array4 = {1,2,4,5};
        int[] array5 = {1,1,1};
        int[] array6 = {1,1,0};
        MonotonicArray monotonicArray = new MonotonicArray();
        System.out.println(monotonicArray.isMonotonic(array1));
        System.out.println(monotonicArray.isMonotonic(array2));
        System.out.println(monotonicArray.isMonotonic(array3));
        System.out.println(monotonicArray.isMonotonic(array4));
        System.out.println(monotonicArray.isMonotonic(array5));
        System.out.println(monotonicArray.isMonotonic(array6));
    }
}
