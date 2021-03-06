package azure.lane.solutions.CountPrimes;

/**
 * @author Zheyuan Fu
 * @date 2019.05.22
 */
public class CountPrimes {
    /**
     * Count the number of prime numbers less than a non-negative number, n.
     *
     * Example:
     *
     * Input: 10
     * Output: 4
     * Explanation: There are 4 prime numbers less than 10, they are 2, 3, 5, 7.
     * */
    public int countPrimes(int n) {
        boolean[] notPrime = new boolean[n];
        int count = 0;
        for(int i = 2; i < n; i ++) {
            if(!notPrime[i]) {
                count ++;
                for(int j = 2; i * j < n; j ++) {
                    notPrime[i * j] = true;
                }
            }
        }
        return count;
    }

    public static void main(String[] args) {
        CountPrimes countPrimes = new CountPrimes();
        countPrimes.countPrimes(10);
    }
}
