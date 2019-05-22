package azure.lane.solutions.ReverseOnlyLetters;

import azure.lane.utils.ArrayUtils;

/**
 * @author Zheyuan Fu
 * @date 2019.04.29
 */
public class ReverseOnlyLetters {
    /**
     * Given a string S, return the "reversed" string where all characters that are not a letter stay in the same place, and all letters reverse their positions.
     *
     *
     *
     * Example 1:
     *
     * Input: "ab-cd"
     * Output: "dc-ba"
     * Example 2:
     *
     * Input: "a-bC-dEf-ghIj"
     * Output: "j-Ih-gfE-dCba"
     * Example 3:
     *
     * Input: "Test1ng-Leet=code-Q!"
     * Output: "Qedo1ct-eeLg=ntse-T!"
     * */
    public String reverseOnlyLetters(String S) {
        if(S == null || S.length() == 1) return S;

        int left = 0, right = S.length() - 1;
        char[] array = S.toCharArray();
        while(left < right) {
            while(left < right &&
                    !((array[left] >= 'a' && array[left] <= 'z') ||
                    (array[left] >= 'A' && array[left] <= 'Z'))) {
                left ++;
            }
            while(right > left &&
                    !((array[right] >= 'a' && array[right] <= 'z') ||
                    (array[right] >= 'A' && array[right] <= 'Z'))) {
                right --;
            }
            ArrayUtils.swap(array, left ++, right --);
        }
        return new String(array);
    }

    public static void main(String[] args) {
        ReverseOnlyLetters reverseOnlyLetters = new ReverseOnlyLetters();
        System.out.println(reverseOnlyLetters.reverseOnlyLetters("Test1ng-Leet=code-Q!"));
    }

}
