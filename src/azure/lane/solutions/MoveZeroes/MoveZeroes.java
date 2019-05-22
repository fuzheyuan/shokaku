package azure.lane.solutions.MoveZeroes;

/**
 * @author Zheyuan Fu
 * @date 2019.04.30
 */
public class MoveZeroes {
    /**
     * Given an array nums, write a function to move all 0's to the end of it while maintaining the relative order of the non-zero elements.
     *
     * Example:
     *
     * Input: [0,1,0,3,12]
     * Output: [1,3,12,0,0]
     * Note:
     *
     * You must do this in-place without making a copy of the array.
     * Minimize the total number of operations.
     * */
    public void moveZeroes(int[] nums) {
        if(nums == null || nums.length == 0) return ;

        int i = 0, index = 0;
        while(i < nums.length) {
            if(nums[i] != 0) {
                nums[index ++] = nums[i];
            }
            i ++;
        }
        while(index < nums.length) {
            nums[index ++] = 0;
        }
    }
}
