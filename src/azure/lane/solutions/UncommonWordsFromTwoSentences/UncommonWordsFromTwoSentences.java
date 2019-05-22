package azure.lane.solutions.UncommonWordsFromTwoSentences;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author Zheyuan Fu
 * @date 2019.04.29
 */
public class UncommonWordsFromTwoSentences {
    /**
     * We are given two sentences A and B.  (A sentence is a string of space separated words.  Each word consists only of lowercase letters.)
     *
     * A word is uncommon if it appears exactly once in one of the sentences, and does not appear in the other sentence.
     *
     * Return a list of all uncommon words.
     *
     * You may return the list in any order.
     *
     *
     *
     * Example 1:
     *
     * Input: A = "this apple is sweet", B = "this apple is sour"
     * Output: ["sweet","sour"]
     * Example 2:
     *
     * Input: A = "apple apple", B = "banana"
     * Output: ["banana"]
     * */
    public String[] uncommonFromSentences(String A, String B) {
        String[] arrayA = A.split(" ");
        String[] arrayB = B.split(" ");
        Map<String, Integer> count = new HashMap<>();
        for(int i = 0; i < Math.max(arrayA.length, arrayB.length); i ++) {
            if(i < arrayA.length) {
                count.put(arrayA[i], count.getOrDefault(arrayA[i], 0) + 1);
            }
            if(i < arrayB.length) {
                count.put(arrayB[i], count.getOrDefault(arrayB[i], 0) + 1);
            }
        }
        List<String> array = new ArrayList<>();
        for(Map.Entry<String, Integer> entry : count.entrySet()) {
            if(entry.getValue() == 1) {
                array.add(entry.getKey());
            }
        }
        String[] res = new String[array.size()];
        for(int i = 0; i < res.length; i ++ ){
            res[i] = array.get(i);
        }
        return res;
    }
}
