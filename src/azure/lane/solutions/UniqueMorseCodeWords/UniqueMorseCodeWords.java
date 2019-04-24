package azure.lane.solutions.UniqueMorseCodeWords;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * @author Zheyuan Fu
 * @date 2019.04.24
 */
public class UniqueMorseCodeWords {
    /**
     * International Morse Code defines a standard encoding where each letter is mapped to a series of dots and dashes, as follows: "a" maps to ".-", "b" maps to "-...", "c" maps to "-.-.", and so on.
     *
     * For convenience, the full table for the 26 letters of the English alphabet is given below:
     *
     * ["a.-","b-...","c-.-.","d-..","e.","f..-.","g--.","h....","i..","j.---","k-.-","l.-..","m--","n-.","o---","p.--.","q--.-","r.-.","s...","t-","u..-","v...-","w.--","x-..-","y-.--","z--.."]
     * Now, given a list of words, each word can be written as a concatenation of the Morse code of each letter. For example, "cba" can be written as "-.-..--...", (which is the concatenation "-.-." + "-..." + ".-"). We'll call such a concatenation, the transformation of a word.
     *
     * Return the number of different transformations among all words we have.
     *
     * Example:
     * Input: words = ["gin", "zen", "gig", "msg"]
     * Output: 2
     * Explanation:
     * The transformation of each word is:
     * "gin" -> "--...-."
     * "zen" -> "--...-."
     * "gig" -> "--...--."
     * "msg" -> "--...--."
     *
     * There are 2 different transformations, "--...-." and "--...--.".
     * Note:
     *
     * The length of words will be at most 100.
     * Each words[i] will have length in range [1, 12].
     * words[i] will only consist of lowercase letters.
     * */
    public int uniqueMorseRepresentations(String[] words) {
        if(words == null || words.length == 0) {
            return -1;
        }
        Map<Character, String> morses = new HashMap<>();
        morses.put('a', ".-");
        morses.put('b', "-...");
        morses.put('c', "-.-.");
        morses.put('d', "-..");
        morses.put('e', ".");
        morses.put('f', "..-.");
        morses.put('g', "--.");
        morses.put('h', "....");
        morses.put('i', "..");
        morses.put('j', ".---");
        morses.put('k', "-.-");
        morses.put('l', ".-..");
        morses.put('m', "--");
        morses.put('n', "-.");
        morses.put('o', "---");
        morses.put('p', ".--.");
        morses.put('q', "--.-");
        morses.put('r', ".-.");
        morses.put('s', "...");
        morses.put('t', "-");
        morses.put('u', "..-");
        morses.put('v', "...-");
        morses.put('w', ".--");
        morses.put('x', "-..-");
        morses.put('y', "-.--");
        morses.put('z', "--..");

        Set<String> sets = new HashSet<>();
        for(String word : words) {
            StringBuilder sb = new StringBuilder();
            for(Character c : word.toCharArray()) {
                sb.append(morses.get(c));
            }
            sets.add(sb.toString());
            sb.delete(0, sb.toString().length() - 1);
        }
        return sets.size();
    }

    public static void main(String[] args) {
        UniqueMorseCodeWords uniqueMorseCodeWords = new UniqueMorseCodeWords();
        String[] words = new String[4];
        words[0] = "gin";
        words[1] = "zen";
        words[2] = "gig";
        words[3] = "msg";
        System.out.println(uniqueMorseCodeWords.uniqueMorseRepresentations(words));
    }
}
