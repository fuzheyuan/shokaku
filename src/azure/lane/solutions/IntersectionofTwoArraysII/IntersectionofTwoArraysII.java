package azure.lane.solutions.IntersectionofTwoArraysII;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author Zheyuan Fu
 * @date 2019.05.09
 */
public class IntersectionofTwoArraysII {
    /**
     * Given two arrays, write a function to compute their intersection.
     *
     * Example 1:
     *
     * Input: nums1 = [1,2,2,1], nums2 = [2,2]
     * Output: [2,2]
     * Example 2:
     *
     * Input: nums1 = [4,9,5], nums2 = [9,4,9,8,4]
     * Output: [4,9]
     * Note:
     *
     * Each element in the result should appear as many times as it shows in both arrays.
     * The result can be in any order.
     * Follow up:
     *
     * What if the given array is already sorted? How would you optimize your algorithm?
     * What if nums1's size is small compared to nums2's size? Which algorithm is better?
     * What if elements of nums2 are stored on disk, and the memory is limited such that you cannot load all elements into the memory at once?
     * */
    public int[] intersect(int[] nums1, int[] nums2) {
        List<Integer> res = new ArrayList<>();
        Map<Integer, Integer> counts = new HashMap<>();
        for(int i = 0; i < nums1.length; i ++) {
            counts.put(nums1[i], counts.getOrDefault(nums1[i], 0) + 1);
        }
        for(int i = 0; i < nums2.length; i ++) {
            int count = counts.getOrDefault(nums2[i], 0);
            if(count > 0) {
                count --;
                counts.put(nums2[i], count);
                res.add(nums2[i]);
            }
        }
        int[] ret = new int[res.size()];
        for(int i = 0; i < res.size(); i ++) {
            ret[i] = res.get(i);
        }
        return ret;
    }
}
