package azure.lane.solutions.PartitionArrayIntoThreePartsWithEqualSum;

/**
 * @author Zheyuan Fu
 * @date 2019.04.30
 */
public class PartitionArrayIntoThreePartsWithEqualSum {
    /**
     * Given an array A of integers, return true if and only if we can partition the array into three non-empty parts with equal sums.
     *
     * Formally, we can partition the array if we can find indexes i+1 < j with (A[0] + A[1] + ... + A[i] == A[i+1] + A[i+2] + ... + A[j-1] == A[j] + A[j-1] + ... + A[A.length - 1])
     *
     *
     *
     * Example 1:
     *
     * Input: [0,2,1,-6,6,-7,9,1,2,0,1]
     * Output: true
     * Explanation: 0 + 2 + 1 = -6 + 6 - 7 + 9 + 1 = 2 + 0 + 1
     * Example 2:
     *
     * Input: [0,2,1,-6,6,7,9,-1,2,0,1]
     * Output: false
     * Example 3:
     *
     * Input: [3,3,6,5,-2,2,5,1,-9,4]
     * Output: true
     * Explanation: 3 + 3 = 6 = 5 - 2 + 2 + 5 + 1 - 9 + 4
     *
     *
     * Note:
     *
     * 3 <= A.length <= 50000
     * -10000 <= A[i] <= 10000
     * */
    public boolean canThreePartsEqualSum(int[] A) {
        if(A == null || A.length == 0) return false;

        int[] sum = new int[A.length];
        for(int i = 0; i < A.length; i ++) {
            if(i == 0) {
                sum[i] = A[i];
            } else {
                sum[i] += sum[i - 1] + A[i];
            }
        }

        for(int i = 0; i < A.length - 1; i ++) {
            for(int j = i + 1; j < A.length; j ++) {
                int sum1 = sum[i];
                int sum2 = sum[j] - sum[i];
                int sum3 = sum[A.length - 1] - sum[j];
                if(sum1 == sum2 && sum1 == sum3) {
                    return true;
                }
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[] array1 = {0,2,1,-6,6,-7,9,1,2,0,1};
        int[] array2 = {0,2,1,-6,6,7,9,-1,2,0,1};
        int[] array3 = {3,3,6,5,-2,2,5,1,-9,4};
        PartitionArrayIntoThreePartsWithEqualSum partitionArrayIntoThreePartsWithEqualSum = new PartitionArrayIntoThreePartsWithEqualSum();
        System.out.println(partitionArrayIntoThreePartsWithEqualSum.canThreePartsEqualSum(array1));
        System.out.println(partitionArrayIntoThreePartsWithEqualSum.canThreePartsEqualSum(array2));
        System.out.println(partitionArrayIntoThreePartsWithEqualSum.canThreePartsEqualSum(array3));
    }
}
