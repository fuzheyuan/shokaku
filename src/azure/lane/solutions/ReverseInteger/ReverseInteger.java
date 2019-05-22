package azure.lane.solutions.ReverseInteger;

import com.sun.imageio.plugins.common.I18N;

/**
 * @author Zheyuan Fu
 * @date 2019.05.17
 */
public class ReverseInteger {
    /**
     * Given a 32-bit signed integer, reverse digits of an integer.
     *
     * Example 1:
     *
     * Input: 123
     * Output: 321
     * Example 2:
     *
     * Input: -123
     * Output: -321
     * Example 3:
     *
     * Input: 120
     * Output: 21
     * Note:
     * Assume we are dealing with an environment which could only store integers within the 32-bit signed integer range: [−231,  231 − 1]. For the purpose of this problem, assume that your function returns 0 when the reversed integer overflows.
     * */
    public int reverse(int x) {
        boolean flag = x > 0;

        if(x == Integer.MIN_VALUE) {
            x = Integer.MAX_VALUE;
        } else {
            x = Math.abs(x);
        }
        int res = 0;
        while(x != 0) {
            if(res > Integer.MAX_VALUE / 10 || (res == Integer.MAX_VALUE / 10 && x % 10 > 7)) {
                return 0;
            }
            res = res * 10 + x % 10;
            x /= 10;
        }

        return flag ? res : res * -1;
    }

    public static void main(String[] args) {
        ReverseInteger reverseInteger = new ReverseInteger();
//        System.out.println(reverseInteger.reverse(123));
//        System.out.println(reverseInteger.reverse(-123));
//        System.out.println(reverseInteger.reverse(Integer.MAX_VALUE));
        System.out.println(reverseInteger.reverse(-2147483648));
    }
}
