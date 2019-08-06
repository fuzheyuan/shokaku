package azure.lane.solutions.PrimalNumberLoop;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Zheyuan Fu
 * @date 2019.07.02
 */
public class PrimalNumberLoop {
    public List<List<Integer>> findPrimalNumberLoop(int n) {
        int[] array = new int[n];
        for(int i = 0; i < n; i ++) {
            array[i] = i + 1;
        }

        List<List<Integer>> res = new ArrayList<>();
        boolean[] used = new boolean[n];
        for(int i = 1; i <= n; i ++) {
            array[i] = i;
            helper(res, new ArrayList<>(), array, 0, n, used, buildPrimalList(n));
        }
        return res;
    }

    private void helper(List<List<Integer>> res, List<Integer> cur, int[] array, int start, int n, boolean[] used, boolean[] primalList) {
        if(used[start]) return ;
        if(start == n - 1 && primalList[array[start] + array[start - 1]]) {
            cur.add(array[start]);
            res.add(new ArrayList<>(cur));
            return ;
        }
        for(int i = start; i >= 1 && i < n && used[i]; i ++) {
            if(primalList[array[i] + array[i - 1]]) {
                cur.add(array[i]);
                used[i] = true;
                helper(res, cur, array, i + 1, n, used, primalList);
                cur.remove(res.size() - 1);
                used[i] = false;
            }
        }
    }

    private boolean[] buildPrimalList(int n) {
        boolean[] notPrime = new boolean[n + n];
        notPrime[0] = true; notPrime[1] = false;
        for(int i = 2; i < 2 * n; i ++) {
            if(notPrime[i]) continue;
            for(int j = 2; j < i; j ++) {
                notPrime[i * j] = true;
            }
        }
        return notPrime;
    }

    public static void main(String[] args) {

    }
}
