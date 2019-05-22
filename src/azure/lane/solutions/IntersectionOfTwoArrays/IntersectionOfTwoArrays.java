package azure.lane.solutions.IntersectionOfTwoArrays;

import azure.lane.utils.PrintUtils;

import java.util.*;

/**
 * @author Zheyuan Fu
 * @date 2019.04.30
 */
public class IntersectionOfTwoArrays {
    /**
     * Given two arrays, write a function to compute their intersection.
     *
     * Example 1:
     *
     * Input: nums1 = [1,2,2,1], nums2 = [2,2]
     * Output: [2]
     * Example 2:
     *
     * Input: nums1 = [4,9,5], nums2 = [9,4,9,8,4]
     * Output: [9,4]
     * Note:
     *
     * Each element in the result must be unique.
     * The result can be in any order.
     * */
    public int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> set = new HashSet<>();
        Set<Integer> res = new HashSet<>();
        for(int i = 0; i < nums1.length; i ++) {
            set.add(nums1[i]);
        }
        for(int i = 0; i < nums2.length; i ++) {
            if(set.contains(nums2[i])) {
                res.add(nums2[i]);
            }
        }
        int[] ret = new int[res.size()];
        Iterator<Integer> it = res.iterator();
        int index = 0;
        while (it.hasNext()) {
            ret[index ++] = it.next();
        }
        return ret;
    }

    public static void main(String[] args) {
        int[] nums1 = {1,2,2,1};
        int[] nums2 = {2,2};
        IntersectionOfTwoArrays intersectionOfTwoArrays = new IntersectionOfTwoArrays();
        PrintUtils.printIntArray(intersectionOfTwoArrays.intersection(nums1, nums2));
    }
}
