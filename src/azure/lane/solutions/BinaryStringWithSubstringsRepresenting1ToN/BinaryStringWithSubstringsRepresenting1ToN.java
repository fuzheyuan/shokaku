package azure.lane.solutions.BinaryStringWithSubstringsRepresenting1ToN;

/**
 * @author Zheyuan Fu
 * @date 2019.05.22
 */
public class BinaryStringWithSubstringsRepresenting1ToN {
    /**
     * Given a binary string S (a string consisting only of '0' and '1's) and a positive integer N, return true if and only if for every integer X from 1 to N, the binary representation of X is a substring of S.
     *
     *
     *
     * Example 1:
     *
     * Input: S = "0110", N = 3
     * Output: true
     * Example 2:
     *
     * Input: S = "0110", N = 4
     * Output: false
     *
     *
     * Note:
     *
     * 1 <= S.length <= 1000
     * 1 <= N <= 10^9
     * */
    public boolean queryString(String S, int N) {
        if(N == 0) return S.contains("0");
        if(N == 1) return S.contains("1");

        return queryString(S, N - 1) && S.contains(intToString(N));
    }

    private String intToString(int num) {
        StringBuilder sb = new StringBuilder();
        while(num != 0) {
            sb.append(num ^ 1);
            num >>= 1;
        }
        return sb.reverse().toString();
    }
}
