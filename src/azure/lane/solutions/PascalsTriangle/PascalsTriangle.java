package azure.lane.solutions.PascalsTriangle;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Zheyuan Fu
 * @date 2019.05.10
 */
public class PascalsTriangle {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> res = new ArrayList<>();
        if(numRows <= 0) return res;

        for(int i = 0; i < numRows; i ++) {
            List<Integer> row = new ArrayList<>();
            for(int j = 0; j <= i; j ++) {
                if(j == 0 || j == i) {
                    row.add(1);
                }else{
                    row.add(res.get(i - 1).get(j - 1) + res.get(i - 1).get(j));
                }
            }
            res.add(row);
        }
        return res;
    }


    public static void main(String[] args) {
        PascalsTriangle pascalsTriangle = new PascalsTriangle();
        List<List<Integer>> res = pascalsTriangle.generate(5);
    }
}
