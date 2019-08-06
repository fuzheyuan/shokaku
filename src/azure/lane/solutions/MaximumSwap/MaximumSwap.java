package azure.lane.solutions.MaximumSwap;

/**
 * @author Zheyuan Fu
 * @date 2019.07.22
 */
public class MaximumSwap {
    public int maximumSwap(int num) {
        int[] multi = makeMultiArray(num);

        String str = String.valueOf(num);
        int len = String.valueOf(num).length();
        int[][] dp = new int[len - 1][len - 1];
        for(int i = 0; i < len; i ++) {
            for(int j = 0; j < len; j ++) {
                int num1 = dp[i - 1][j - 1] * 10 + str.charAt(i);
                int num2 = dp[i - 1][j] +
            }
        }
    }

    private int[] makeMultiArray(int num) {
        int len = String.valueOf(num).length();
        int[] res = new int[len];
        res[len - 1] = 10;
        for(int i = len - 2; i >= 0; i --) {
            res[i] = res[i + 1] * 10;
        }
        return res;
    }
}
