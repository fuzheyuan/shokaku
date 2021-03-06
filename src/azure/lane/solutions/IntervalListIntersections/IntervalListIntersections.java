package azure.lane.solutions.IntervalListIntersections;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Zheyuan Fu
 * @date 2019.07.16
 */
public class IntervalListIntersections {
    /**
     * Given two lists of closed intervals, each list of intervals is pairwise disjoint and in sorted order.
     *
     * Return the intersection of these two interval lists.
     *
     * (Formally, a closed interval [a, b] (with a <= b) denotes the set of real numbers x with a <= x <= b.  The intersection of two closed intervals is a set of real numbers that is either empty, or can be represented as a closed interval.  For example, the intersection of [1, 3] and [2, 4] is [2, 3].)
     *
     *
     *
     * Example 1:
     *
     *
     *
     * Input: A = [[0,2],[5,10],[13,23],[24,25]], B = [[1,5],[8,12],[15,24],[25,26]]
     * Output: [[1,2],[5,5],[8,10],[15,23],[24,24],[25,25]]
     * Reminder: The inputs and the desired output are lists of Interval objects, and not arrays or lists.
     *
     *
     * Note:
     *
     * 0 <= A.length < 1000
     * 0 <= B.length < 1000
     * 0 <= A[i].start, A[i].end, B[i].start, B[i].end < 10^9
     * NOTE: input types have been changed on April 15, 2019. Please reset to default code definition to get new method signature.
     * */
    public int[][] intervalIntersection(int[][] A, int[][] B) {
        List<int[]> res = new ArrayList<>();
        if(A == null || A.length == 0 || A[0].length == 0|| B == null || B.length == 0 || B[0].length == 0) return new int[0][0];

        int i = 0, j = 0;
        while(i < A.length && j < B.length) {
            int[] common = getCommon(A[i], B[j]);
            if(common != null) res.add(common);
            if(A[i][1] <= B[j][1]) {
                i ++;
            } else {
                j ++;
            }
        }
        int[][] ans = new int[res.size()][2];
        for(int idx = 0; idx < ans.length; idx ++) {
            ans[idx] = res.get(idx);
        }

        return ans;
    }
    private int[] getCommon(int[] a, int[] b) {
        if(b[0] > a[1] || a[0] > b[1]) return null;
        return new int[]{Math.max(a[0], b[0]), Math.min(a[1], b[1])};
    }
}
