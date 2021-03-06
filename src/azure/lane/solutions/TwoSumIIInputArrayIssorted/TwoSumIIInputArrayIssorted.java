package azure.lane.solutions.TwoSumIIInputArrayIssorted;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Zheyuan Fu
 * @date 2019.05.08
 */
public class TwoSumIIInputArrayIssorted {
    /**
     * Given an array of integers that is already sorted in ascending order, find two numbers such that they add up to a specific target number.
     *
     * The function twoSum should return indices of the two numbers such that they add up to the target, where index1 must be less than index2.
     *
     * Note:
     *
     * Your returned answers (both index1 and index2) are not zero-based.
     * You may assume that each input would have exactly one solution and you may not use the same element twice.
     * Example:
     *
     * Input: numbers = [2,7,11,15], target = 9
     * Output: [1,2]
     * Explanation: The sum of 2 and 7 is 9. Therefore index1 = 1, index2 = 2.
     * */
    public int[] twoSum(int[] numbers, int target) {
        int[] res = new int[2];
        res[0] = -1; res[1] = -1;
        Map<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i < numbers.length; i ++) {
            if(map.containsKey(numbers[i])) {
                res[0] = map.get(numbers[i]) + 1;
                res[1] = i + 1;
                return res;
            } else {
                map.put(target - numbers[i], i);
            }
        }
        return res;
    }
}
