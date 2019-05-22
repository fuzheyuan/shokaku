package azure.lane.solutions.NextGreaterElementI;

import azure.lane.utils.PrintUtils;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Zheyuan Fu
 * @date 2019.04.29
 */
public class NextGreaterElementI {
    /**
     * You are given two arrays (without duplicates) nums1 and nums2 where nums1’s elements are subset of nums2. Find all the next greater numbers for nums1's elements in the corresponding places of nums2.
     *
     * The Next Greater Number of a number x in nums1 is the first greater number to its right in nums2. If it does not exist, output -1 for this number.
     *
     * Example 1:
     * Input: nums1 = [4,1,2], nums2 = [1,3,4,2].
     * Output: [-1,3,-1]
     * Explanation:
     *     For number 4 in the first array, you cannot find the next greater number for it in the second array, so output -1.
     *     For number 1 in the first array, the next greater number for it in the second array is 3.
     *     For number 2 in the first array, there is no next greater number for it in the second array, so output -1.
     * Example 2:
     * Input: nums1 = [2,4], nums2 = [1,2,3,4].
     * Output: [3,-1]
     * Explanation:
     *     For number 2 in the first array, the next greater number for it in the second array is 3.
     *     For number 4 in the first array, there is no next greater number for it in the second array, so output -1.
     * Note:
     * All elements in nums1 and nums2 are unique.
     * The length of both nums1 and nums2 would not exceed 1000.
     * */
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int[] res = new int[nums1.length];
        for(int i = 0; i < nums1.length; i ++) {
            res[i] = -1;
        }
        Map<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i < nums2.length; i ++) {
            map.put(nums2[i], i);
        }

        for(int i = 0; i < nums1.length; i ++) {
            int index = map.get(nums1[i]);
            for(int j = index + 1; j < nums2.length; j ++) {
                if(nums2[j] > nums1[i]) {
                    res[i] = nums2[j];
                    break;
                }
            }
        }
        return res;
    }

    public static void main(String[] args) {
        NextGreaterElementI nextGreaterElementI = new NextGreaterElementI();
        int[] nums1 = {4,1,2};
        int[] nums2 = {1,3,4,2};
        PrintUtils.printIntArray(nextGreaterElementI.nextGreaterElement(nums1, nums2));
    }
}
