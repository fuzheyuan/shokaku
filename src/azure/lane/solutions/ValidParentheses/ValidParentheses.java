package azure.lane.solutions.ValidParentheses;

import java.util.Stack;

/**
 * @author Zheyuan Fu
 * @date 2019.05.14
 */
public class ValidParentheses {
    /**
     * Given a string containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.
     *
     * An input string is valid if:
     *
     * Open brackets must be closed by the same type of brackets.
     * Open brackets must be closed in the correct order.
     * Note that an empty string is also considered valid.
     *
     * Example 1:
     *
     * Input: "()"
     * Output: true
     * Example 2:
     *
     * Input: "()[]{}"
     * Output: true
     * Example 3:
     *
     * Input: "(]"
     * Output: false
     * Example 4:
     *
     * Input: "([)]"
     * Output: false
     * Example 5:
     *
     * Input: "{[]}"
     * Output: true
     * */
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        if(s == null || s.length() == 0) return true;
        char[] array = s.toCharArray();
        stack.push(array[0]);
        for(int i = 1; i < array.length; i ++) {
            if(array[i] == '(' || array[i] == '[' || array[i] == '{') {
                stack.push(array[i]);
            } else if(!stack.isEmpty() && array[i] == ')' && stack.peek() == '(') {
                stack.pop();
            } else if(!stack.isEmpty() && array[i] == ']' && stack.peek() == '[') {
                stack.pop();
            } else if(!stack.isEmpty() && array[i] == '}' && stack.peek() == '{') {
                stack.pop();
            } else {
                return false;
            }
        }
        return stack.isEmpty();
    }

    public static void main(String[] args) {
        ValidParentheses validParentheses = new ValidParentheses();
        String s1 = "[])";
        System.out.println(validParentheses.isValid(s1));
    }
}
