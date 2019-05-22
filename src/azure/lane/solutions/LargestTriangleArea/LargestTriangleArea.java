package azure.lane.solutions.LargestTriangleArea;

/**
 * @author Zheyuan Fu
 * @date 2019.04.30
 */
public class LargestTriangleArea {
    /**
     * You have a list of points in the plane. Return the area of the largest triangle that can be formed by any 3 of the points.
     *
     * Example:
     * Input: points = [[0,0],[0,1],[1,0],[0,2],[2,0]]
     * Output: 2
     * Explanation:
     * The five points are show in the figure below. The red triangle is the largest.
     *
     *
     * Notes:
     *
     * 3 <= points.length <= 50.
     * No points will be duplicated.
     *  -50 <= points[i][j] <= 50.
     * Answers within 10^-6 of the true value will be accepted as correct.
     * */
    public double largestTriangleArea(int[][] points) {
        if(points == null || points.length < 3) return 0;

        Double res = 0.0;
        for(int i = 0; i < points.length - 2; i ++) {
            for(int j = i + 1; j < points.length - 1; j ++) {
                for(int k = j + 1; k < points.length; k ++) {
                    res = Math.max(res, computeArea(points[i], points[j], points[k]));
                }
            }
        }

        return res;
    }
    private Double computeArea(int[] point1, int[] point2, int[] point3) {
        double i1 = point1[0], j1 = point1[1];
        double i2 = point2[0], j2 = point2[1];
        double i3 = point3[0], j3 = point3[1];
        Double leftMost = Math.min(i1, Math.min(i2, i3));
        Double rightMost = Math.max(i1, Math.max(i2, i3));
        Double downMost = Math.min(j1, Math.min(j2, j3));
        Double upMost = Math.max(j1, Math.max(j2, j3));

        Double rectangle = (rightMost - leftMost) * (upMost - downMost);
        Double triangle1 = (Math.max(i1, i2) - Math.min(i1, i2)) * (Math.max(j1, j2) - Math.min(j1, j2)) / 2;
        Double triangle2 = (Math.max(i1, i3) - Math.min(i1, i3)) * (Math.max(j1, j3) - Math.min(j1, j3)) / 2;
        Double triangle3 = (Math.max(i2, i3) - Math.min(i2, i3)) * (Math.max(j2, j3) - Math.min(j2, j3)) / 2;

        return rectangle - triangle1 - triangle2 -triangle3;
    }

    public static void main(String[] args) {
        int[] point1 = {0,0};
        int[] point2 = {0,1};
        int[] point3 = {1,0};
        int[] point4 = {0,2};
        int[] point5 = {2,0};
        int[][] points = {point1, point2, point3, point4, point5};
        LargestTriangleArea largestTriangleArea = new LargestTriangleArea();
        System.out.println(largestTriangleArea.largestTriangleArea(points));
    }
}
