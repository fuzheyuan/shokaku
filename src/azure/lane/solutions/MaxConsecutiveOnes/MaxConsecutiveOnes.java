package azure.lane.solutions.MaxConsecutiveOnes;

/**
 * @author Zheyuan Fu
 * @date 2019.04.30
 */
public class MaxConsecutiveOnes {
    /**
     * Given a binary array, find the maximum number of consecutive 1s in this array.
     *
     * Example 1:
     * Input: [1,1,0,1,1,1]
     * Output: 3
     * Explanation: The first two digits or the last three digits are consecutive 1s.
     *     The maximum number of consecutive 1s is 3.
     * Note:
     *
     * The input array will only contain 0 and 1.
     * The length of input array is a positive integer and will not exceed 10,000
     * */
    public int findMaxConsecutiveOnes(int[] nums) {
        if(nums == null || nums.length == 0) return 0;
        int left = 0;
        int max = 0;
        while(left < nums.length) {
            while(left < nums.length && nums[left] != 1) {
                left ++;
            }
            int right = left;
            while(right < nums.length && nums[right] == 1) {
                right ++;
            }
            max = Math.max(max, right - left);
            left = right;
        }
        return max;
    }
}
