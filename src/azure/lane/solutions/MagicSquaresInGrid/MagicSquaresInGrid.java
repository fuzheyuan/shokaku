package azure.lane.solutions.MagicSquaresInGrid;

/**
 * @author Zheyuan Fu
 * @date 2019.05.14
 */
public class MagicSquaresInGrid {
    /**
     * A 3 x 3 magic square is a 3 x 3 grid filled with distinct numbers from 1 to 9 such that each row, column, and both diagonals all have the same sum.
     *
     * Given an grid of integers, how many 3 x 3 "magic square" subgrids are there?  (Each subgrid is contiguous).
     *
     *
     *
     * Example 1:
     *
     * Input: [[4,3,8,4],
     *         [9,5,1,9],
     *         [2,7,6,2]]
     * Output: 1
     * Explanation:
     * The following subgrid is a 3 x 3 magic square:
     * 438
     * 951
     * 276
     *
     * while this one is not:
     * 384
     * 519
     * 762
     *
     * In total, there is only one magic square inside the given grid.
     * Note:
     *
     * 1 <= grid.length <= 10
     * 1 <= grid[0].length <= 10
     * 0 <= grid[i][j] <= 15
     * */
    public int numMagicSquaresInside(int[][] grid) {
        int count = 0;
        for(int i = 0; i < grid.length; i ++) {
            for(int j = 0; j < grid[0].length; j ++) {
                count += isMagicSquare(grid, i, j) ? 1 : 0;
            }
        }
        return count;
    }

    private boolean isMagicSquare(int[][] grid, int rowStart, int colStart) {
        if(grid == null || grid.length < 3 || grid[0].length < 3) return false;

        int[] count = new int[9];
        for(int i = rowStart; i <= rowStart + 2 && i <= grid.length - 1; i ++) {
            for(int j = colStart; j <= colStart + 2 && j <= grid[0].length - 1; j ++) {
                if(grid[i][j] > 9 || grid[i][j] < 1) {
                    return false;
                }
                count[grid[i][j] - 1] ++;
            }
        }

        for(int i = 0; i < count.length; i ++) {
            if(count[i] != 1) {
                return false;
            }
        }

        int diagonals = 0, antidiagonals = 0;
        if(rowStart + 2 <= grid.length - 1 && colStart + 2 <= grid[0].length - 1) {
            diagonals = grid[rowStart][colStart] + grid[rowStart + 1][colStart + 1] + grid[rowStart + 2][colStart + 2];
            antidiagonals = grid[rowStart][colStart + 2] + grid[rowStart + 1][colStart + 1] + grid[rowStart + 2][colStart];
        }

        return diagonals == antidiagonals && diagonals != 0;
    }

    public static void main(String[] args) {
        MagicSquaresInGrid magicSquaresInGrid = new MagicSquaresInGrid();
        int[] line1 = {4,7,8};
        int[] line2 = {9,5,1};
        int[] line3 = {2,3,6};
        int[][] grid = {line1, line2, line3};
        System.out.println(magicSquaresInGrid.numMagicSquaresInside(grid));
    }
}
