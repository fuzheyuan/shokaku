package azure.lane.solutions.MajorityElement;

/**
 * @author Zheyuan Fu
 * @date 2019.04.30
 */
public class MajorityElement {
    /**
     * Given an array of size n, find the majority element. The majority element is the element that appears more than ⌊ n/2 ⌋ times.
     *
     * You may assume that the array is non-empty and the majority element always exist in the array.
     *
     * Example 1:
     *
     * Input: [3,2,3]
     * Output: 3
     * Example 2:
     *
     * Input: [2,2,1,1,1,2,2]
     * Output: 2
     * */
    public int majorityElement(int[] nums) {
        int res = nums[0];
        int count = 1;
        for(int i = 1; i < nums.length; i ++) {
            if(nums[i] == res) {
                count ++;
            }else{
                count --;
                if(count == 0) {
                    res = nums[i];
                    count ++;
                }
            }
        }
        return res;
    }

    public static void main(String[] args) {
        int[] nums = {3,2,3};
        MajorityElement majorityElement = new MajorityElement();
        System.out.println(majorityElement.majorityElement(nums));
    }
}
