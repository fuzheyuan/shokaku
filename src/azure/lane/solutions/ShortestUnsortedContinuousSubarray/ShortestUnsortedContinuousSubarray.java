package azure.lane.solutions.ShortestUnsortedContinuousSubarray;

/**
 * @author Zheyuan Fu
 * @date 2019.05.21
 */
public class ShortestUnsortedContinuousSubarray {
    /**
     * Given an integer array, you need to find one continuous subarray that if you only sort this subarray in ascending order, then the whole array will be sorted in ascending order, too.
     *
     * You need to find the shortest such subarray and output its length.
     *
     * Example 1:
     * Input: [2, 6, 4, 8, 10, 9, 15]
     * Output: 5
     * Explanation: You need to sort [6, 4, 8, 10, 9] in ascending order to make the whole array sorted in ascending order.
     * Note:
     * Then length of the input array is in range [1, 10,000].
     * The input array may contain duplicates, so ascending order here means <=.
     * */
    public int findUnsortedSubarray(int[] nums) {
        int left = 0, right = nums.length - 1;

        while(left < right && nums[left] <= nums[left + 1]) {
            left ++;
        }
        if(left >= right) return 0;

        while(nums[right] >= nums[right - 1]) {
            right --;
        }

        int min = Integer.MAX_VALUE, max = Integer.MIN_VALUE;
        for(int i = left; i <= right; i ++) {
            min = Math.min(min, nums[i]);
            max = Math.max(max, nums[i]);
        }

        while(left >= 0 && min < nums[left]) {
            left --;
        }
        while(right <= nums.length - 1 && nums[right] < max) {
            right ++;
        }

        return right - left - 1;
    }

    public static void main(String[] args) {
        ShortestUnsortedContinuousSubarray shortestUnsortedContinuousSubarray = new ShortestUnsortedContinuousSubarray();
        int[] nums = {2,6,4,8,10,9,15};
        System.out.println(shortestUnsortedContinuousSubarray.findUnsortedSubarray(nums));
    }
}
