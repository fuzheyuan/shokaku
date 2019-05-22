package azure.lane.solutions.MinimumDistanceBetweenBSTNodes;

import azure.lane.data.TreeNode;

/**
 * @author Zheyuan Fu
 * @date 2019.05.08
 */
public class MinimumDistanceBetweenBSTNodes {
    /**
     * Given a Binary Search Tree (BST) with the root node root, return the minimum difference between the values of any two different nodes in the tree.
     *
     * Example :
     *
     * Input: root = [4,2,6,1,3,null,null]
     * Output: 1
     * Explanation:
     * Note that root is a TreeNode object, not an array.
     *
     * The given tree [4,2,6,1,3,null,null] is represented by the following diagram:
     *
     *           4
     *         /   \
     *       2      6
     *      / \
     *     1   3
     *
     * while the minimum difference in this tree is 1, it occurs between node 1 and node 2, also between node 3 and node 2.
     * Note:
     *
     * The size of the BST will be between 2 and 100.
     * The BST is always valid, each node's value is an integer, and each node's value is different.
     * */
    /** wrong answer
    public int minDiffInBST(TreeNode root) {
        int left = minDiffInBST(root.left);
        int right = minDiffInBST(root.right);
        int leftMax = findMax(root.left);
        int rightMin = findMin(root.right);
        int cur = Integer.MAX_VALUE;
        if(leftMax != Integer.MIN_VALUE && rightMin != Integer.MAX_VALUE) {
            cur = rightMin - leftMax;
        } else if(leftMax == Integer.MIN_VALUE) {
            cur = rightMin - root.val;
        } else {
            cur = root.val - leftMax;
        }
        return Math.min(Math.min(left, right), cur);
    }

    private int findMin(TreeNode root) {
        if(root == null) return Integer.MAX_VALUE;
        while(root.left != null) {
            root = root.left;
        }
        return root.val;
    }

    private int findMax(TreeNode root) {
        if(root == null) return Integer.MIN_VALUE;
        while(root.right != null) {
            root = root.right;
        }
        return root.val;
    }
     */

    Integer res = Integer.MAX_VALUE, pre = null;
    public int minDiffInBST(TreeNode root) {
        if (root.left != null) minDiffInBST(root.left);
        if (pre != null) res = Math.min(res, root.val - pre);
        pre = root.val;
        if (root.right != null) minDiffInBST(root.right);
        return res;
    }
}
