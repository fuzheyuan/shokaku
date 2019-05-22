package azure.lane.solutions.BinaryTreePaths;

import azure.lane.data.TreeNode;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Zheyuan Fu
 * @date 2019.05.10
 */
public class BinaryTreePaths {
    /**
     * Given a binary tree, return all root-to-leaf paths.
     *
     * Note: A leaf is a node with no children.
     *
     * Example:
     *
     * Input:
     *
     *    1
     *  /   \
     * 2     3
     *  \
     *   5
     *
     * Output: ["1->2->5", "1->3"]
     *
     * Explanation: All root-to-leaf paths are: 1->2->5, 1->3
     * */
    public List<String> binaryTreePaths(TreeNode root) {
        List<String> res = new ArrayList<String>();
        if (root != null) helper(root, res, "");
        return res;
    }

    private void helper(TreeNode root, List<String> res, String cur) {
        if (root.left == null && root.right == null) {
            res.add(cur + root.val);
        }
        if (root.left != null) {
            helper(root.left, res, cur + root.val + "->");
        }
        if (root.right != null) {
            helper(root.right, res,cur + root.val + "->");
        }
    }
}
