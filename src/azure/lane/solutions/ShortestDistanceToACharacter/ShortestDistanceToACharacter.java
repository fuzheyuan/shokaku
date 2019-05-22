package azure.lane.solutions.ShortestDistanceToACharacter;

import azure.lane.utils.PrintUtils;

/**
 * @author Zheyuan Fu
 * @date 2019.04.26
 */
public class ShortestDistanceToACharacter {
    /**
     * Given a string S and a character C, return an array of integers representing the shortest distance from the character C in the string.
     *
     * Example 1:
     *
     * Input: S = "loveleetcode", C = 'e'
     * Output: [3, 2, 1, 0, 1, 0, 0, 1, 2, 2, 1, 0]
     *
     *
     * Note:
     *
     * S string length is in [1, 10000].
     * C is a single character, and guaranteed to be in string S.
     * All letters in S and C are lowercase.
     * */
    public int[] shortestToChar(String S, char C) {
        int[] res = new int[S.length()];
        for(int i = 0; i < res.length; i ++) {
            res[i] = 10000;
        }

        for(int i = 0; i < S.length(); i ++) {
            if(S.charAt(i) == C) {
                res[i] = 0;
                for(int j = i - 1; j >= 0; j --) {
                    res[j] = Math.min(res[j], i - j);
                }
                for(int j = i + 1; j < S.length(); j ++) {
                    res[j] = Math.min(res[j], j - i);
                }
            }
        }
        return res;
    }

    public static void main(String[] args) {
        ShortestDistanceToACharacter shortestDistanceToACharacter = new ShortestDistanceToACharacter();
        String str = "loveleetcode";
        char c = 'e';
        PrintUtils.printIntArray(shortestDistanceToACharacter.shortestToChar(str, c));
    }
}
