package azure.lane.solutions.RotateArray;

/**
 * @author Zheyuan Fu
 * @date 2019.05.21
 */
public class RotateArray {
    /**
     * Given an array, rotate the array to the right by k steps, where k is non-negative.
     *
     * Example 1:
     *
     * Input: [1,2,3,4,5,6,7] and k = 3
     * Output: [5,6,7,1,2,3,4]
     * Explanation:
     * rotate 1 steps to the right: [7,1,2,3,4,5,6]
     * rotate 2 steps to the right: [6,7,1,2,3,4,5]
     * rotate 3 steps to the right: [5,6,7,1,2,3,4]
     * Example 2:
     *
     * Input: [-1,-100,3,99] and k = 2
     * Output: [3,99,-1,-100]
     * Explanation:
     * rotate 1 steps to the right: [99,-1,-100,3]
     * rotate 2 steps to the right: [3,99,-1,-100]
     * Note:
     *
     * Try to come up as many solutions as you can, there are at least 3 different ways to solve this problem.
     * Could you do it in-place with O(1) extra space?
     * */
    public void rotate(int[] nums, int k) {
        if(nums == null || nums.length == 0) return ;
        rotate(nums, 0, nums.length - 1);
        k = k % nums.length;
        rotate(nums,0, k - 1);
        rotate(nums, k, nums.length - 1);
    }

    private void rotate(int[] nums, int start, int end) {
        while(start < end) {
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start ++; end --;
        }
    }

    public static void main(String[] args) {
        int[] nums = {1,2,3,4,5,6,7};
        RotateArray rotateArray = new RotateArray();
        rotateArray.rotate(nums, 3);
    }
}
