package azure.lane.solutions.LetterCasePermutation;

import azure.lane.utils.PrintUtils;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Zheyuan Fu
 * @date 2019.04.29
 */
public class LetterCasePermutation {
    /**
     * Given a string S, we can transform every letter individually to be lowercase or uppercase to create another string.  Return a list of all possible strings we could create.
     *
     * Examples:
     * Input: S = "a1b2"
     * Output: ["a1b2", "a1B2", "A1b2", "A1B2"]
     *
     * Input: S = "3z4"
     * Output: ["3z4", "3Z4"]
     *
     * Input: S = "12345"
     * Output: ["12345"]
     * Note:
     *
     * S will be a string with length between 1 and 12.
     * S will consist only of letters or digits.
     * */
    public List<String> letterCasePermutation(String S) {
        List<String> res = new ArrayList<>();
        helper(S, res, "", 0);
        return res;
    }

    private void helper(String s, List<String> res, String cur, int start) {
        if(start == s.length() && cur.length() == s.length()) {
            res.add(cur);
            return ;
        }

        for(int i = start; i < s.length(); i ++) {
            if(s.charAt(i) >= 48 && s.charAt(i) <= 57) {
                helper(s, res, cur + s.charAt(i), i + 1);
                return ;
            }
            char temp = s.charAt(i);
            helper(s, res, cur + temp, i + 1);
            if(temp >= 97 && temp <= 122) {
                temp -= 32;
            } else if(temp >= 65 && temp <= 90) {
                temp += 32;
            }
            helper(s, res, cur + temp, i + 1);
        }
    }

    public static void main(String[] args) {
        LetterCasePermutation letterCasePermutation = new LetterCasePermutation();
        PrintUtils.printStringArray(letterCasePermutation.letterCasePermutation("a1b2"));
    }
}
