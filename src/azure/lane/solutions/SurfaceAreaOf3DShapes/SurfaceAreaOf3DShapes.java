package azure.lane.solutions.SurfaceAreaOf3DShapes;

/**
 * @author Zheyuan Fu
 * @date 2019.04.29
 */
public class SurfaceAreaOf3DShapes {
    /**
     * On a N * N grid, we place some 1 * 1 * 1 cubes.
     *
     * Each value v = grid[i][j] represents a tower of v cubes placed on top of grid cell (i, j).
     *
     * Return the total surface area of the resulting shapes.
     *
     *
     *
     * Example 1:
     *
     * Input: [[2]]
     * Output: 10
     * Example 2:
     *
     * Input: [[1,2],[3,4]]
     * Output: 34
     * Example 3:
     *
     * Input: [[1,0],[0,2]]
     * Output: 16
     * Example 4:
     *
     * Input: [[1,1,1],[1,0,1],[1,1,1]]
     * Output: 32
     * Example 5:
     *
     * Input: [[2,2,2],[2,1,2],[2,2,2]]
     * Output: 46
     *
     *
     * Note:
     *
     * 1 <= N <= 50
     * 0 <= grid[i][j] <= 50
     * */
    public int surfaceArea(int[][] grid) {
        if(grid == null || grid.length == 0) return 0;

        int cubes = 0, neighbors = 0, updown = 0;
        for(int i = 0; i < grid.length; i ++) {
            for(int j = 0; j < grid[0].length; j ++) {
                if(grid[i][j] > 0){
                    cubes += grid[i][j];
                    updown += Math.max(grid[i][j] - 1, 0);
                }
                if(i < grid.length - 1) {
                    neighbors += Math.min(grid[i + 1][j], grid[i][j]);
                }
                if(j < grid[0].length - 1) {
                    neighbors += Math.min(grid[i][j + 1], grid[i][j]);
                }
            }
        }
        return cubes * 6 - neighbors * 2 - updown * 2;
    }

    public static void main(String[] args) {
        SurfaceAreaOf3DShapes surfaceAreaOf3DShapes = new SurfaceAreaOf3DShapes();
        int[] line1 = {2,2,2};
        int[] line2 = {2,1,2};
        int[] line3 = {2,2,2};
        int[][] grid = {line1, line2, line3};
        System.out.println(surfaceAreaOf3DShapes.surfaceArea(grid));
    }
}
