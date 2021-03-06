package azure.lane.solutions.FindPivotIndex;

/**
 * @author Zheyuan Fu
 * @date 2019.05.13
 */
public class FindPivotIndex {
    /**
     * Given an array of integers nums, write a method that returns the "pivot" index of this array.
     *
     * We define the pivot index as the index where the sum of the numbers to the left of the index is equal to the sum of the numbers to the right of the index.
     *
     * If no such index exists, we should return -1. If there are multiple pivot indexes, you should return the left-most pivot index.
     *
     * Example 1:
     *
     * Input:
     * nums = [1, 7, 3, 6, 5, 6]
     * Output: 3
     * Explanation:
     * The sum of the numbers to the left of index 3 (nums[3] = 6) is equal to the sum of numbers to the right of index 3.
     * Also, 3 is the first index where this occurs.
     *
     *
     * Example 2:
     *
     * Input:
     * nums = [1, 2, 3]
     * Output: -1
     * Explanation:
     * There is no index that satisfies the conditions in the problem statement.
     *
     *
     * Note:
     *
     * The length of nums will be in the range [0, 10000].
     * Each element nums[i] will be an integer in the range [-1000, 1000].
     * */
    public int pivotIndex(int[] nums) {
        if(nums == null || nums.length == 0) return -1;

        int[] sum = new int[nums.length];
        sum[0] = nums[0];
        for(int i = 1; i < nums.length; i ++) {
            sum[i] = sum[i - 1] + nums[i];
        }

        for(int i = 0; i < nums.length; i ++) {
            if(i == 0 && sum[nums.length - 1] - sum[0] == 0) return 0;
            if(i == nums.length - 1 && sum[nums.length - 2] == 0) return nums.length - 1;
            if(i > 0) {
                if(sum[i - 1] == sum[nums.length - 1] - sum[i]) {
                    return i;
                }
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] nums = {1,7,3,6,5,6};
        FindPivotIndex findPivotIndex = new FindPivotIndex();
        System.out.println(findPivotIndex.pivotIndex(nums));
    }
}
