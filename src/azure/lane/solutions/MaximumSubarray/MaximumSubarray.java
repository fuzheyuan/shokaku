package azure.lane.solutions.MaximumSubarray;

/**
 * @author Zheyuan Fu
 * @date 2019.05.10
 */
public class MaximumSubarray {
    /**
     * Given an integer array nums, find the contiguous subarray (containing at least one number) which has the largest sum and return its sum.
     *
     * Example:
     *
     * Input: [-2,1,-3,4,-1,2,1,-5,4],
     * Output: 6
     * Explanation: [4,-1,2,1] has the largest sum = 6.
     * Follow up:
     *
     * If you have figured out the O(n) solution, try coding another solution using the
     * */
    public int maxSubArray(int[] nums) {
        if(nums == null || nums.length == 0) return 0;

        int len = nums.length;
        int[] dp = new int[len];
        dp[0] = nums[0];
        int max = dp[0];

        for(int i = 1; i < len; i ++) {
            dp[i] = nums[i] + (dp[i - 1] > 0 ? dp[i - 1] : 0);
            max = Math.max(max, dp[i]);
        }
        return max;
    }
}
