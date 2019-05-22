package azure.lane.solutions.FindCommonCharacters;

import azure.lane.utils.PrintUtils;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Zheyuan Fu
 * @date 2019.04.25
 */
public class FindCommonCharacters {
    /**
     * Given an array A of strings made only from lowercase letters, return a list of all characters that show up in all strings within the list (including duplicates).  For example, if a character occurs 3 times in all strings but not 4 times, you need to include that character three times in the final answer.
     *
     * You may return the answer in any order.
     *
     * Example 1:
     *
     * Input: ["bella","label","roller"]
     * Output: ["e","l","l"]
     * Example 2:
     *
     * Input: ["cool","lock","cook"]
     * Output: ["c","o"]
     *
     * Note:
     *
     * 1 <= A.length <= 100
     * 1 <= A[i].length <= 100
     * A[i][j] is a lowercase letter
     * */
    public List<String> commonChars(String[] A) {
        List<String> res = new ArrayList<>();
        if(A == null || A.length == 0) return res;

        int[][] dict = new int[A.length][26];
        for(int i = 0; i < A.length; i ++) {
            String word = A[i];
            for(char c : word.toCharArray()) {
                dict[i][c - 97] ++;
            }
        }

        for(int i = 0; i < 26; i ++) {
            Integer min = Integer.MAX_VALUE;
            for(int j = 0; j < A.length; j ++) {
                min = Math.min(dict[j][i], min);
            }

            for(int count = 0; count < min; count ++) {
                char temp = (char)(i + 97);
                res.add(String.valueOf(temp));
            }
        }

        return res;
    }

    public static void main(String[] args) {
        String[] array = {"bella","label","roller"};
        FindCommonCharacters findCommonCharacters = new FindCommonCharacters();
        PrintUtils.printStringArray(findCommonCharacters.commonChars(array));
    }
}
