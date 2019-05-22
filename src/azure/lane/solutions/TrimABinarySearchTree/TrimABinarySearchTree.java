package azure.lane.solutions.TrimABinarySearchTree;

import azure.lane.data.TreeNode;

/**
 * @author Zheyuan Fu
 * @date 2019.04.29
 */
public class TrimABinarySearchTree {
    /**
     * Given a binary search tree and the lowest and highest boundaries as L and R, trim the tree so that all its elements lies in [L, R] (R >= L). You might need to change the root of the tree, so the result should return the new root of the trimmed binary search tree.
     *
     * Example 1:
     * Input:
     *     1
     *    / \
     *   0   2
     *
     *   L = 1
     *   R = 2
     *
     * Output:
     *     1
     *       \
     *        2
     * Example 2:
     * Input:
     *     3
     *    / \
     *   0   4
     *    \
     *     2
     *    /
     *   1
     *
     *   L = 1
     *   R = 3
     *
     * Output:
     *       3
     *      /
     *    2
     *   /
     *  1
     * */
    public TreeNode trimBST(TreeNode root, int L, int R) {
        if(root == null) return null;

        if(R < root.val) {
            return trimBST(root.left, L, R);
        } else if(L > root.val) {
            return trimBST(root.right, L, R);
        } else {
            root.left = trimBST(root.left, L, root.val);
            root.right = trimBST(root.right, root.val, R);
            return root;
        }
    }
}
