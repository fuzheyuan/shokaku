package azure.lane.solutions.NRepeatedElementInSize2NArray;

import java.util.HashSet;
import java.util.Set;

/**
 * @author Zheyuan Fu
 * @date 2019.04.24
 */
public class NRepeatedElementInSize2NArray {
    /**
     * In a array A of size 2N, there are N+1 unique elements, and exactly one of these elements is repeated N times.
     *
     * Return the element repeated N times.
     *
     *
     *
     * Example 1:
     *
     * Input: [1,2,3,3]
     * Output: 3
     * Example 2:
     *
     * Input: [2,1,2,5,3,2]
     * Output: 2
     * Example 3:
     *
     * Input: [5,1,5,2,5,3,5,4]
     * Output: 5
     *
     *
     * Note:
     *
     * 4 <= A.length <= 10000
     * 0 <= A[i] < 10000
     * A.length is even
     * */
    public int repeatedNTimes(int[] A) {
        if(A ==  null || A.length == 0) {
            return 0;
        }
        Set<Integer> set = new HashSet<>();
        for(int num : A) {
            if(!set.add(num)) {
                return num;
            }
        }
        return 0;
    }

    public static void main(String[] args) {

    }
}
