package azure.lane.solutions.NumberofSegmentsinaString;

/**
 * @author Zheyuan Fu
 * @date 2019.05.13
 */
public class NumberofSegmentsinaString {
    /**
     * Count the number of segments in a string, where a segment is defined to be a contiguous sequence of non-space characters.
     *
     * Please note that the string does not contain any non-printable characters.
     *
     * Example:
     *
     * Input: "Hello, my name is John"
     * Output: 5
     * */
    public int countSegments(String s) {
        int count = 0;
        for(int i = 0; i < s.length(); i ++) {
            // current position is start of a new word
            if(s.charAt(i) != ' ' && (i == 0 || s.charAt(i - 1) == ' ')) {
                count ++;
            }
        }
        return count;
    }
}
