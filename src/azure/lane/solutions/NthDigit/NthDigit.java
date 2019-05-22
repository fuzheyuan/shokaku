package azure.lane.solutions.NthDigit;

/**
 * @author Zheyuan Fu
 * @date 2019.05.21
 */
public class NthDigit {
    /**
     * Find the nth digit of the infinite integer sequence 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, ...
     *
     * Note:
     * n is positive and will fit within the range of a 32-bit signed integer (n < 231).
     *
     * Example 1:
     *
     * Input:
     * 3
     *
     * Output:
     * 3
     * Example 2:
     *
     * Input:
     * 11
     *
     * Output:
     * 0
     *
     * Explanation:
     * The 11th digit of the sequence 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, ... is a 0, which is part of the number 10.
     * */
    public int findNthDigit(int n) {
        int len = 1;
        long count = 9;
        int start = 1;
        while(n > len * count) {
            n -= len * count;
            start = start * 10;
            len ++;
            count = count * 10;
        }

        start = start + (n - 1) / len;
        String s = String.valueOf(start);
        return Character.getNumericValue(s.charAt((n - 1) % len));
    }

    public static void main(String[] args) {
        NthDigit nthDigit = new NthDigit();
        System.out.println(nthDigit.findNthDigit(2147483647));
    }
}
