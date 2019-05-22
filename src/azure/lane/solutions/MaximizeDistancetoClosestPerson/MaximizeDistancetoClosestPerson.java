package azure.lane.solutions.MaximizeDistancetoClosestPerson;

/**
 * @author Zheyuan Fu
 * @date 2019.05.13
 */
public class MaximizeDistancetoClosestPerson {
    /**
     * In a row of seats, 1 represents a person sitting in that seat, and 0 represents that the seat is empty.
     *
     * There is at least one empty seat, and at least one person sitting.
     *
     * Alex wants to sit in the seat such that the distance between him and the closest person to him is maximized.
     *
     * Return that maximum distance to closest person.
     *
     * Example 1:
     *
     * Input: [1,0,0,0,1,0,1]
     * Output: 2
     * Explanation:
     * If Alex sits in the second open seat (seats[2]), then the closest person has distance 2.
     * If Alex sits in any other open seat, the closest person has distance 1.
     * Thus, the maximum distance to the closest person is 2.
     * Example 2:
     *
     * Input: [1,0,0,0]
     * Output: 3
     * Explanation:
     * If Alex sits in the last seat, the closest person is 3 seats away.
     * This is the maximum distance possible, so the answer is 3.
     * Note:
     *
     * 1 <= seats.length <= 20000
     * seats contains only 0s or 1s, at least one 0, and at least one 1.
     * */
    public int maxDistToClosest(int[] seats) {
        if(seats == null || seats.length == 0) return 0;

        int max = 0, res = -1;
        for(int i = 0; i < seats.length; i ++) {
            int left = i - 1, right = i + 1;
            while(left >= 0 && seats[left] == 0) {
                left --;
            }
            while(right < seats.length && seats[right] == 0) {
                right ++;
            }
            int closest = Math.min(i - left + 1, right - i + 1);
            if(res == -1 || max < closest) {
                max = closest;
                res = i;
            }
        }
        return res;
    }
}
