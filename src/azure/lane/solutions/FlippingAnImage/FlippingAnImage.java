package azure.lane.solutions.FlippingAnImage;

/**
 * @author Zheyuan Fu
 * @date 2019.04.24
 */
public class FlippingAnImage {
    /**
     * Given a binary matrix A, we want to flip the image horizontally, then invert it, and return the resulting image.
     * <p>
     * To flip an image horizontally means that each row of the image is reversed.  For example, flipping [1, 1, 0] horizontally results in [0, 1, 1].
     * <p>
     * To invert an image means that each 0 is replaced by 1, and each 1 is replaced by 0. For example, inverting [0, 1, 1] results in [1, 0, 0].
     * <p>
     * Example 1:
     * <p>
     * Input: [[1,1,0],[1,0,1],[0,0,0]]
     * Output: [[1,0,0],[0,1,0],[1,1,1]]
     * Explanation: First reverse each row: [[0,1,1],[1,0,1],[0,0,0]].
     * Then, invert the image: [[1,0,0],[0,1,0],[1,1,1]]
     * Example 2:
     * <p>
     * Input: [[1,1,0,0],[1,0,0,1],[0,1,1,1],[1,0,1,0]]
     * Output: [[1,1,0,0],[0,1,1,0],[0,0,0,1],[1,0,1,0]]
     * Explanation: First reverse each row: [[0,0,1,1],[1,0,0,1],[1,1,1,0],[0,1,0,1]].
     * Then invert the image: [[1,1,0,0],[0,1,1,0],[0,0,0,1],[1,0,1,0]]
     * Notes:
     * <p>
     * 1 <= A.length = A[0].length <= 20
     * 0 <= A[i][j] <= 1
     */
    public int[][] flipAndInvertImage(int[][] A) {
        int[][] res = A;
        flip(res);
        invert(res);
        return res;
    }

    private void flip(int[][] image) {
        for(int i = 0; i < image.length; i ++) {
            int j = 0, k = image[0].length - 1;
            while(j < k) {
                int temp = image[i][j];
                image[i][j] = image[i][k];
                image[i][k] = temp;
                j ++; k --;
            }
        }
    }

    private void invert(int[][] image) {
        for(int i = 0; i < image.length; i ++) {
            for(int j = 0; j < image[i].length; j ++) {
                image[i][j] = image[i][j] ^ 1;
            }
        }
    }

    public static void main(String[] args) {

    }
}
