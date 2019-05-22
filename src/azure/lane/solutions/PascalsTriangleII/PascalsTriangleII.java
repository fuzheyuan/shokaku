package azure.lane.solutions.PascalsTriangleII;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Zheyuan Fu
 * @date 2019.05.13
 */
public class PascalsTriangleII {
    /**
     * Given a non-negative index k where k ≤ 33, return the kth index row of the Pascal's triangle.
     *
     * Note that the row index starts from 0.
     *
     *
     * In Pascal's triangle, each number is the sum of the two numbers directly above it.
     *
     * Example:
     *
     * Input: 3
     * Output: [1,3,3,1]
     * Follow up:
     *
     * Could you optimize your algorithm to use only O(k) extra space?
     * */
    public List<Integer> getRow(int rowIndex) {
        List<Integer> res = new ArrayList<>();

        for(int i = 0; i <= rowIndex; i ++) {
            List<Integer> pre = res;
            res = new ArrayList<>();
            for(int j = 0; j <= i; j ++) {
                if(j == 0 || j == i) {
                    res.add(1);
                } else {
                    res.add(pre.get(j - 1) + pre.get(j));
                }
            }
            if(i == rowIndex) return res;
        }
        return res;
    }

    public static void main(String[] args) {
        PascalsTriangleII pascalsTriangleII = new PascalsTriangleII();
        List<Integer> res = pascalsTriangleII.getRow(5);
    }
}
