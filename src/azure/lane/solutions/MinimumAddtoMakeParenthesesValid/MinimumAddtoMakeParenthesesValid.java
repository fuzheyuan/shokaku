package azure.lane.solutions.MinimumAddtoMakeParenthesesValid;

import java.util.Stack;

/**
 * @author Zheyuan Fu
 * @date 2019.05.22
 */
public class MinimumAddtoMakeParenthesesValid {
    /**
     * Given a string S of '(' and ')' parentheses, we add the minimum number of parentheses ( '(' or ')', and in any positions ) so that the resulting parentheses string is valid.
     *
     * Formally, a parentheses string is valid if and only if:
     *
     * It is the empty string, or
     * It can be written as AB (A concatenated with B), where A and B are valid strings, or
     * It can be written as (A), where A is a valid string.
     * Given a parentheses string, return the minimum number of parentheses we must add to make the resulting string valid.
     * */
    public int minAddToMakeValid(String S) {
        Stack<Character> stack = new Stack<>();
        if(S == null || S.length() == 0) return 0;

        for(char c : S.toCharArray()) {
            if(stack.isEmpty() || c == '(') {
                stack.push(c);
            } else {
                if(stack.peek() == '(' && c == ')') {
                    stack.pop();
                } else {
                    stack.push(c);
                }
            }
        }

        return stack.size();
    }
}
