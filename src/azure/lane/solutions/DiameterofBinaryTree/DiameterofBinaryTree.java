package azure.lane.solutions.DiameterofBinaryTree;

import azure.lane.data.TreeNode;

/**
 * @author Zheyuan Fu
 * @date 2019.05.09
 */
public class DiameterofBinaryTree {
    /**
     * Given a binary tree, you need to compute the length of the diameter of the tree. The diameter of a binary tree is the length of the longest path between any two nodes in a tree. This path may or may not pass through the root.
     *
     * Example:
     * Given a binary tree
     *           1
     *          / \
     *         2   3
     *        / \
     *       4   5
     * Return 3, which is the length of the path [4,2,1,3] or [5,2,1,3].
     *
     * Note: The length of path between two nodes is represented by the number of edges between them.
     * */
    int max = 0;
    public int diameterOfBinaryTree(TreeNode root) {
        if(root == null) return 0;
        compute(root);
        return max;
    }

    private int compute(TreeNode root) {
        if(root == null) {
            return 0;
        }
        int left = compute(root.left);
        int right = compute(root.right);

        max = Math.max(max, left + right);

        return Math.max(left, right) + 1;
    }
}
