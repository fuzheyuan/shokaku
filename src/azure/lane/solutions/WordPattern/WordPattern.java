package azure.lane.solutions.WordPattern;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Zheyuan Fu
 * @date 2019.05.15
 */
public class WordPattern {
    /**
     * Given a pattern and a string str, find if str follows the same pattern.
     *
     * Here follow means a full match, such that there is a bijection between a letter in pattern and a non-empty word in str.
     *
     * Example 1:
     *
     * Input: pattern = "abba", str = "dog cat cat dog"
     * Output: true
     * Example 2:
     *
     * Input:pattern = "abba", str = "dog cat cat fish"
     * Output: false
     * Example 3:
     *
     * Input: pattern = "aaaa", str = "dog cat cat dog"
     * Output: false
     * Example 4:
     *
     * Input: pattern = "abba", str = "dog dog dog dog"
     * Output: false
     * Notes:
     * You may assume pattern contains only lowercase letters, and str contains lowercase letters that may be separated by a single space.
     * */
    public boolean wordPattern(String pattern, String str) {
        Map<Character, String> map = new HashMap<>();
        if(pattern == null || str == null || pattern.length() != str.split(" ").length) {
            return false;
        }
        char[] array = pattern.toCharArray();
        String[] strings = str.split(" ");
        for(int i = 0; i < pattern.length(); i ++) {
            if(!map.containsKey(array[i])) {
                 if(map.containsValue(strings[i])) {
                     return false;
                 }
                 map.put(array[i], strings[i]);
            } else {
                if(!map.get(array[i]).equals(strings[i])) {
                    return false;
                }
            }
        }
        return false;
    }

    public static void main(String[] args) {
        WordPattern wordPattern = new WordPattern();
        String pattern = "abba";
        String str = "dog cat cat dog";
        System.out.println(wordPattern.wordPattern(pattern, str));
    }
}
