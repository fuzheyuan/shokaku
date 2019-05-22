package azure.lane.solutions.MinimumDepthofBinaryTree;

import azure.lane.data.TreeNode;

/**
 * @author Zheyuan Fu
 * @date 2019.05.14
 */
public class MinimumDepthofBinaryTree {
    /**
     * Given a binary tree, find its minimum depth.
     *
     * The minimum depth is the number of nodes along the shortest path from the root node down to the nearest leaf node.
     *
     * Note: A leaf is a node with no children.
     *
     * Example:
     *
     * Given binary tree [3,9,20,null,null,15,7],
     *
     *     3
     *    / \
     *   9  20
     *     /  \
     *    15   7
     * return its minimum depth = 2.
     * */
    public int minDepth(TreeNode root) {
        if(root == null) return 0;

        int left = minDepth(root.left), right = minDepth(root.right);
        int min = Math.min(left, right);
        return 1 + (min > 0 ? min : Math.max(left, right));
    }
}
