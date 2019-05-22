package azure.lane.solutions.LongestUnivaluePath;

import azure.lane.data.TreeNode;

/**
 * @author Zheyuan Fu
 * @date 2019.05.16
 */
public class LongestUnivaluePath {
    /**
     * Given a binary tree, find the length of the longest path where each node in the path has the same value. This path may or may not pass through the root.
     *
     * The length of path between two nodes is represented by the number of edges between them.
     *
     *
     *
     * Example 1:
     *
     * Input:
     *
     *               5
     *              / \
     *             4   5
     *            / \   \
     *           1   1   5
     * Output: 2
     *
     *
     *
     * Example 2:
     *
     * Input:
     *
     *               1
     *              / \
     *             4   5
     *            / \   \
     *           4   4   5
     * Output: 2
     *
     *
     *
     * Note: The given binary tree has not more than 10000 nodes. The height of the tree is not more than 1000.
     * */
    int max = 0;
    public int longestUnivaluePath(TreeNode root) {
        /**
        if(root == null) return 0;
        int left = longestUnivaluePath(root.left);
        int right = longestUnivaluePath(root.right);

        int cur = computeLength(root);
        return Math.max(Math.max(left, right), cur);
         */

        if(root == null) return 0;
        dfs(root);
        return max;
    }

    private int dfs(TreeNode node) {
        int left = node.left != null ? dfs(node.left) : 0;
        int right = node.right != null ? dfs(node.right) : 0;
        int resLeft = node.left != null && node.left.val == node.val ? left + 1 : 0;
        int resRight = node.right != null && node.right.val == node.val ? right + 1 : 0;
        max = Math.max(max, resLeft + resRight);
        return Math.max(resLeft, resRight);
    }

    private int computeLength(TreeNode node) {
        if(node == null) return 0;
        if(node.left == null && node.right == null) return 0;

        int left = 0, right = 0;
        if(node.left == null) {
            right = node.val == node.right.val ? computeLength(node.right) : 0;
            return right;
        }
        if(node.right == null) {
            left = node.val == node.left.val ? computeLength(node.left) : 0;
            return left;
        }

        return left + right;
    }


}
