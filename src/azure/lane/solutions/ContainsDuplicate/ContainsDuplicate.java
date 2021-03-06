package azure.lane.solutions.ContainsDuplicate;

import java.util.HashSet;
import java.util.Set;

/**
 * @author Zheyuan Fu
 * @date 2019.05.07
 */
public class ContainsDuplicate {
    /**
     * Given an array of integers, find if the array contains any duplicates.
     *
     * Your function should return true if any value appears at least twice in the array, and it should return false if every element is distinct.
     *
     * Example 1:
     *
     * Input: [1,2,3,1]
     * Output: true
     * Example 2:
     *
     * Input: [1,2,3,4]
     * Output: false
     * Example 3:
     *
     * Input: [1,1,1,3,3,4,3,2,4,2]
     * Output: true
     * */
    public boolean containsDuplicate(int[] nums) {
        if(nums == null || nums.length == 0) return false;
        Set<Integer> set = new HashSet<>();
        for(int num : nums) {
            if(!set.add(num)) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        ContainsDuplicate containsDuplicate = new ContainsDuplicate();
        int[] nums1 = {1,2,3,1};
        System.out.println(containsDuplicate.containsDuplicate(nums1));
    }
}
