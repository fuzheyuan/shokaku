package azure.lane.solutions.ReverseWordsInAStringIII;

import azure.lane.utils.ArrayUtils;

/**
 * @author Zheyuan Fu
 * @date 2019.04.26
 */
public class ReverseWordsInAStringIII {
    /**
     * Given a string, you need to reverse the order of characters in each word within a sentence while still preserving whitespace and initial word order.
     *
     * Example 1:
     * Input: "Let's take LeetCode contest"
     * Output: "s'teL ekat edoCteeL tsetnoc"
     * Note: In the string, each word is separated by single space and there will not be any extra space in the string.
     * */
    public String reverseWords(String s) {
        if(s == null || s.length() == 0) return s;

        char[] array = s.toCharArray();
        for(int i = 0; i < s.length(); i ++) {
            if(array[i] != ' ') {
                int j = i;
                while(j + 1 < array.length && array[j + 1] != ' ') {
                    j ++;
                }
                ArrayUtils.swapFromTo(array, i, j);
                i = j;
            }
        }
        return String.valueOf(array);
    }

    public static void main(String[] args) {
        ReverseWordsInAStringIII reverseWordsInAStringIII = new ReverseWordsInAStringIII();
        String str = "Let's take LeetCode contest";
        System.out.println(reverseWordsInAStringIII.reverseWords(str));
    }
}
