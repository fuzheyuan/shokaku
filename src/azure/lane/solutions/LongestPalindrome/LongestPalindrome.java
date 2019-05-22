package azure.lane.solutions.LongestPalindrome;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Zheyuan Fu
 * @date 2019.05.09
 */
public class LongestPalindrome {
    /**
     * Given a string which consists of lowercase or uppercase letters, find the length of the longest palindromes that can be built with those letters.
     *
     * This is case sensitive, for example "Aa" is not considered a palindrome here.
     *
     * Note:
     * Assume the length of given string will not exceed 1,010.
     *
     * Example:
     *
     * Input:
     * "abccccdd"
     *
     * Output:
     * 7
     *
     * Explanation:
     * One longest palindrome that can be built is "dccaccd", whose length is 7.
     * */
    public int longestPalindrome(String s) {
        Map<Character, Integer> map = new HashMap<>();
        for(int i = 0; i < s.length(); i ++) {
            map.put(s.charAt(i), map.getOrDefault(s.charAt(i), 0) + 1);
        }
        boolean odd = false;
        for(Map.Entry<Character, Integer> entry : map.entrySet()) {
            if(entry.getValue() % 2 == 1) {
                odd = true;
            }
        }
        int res = 0;
        for(Map.Entry<Character, Integer> entry : map.entrySet()) {
            res += entry.getValue() / 2 * 2;
        }
        if(odd) res ++;
        return res;
    }
}
