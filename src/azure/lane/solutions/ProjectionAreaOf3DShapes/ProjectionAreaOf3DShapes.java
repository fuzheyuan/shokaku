package azure.lane.solutions.ProjectionAreaOf3DShapes;

/**
 * @author Zheyuan Fu
 * @date 2019.04.26
 */
public class ProjectionAreaOf3DShapes {
    /**
     * On a N * N grid, we place some 1 * 1 * 1 cubes that are axis-aligned with the x, y, and z axes.
     *
     * Each value v = grid[i][j] represents a tower of v cubes placed on top of grid cell (i, j).
     *
     * Now we view the projection of these cubes onto the xy, yz, and zx planes.
     *
     * A projection is like a shadow, that maps our 3 dimensional figure to a 2 dimensional plane.
     *
     * Here, we are viewing the "shadow" when looking at the cubes from the top, the front, and the side.
     *
     * Return the total area of all three projections.
     *
     *
     *
     * Example 1:
     *
     * Input: [[2]]
     * Output: 5
     * Example 2:
     *
     * Input: [[1,2],[3,4]]
     * Output: 17
     * Explanation:
     * Here are the three projections ("shadows") of the shape made with each axis-aligned plane.
     *
     * Example 3:
     *
     * Input: [[1,0],[0,2]]
     * Output: 8
     * Example 4:
     *
     * Input: [[1,1,1],[1,0,1],[1,1,1]]
     * Output: 14
     * Example 5:
     *
     * Input: [[2,2,2],[2,1,2],[2,2,2]]
     * Output: 21
     *
     *
     * Note:
     *
     * 1 <= grid.length = grid[0].length <= 50
     * 0 <= grid[i][j] <= 50
     * */
    public int projectionArea(int[][] grid) {
        if(grid == null || grid.length == 0 || grid[0] == null || grid[0].length == 0) {
            return 0;
        }
        int length = grid.length, width = grid[0].length;
        int front = 0, side = 0, bottom = 0;

        /** compute front */
        for(int i = 0; i < length; i ++) {
            int max = 0;
            for(int j = 0; j < width; j ++) {
                max = Math.max(max, grid[i][j]);
            }
            front += max;
        }

        /** compute side */
        for(int i = 0; i < width; i ++) {
            int max = 0;
            for(int j = 0; j < length; j ++) {
                max = Math.max(max, grid[j][i]);
            }
            side += max;
        }

        /** compute bottom */
        for(int i = 0; i < length; i ++) {
            for(int j = 0; j < width; j ++) {
                if(grid[i][j] != 0) {
                    bottom ++;
                }
            }
        }

        int res = front + side + bottom;
        return res;
    }
}
