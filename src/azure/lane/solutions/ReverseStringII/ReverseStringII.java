package azure.lane.solutions.ReverseStringII;

import azure.lane.utils.StringUtils;

/**
 * @author Zheyuan Fu
 * @date 2019.05.10
 */
public class ReverseStringII {
    /**
     * Given a string and an integer k, you need to reverse the first k characters for every 2k characters counting from the start of the string. If there are less than k characters left, reverse all of them. If there are less than 2k but greater than or equal to k characters, then reverse the first k characters and left the other as original.
     * Example:
     * Input: s = "abcdefg", k = 2
     * Output: "bacdfeg"
     * Restrictions:
     * The string consists of lower English letters only.
     * Length of the given string and k will in the range [1, 10000]
     * */
    public String reverseStr(String s, int k) {
        char[] array = s.toCharArray();
        int i = 0;
        while(i < array.length) {
            int j = Math.min(i + k - 1, array.length - 1);
            StringUtils.swap(array, i, j);
            i += 2 * k;
        }
        return String.valueOf(array);
    }

    public static void main(String[] args) {
        ReverseStringII reverseStringII = new ReverseStringII();
        String s = "abcd";
        System.out.println(reverseStringII.reverseStr(s, 4));
    }
}
