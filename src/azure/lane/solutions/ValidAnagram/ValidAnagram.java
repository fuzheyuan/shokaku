package azure.lane.solutions.ValidAnagram;

/**
 * @author Zheyuan Fu
 * @date 2019.04.30
 */
public class ValidAnagram {
    /** *
     * Given two strings s and t , write a function to determine if t is an anagram of s.
     *
     * Example 1:
     *
     * Input: s = "anagram", t = "nagaram"
     * Output: true
     * Example 2:
     *
     * Input: s = "rat", t = "car"
     * Output: false
     * Note:
     * You may assume the string contains only lowercase alphabets.
     */

    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()) return false;

        int[] dict = new int[26];
        for(int i = 0; i < s.length(); i ++) {
            dict[s.charAt(i) - 'a'] ++;
            dict[t.charAt(i) - 'a'] --;
        }
        for(int i = 0; i < 26; i ++) {
            if(dict[i] != 0) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        String a = "a", b = "b";
        ValidAnagram validAnagram = new ValidAnagram();
        validAnagram.isAnagram(a, b);
    }
}
