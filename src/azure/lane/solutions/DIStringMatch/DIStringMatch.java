package azure.lane.solutions.DIStringMatch;

import azure.lane.utils.PrintUtils;

/**
 * @author Zheyuan Fu
 * @date 2019.04.24
 */
public class DIStringMatch {
    /**
     * Given a string S that only contains "I" (increase) or "D" (decrease), let N = S.length.
     *
     * Return any permutation A of [0, 1, ..., N] such that for all i = 0, ..., N-1:
     *
     * If S[i] == "I", then A[i] < A[i+1]
     * If S[i] == "D", then A[i] > A[i+1]
     *
     *
     * Example 1:
     *
     * Input: "IDID"
     * Output: [0,4,1,3,2]
     * Example 2:
     *
     * Input: "III"
     * Output: [0,1,2,3]
     * Example 3:
     *
     * Input: "DDI"
     * Output: [3,2,0,1]
     *
     *
     * Note:
     *
     * 1 <= S.length <= 10000
     * S only contains characters "I" or "D".
     * */
    public int[] diStringMatch(String S) {
        int[] res = new int[S.length() + 1];
        int high = S.length(), low = 1;
        int index = 0;
        res[index ++] = 0;
        for(Character c : S.toCharArray()) {
            if(c == 'D') {
                res[index] = high;
                high --;
            } else{
                res[index] = low;
                low ++;
            }
            index ++;
        }
        return res;
    }

    public static void main(String[] args) {
        String s1 = "IDID", s2 = "III", s3 = "DDI";
        DIStringMatch diStringMatch = new DIStringMatch();
        PrintUtils.printIntArray(diStringMatch.diStringMatch(s1));
        PrintUtils.printIntArray(diStringMatch.diStringMatch(s2));
        PrintUtils.printIntArray(diStringMatch.diStringMatch(s3));
    }
}
