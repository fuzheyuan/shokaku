package azure.lane.solutions.FindAllAnagramsinaString;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Zheyuan Fu
 * @date 2019.05.13
 */
public class FindAllAnagramsinaString {
    /**
     * Given a string s and a non-empty string p, find all the start indices of p's anagrams in s.
     *
     * Strings consists of lowercase English letters only and the length of both strings s and p will not be larger than 20,100.
     *
     * The order of output does not matter.
     *
     * Example 1:
     *
     * Input:
     * s: "cbaebabacd" p: "abc"
     *
     * Output:
     * [0, 6]
     *
     * Explanation:
     * The substring with start index = 0 is "cba", which is an anagram of "abc".
     * The substring with start index = 6 is "bac", which is an anagram of "abc".
     * Example 2:
     *
     * Input:
     * s: "abab" p: "ab"
     *
     * Output:
     * [0, 1, 2]
     *
     * Explanation:
     * The substring with start index = 0 is "ab", which is an anagram of "ab".
     * The substring with start index = 1 is "ba", which is an anagram of "ab".
     * The substring with start index = 2 is "ab", which is an anagram of "ab".
     * */
    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> res = new ArrayList<>();

        for(int i = 0; i <= s.length() - p.length(); i ++) {
            String subS = s.substring(i, i + p.length());
            if(isAnagrams(subS, p)) {
                res.add(i);
            }
        }

        return res;
    }

    private boolean isAnagrams(String s, String t) {
        if(s.length() != t.length()) return false;
        char[] count = new char[26];
        char[] arrayS = s.toCharArray(), arrayT = t.toCharArray();
        for(int i = 0; i < s.length(); i ++) {
            count[arrayS[i] - 'a'] ++;
            count[arrayT[i] - 'a'] --;
        }
        for(int i = 0; i < 26; i ++) {
            if(count[i] != 0) return false;
        }
        return true;
    }

    public static void main(String[] args) {
       String s = "cbaebabacd";
       String p = "abc";
       FindAllAnagramsinaString findAllAnagramsinaString = new FindAllAnagramsinaString();
       findAllAnagramsinaString.findAnagrams(s, p);
    }
}
