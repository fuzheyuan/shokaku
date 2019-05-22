package azure.lane.solutions.DetectCapital;

/**
 * @author Zheyuan Fu
 * @date 2019.04.30
 */
public class DetectCapital {
    /**
     * Given a word, you need to judge whether the usage of capitals in it is right or not.
     *
     * We define the usage of capitals in a word to be right when one of the following cases holds:
     *
     * All letters in this word are capitals, like "USA".
     * All letters in this word are not capitals, like "leetcode".
     * Only the first letter in this word is capital if it has more than one letter, like "Google".
     * Otherwise, we define that this word doesn't use capitals in a right way.
     * Example 1:
     * Input: "USA"
     * Output: True
     * Example 2:
     * Input: "FlaG"
     * Output: False
     * Note: The input will be a non-empty word consisting of uppercase and lowercase latin letters.
     * */
    public boolean detectCapitalUse(String word) {
        if(word == null || word.length() == 0) return true;
        char[] array = word.toCharArray();
        int count = 0;
        for(int i = 0; i < array.length; i ++) {
            if('Z' - array[i] >= 0) {
                count ++;
            }
        }

        return (count == 0 || count == word.length()) || (count == 1 && 'Z' - word.charAt(0) >= 0);
    }
    public static void main(String[] args) {
        DetectCapital detectCapital = new DetectCapital();
        System.out.println(detectCapital.detectCapitalUse("USA"));
        System.out.println(detectCapital.detectCapitalUse("google"));
        System.out.println(detectCapital.detectCapitalUse("FlaG"));
    }
}
