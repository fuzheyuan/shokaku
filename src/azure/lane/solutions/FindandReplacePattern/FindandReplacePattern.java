package azure.lane.solutions.FindandReplacePattern;

import azure.lane.utils.PrintUtils;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author Zheyuan Fu
 * @date 2019.05.22
 */
public class FindandReplacePattern {
    /**
     * You have a list of words and a pattern, and you want to know which words in words matches the pattern.
     *
     * A word matches the pattern if there exists a permutation of letters p so that after replacing every letter x in the pattern with p(x), we get the desired word.
     *
     * (Recall that a permutation of letters is a bijection from letters to letters: every letter maps to another letter, and no two letters map to the same letter.)
     *
     * Return a list of the words in words that match the given pattern.
     *
     * You may return the answer in any order.
     *
     *
     *
     * Example 1:
     *
     * Input: words = ["abc","deq","mee","aqq","dkd","ccc"], pattern = "abb"
     * Output: ["mee","aqq"]
     * Explanation: "mee" matches the pattern because there is a permutation {a -> m, b -> e, ...}.
     * "ccc" does not match the pattern because {a -> c, b -> c, ...} is not a permutation,
     * since a and b map to the same letter.
     *
     *
     * Note:
     *
     * 1 <= words.length <= 50
     * 1 <= pattern.length = words[i].length <= 20
     * */
    public List<String> findAndReplacePattern(String[] words, String pattern) {
        List<String> res = new ArrayList<>();
        if(words == null || words.length == 0 || pattern.length() == 0) return res;

        char[] pat = pattern.toCharArray();
        for(String word : words) {
            if(match(word, pattern)) {
                res.add(word);
            }
        }
        return res;
    }

    public boolean match(String word, String pattern) {
        if(word.length() != pattern.length()) {
            return false;
        }

        Map<Character, Character> map = new HashMap<>();
        for(int i = 0; i < word.length(); i ++) {
            char w = word.charAt(i), p = pattern.charAt(i);
            if(!map.containsKey(w) && !map.containsValue(p)) {
                map.put(w, p);
            } else if(!map.containsValue(p)) {
                return false;
            } else if(!map.containsKey(w)) {
                for(Map.Entry<Character, Character> entry : map.entrySet()) {
                    if(entry.getValue() == p && entry.getKey() != w) {
                        return false;
                    }
                }
            } else {
                if(map.get(w) != p) {
                     return false;
                }
            }
        }
        return true;
    }

    public static void main(String[] args) {
        FindandReplacePattern findandReplacePattern = new FindandReplacePattern();
        String[] words = {"abc","deq","mee","aqq","dkd","ccc"};
        String pattern = "abb";
        PrintUtils.printStringArray(findandReplacePattern.findAndReplacePattern(words, pattern));
    }
}
