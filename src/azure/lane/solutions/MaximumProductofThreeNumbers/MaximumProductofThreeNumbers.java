package azure.lane.solutions.MaximumProductofThreeNumbers;

import java.util.Arrays;

/**
 * @author Zheyuan Fu
 * @date 2019.05.10
 */
public class MaximumProductofThreeNumbers {
    /**
     * Given an integer array, find three numbers whose product is maximum and output the maximum product.
     *
     * Example 1:
     *
     * Input: [1,2,3]
     * Output: 6
     *
     *
     * Example 2:
     *
     * Input: [1,2,3,4]
     * Output: 24
     *
     *
     * Note:
     *
     * The length of the given array will be in range [3,104] and all elements are in the range [-1000, 1000].
     * Multiplication of any three numbers in the input won't exceed the range of 32-bit signed integer.
     * */
    public int maximumProduct(int[] nums) {
        if(nums == null || nums.length == 0) return Integer.MIN_VALUE;
        Arrays.sort(nums);
        int len = nums.length;
        int l2r1 = nums[0] * nums[1] * nums[len - 1];
        int r3 = nums[len - 1] * nums[len - 2] * nums[len - 3];
        return Math.max(l2r1, r3);
    }
}
