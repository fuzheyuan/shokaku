package azure.lane.solutions.ValidPalindromeII;

/**
 * @author Zheyuan Fu
 * @date 2019.05.16
 */
public class ValidPalindromeII {
    /**
     * Given a non-empty string s, you may delete at most one character. Judge whether you can make it a palindrome.
     *
     * Example 1:
     * Input: "aba"
     * Output: True
     * Example 2:
     * Input: "abca"
     * Output: True
     * Explanation: You could delete the character 'c'.
     * Note:
     * The string will only contain lowercase characters a-z. The maximum length of the string is 50000.
     * */
    public boolean validPalindrome(String s) {
        int start = 0, end = s.length() - 1;
        while(start < end) {
            if(s.charAt(start) != s.charAt(end)) {
                return isPalindromic(s, start, end - 1) || isPalindromic(s, start + 1, end);
            }
            start ++;
            end --;
        }
        return true;
    }

    private boolean isPalindromic(String s, int start, int end) {
        while(start < end) {
            if(s.charAt(start) != s.charAt(end)) {
                return false;
            }
            start ++;
            end --;
        }
        return true;
    }
}
