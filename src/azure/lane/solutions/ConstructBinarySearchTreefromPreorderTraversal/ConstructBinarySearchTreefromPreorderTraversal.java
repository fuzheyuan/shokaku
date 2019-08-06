package azure.lane.solutions.ConstructBinarySearchTreefromPreorderTraversal;

import azure.lane.data.TreeNode;

/**
 * @author Zheyuan Fu
 * @date 2019.05.22
 */
public class ConstructBinarySearchTreefromPreorderTraversal {
    /**
     * Return the root node of a binary search tree that matches the given preorder traversal.
     *
     * (Recall that a binary search tree is a binary tree where for every node, any descendant of node.left has a value < node.val, and any descendant of node.right has a value > node.val.  Also recall that a preorder traversal displays the value of the node first, then traverses node.left, then traverses node.right.)
     *
     *
     *
     * Example 1:
     *
     * Input: [8,5,1,7,10,12]
     * Output: [8,5,10,1,7,null,12]
     *
     *
     *
     * Note:
     *
     * 1 <= preorder.length <= 100
     * The values of preorder are distinct.
     * */
    int i = 0;
    public TreeNode bstFromPreorder(int[] preorder) {
        return build(preorder, Integer.MAX_VALUE);
    }
    private TreeNode build(int[] preorder, int bound) {
        if(i == preorder.length || preorder[i] > bound) return null;

        TreeNode root = new TreeNode(preorder[i]);
        i ++;
        root.left = build(preorder, root.val);
        root.right = build(preorder, bound);
        return root;
    }
}
