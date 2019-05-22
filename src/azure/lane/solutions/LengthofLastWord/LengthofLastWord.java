package azure.lane.solutions.LengthofLastWord;

/**
 * @author Zheyuan Fu
 * @date 2019.05.20
 */
public class LengthofLastWord {
    /**
     * Given a string s consists of upper/lower-case alphabets and empty space characters ' ', return the length of last word in the string.
     * <p>
     * If the last word does not exist, return 0.
     * <p>
     * Note: A word is defined as a character sequence consists of non-space characters only.
     * <p>
     * Example:
     * <p>
     * Input: "Hello World"
     * Output: 5
     */
    public int lengthOfLastWord(String s) {
        if (s == null || s.trim().length() == 0) return 0;
        int i = s.length() - 1;
        while (i > 0 && s.charAt(i) == ' ') i--;
        int end = i;
        while (i >= 0 && s.charAt(i) != ' ') {
            i--;
        }
        return end - i;
    }

    public static void main(String[] args) {
        LengthofLastWord lengthofLastWord = new LengthofLastWord();
        System.out.println(lengthofLastWord.lengthOfLastWord("a"));
    }
}
