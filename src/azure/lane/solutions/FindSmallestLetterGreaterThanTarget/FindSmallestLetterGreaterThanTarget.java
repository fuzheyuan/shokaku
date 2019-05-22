package azure.lane.solutions.FindSmallestLetterGreaterThanTarget;

/**
 * @author Zheyuan Fu
 * @date 2019.05.10
 */
public class FindSmallestLetterGreaterThanTarget {
    /**
     * Given a list of sorted characters letters containing only lowercase letters, and given a target letter target, find the smallest element in the list that is larger than the given target.
     *
     * Letters also wrap around. For example, if the target is target = 'z' and letters = ['a', 'b'], the answer is 'a'.
     *
     * Examples:
     * Input:
     * letters = ["c", "f", "j"]
     * target = "a"
     * Output: "c"
     *
     * Input:
     * letters = ["c", "f", "j"]
     * target = "c"
     * Output: "f"
     *
     * Input:
     * letters = ["c", "f", "j"]
     * target = "d"
     * Output: "f"
     *
     * Input:
     * letters = ["c", "f", "j"]
     * target = "g"
     * Output: "j"
     *
     * Input:
     * letters = ["c", "f", "j"]
     * target = "j"
     * Output: "c"
     *
     * Input:
     * letters = ["c", "f", "j"]
     * target = "k"
     * Output: "c"
     * Note:
     * letters has a length in range [2, 10000].
     * letters consists of lowercase letters, and contains at least 2 unique letters.
     * target is a lowercase letter.
     * */
    public char nextGreatestLetter(char[] letters, char target) {
        if(letters == null || letters.length == 0) return 0;

        char res = letters[0];
        int diff = letters[0] - target > 0 ? letters[0] - target : Integer.MAX_VALUE;
        for(int i = 1; i < letters.length; i ++) {
            if(letters[i] > target && letters[i] - target < diff) {
                diff = letters[i] - diff;
                res = letters[i];
            }
        }
        return res;
    }

    public static void main(String[] args) {
        char[] letters = {'c', 'f', 'j'};
        char target = 'j';
        FindSmallestLetterGreaterThanTarget findSmallestLetterGreaterThanTarget = new FindSmallestLetterGreaterThanTarget();
        System.out.println(findSmallestLetterGreaterThanTarget.nextGreatestLetter(letters, target));
    }
}
