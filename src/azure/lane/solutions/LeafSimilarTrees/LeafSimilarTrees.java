package azure.lane.solutions.LeafSimilarTrees;

import azure.lane.data.Node;
import azure.lane.data.TreeNode;

import java.util.*;

/**
 * @author Zheyuan Fu
 * @date 2019.04.26
 */
public class LeafSimilarTrees {
    /**
     * Consider all the leaves of a binary tree.  From left to right order, the values of those leaves form a leaf value sequence.
     *
     *
     *
     * For example, in the given tree above, the leaf value sequence is (6, 7, 4, 9, 8).
     *
     * Two binary trees are considered leaf-similar if their leaf value sequence is the same.
     *
     * Return true if and only if the two given trees with head nodes root1 and root2 are leaf-similar.
     *
     *
     *
     * Note:
     *
     * Both of the given trees will have between 1 and 100 nodes.
     * */
    Deque<Integer> deque = new ArrayDeque<>();

    public boolean leafSimilar(TreeNode root1, TreeNode root2) {
        if(root1 == null && root2 == null) return true;

        dfs(root1);

        return check(root2);
    }
    private void dfs(TreeNode node) {
        if(node.left == null && node.right == null) {
            deque.offer(node.val);
            return ;
        }
        if(node.left != null) {
            dfs(node.left);
        }
        if(node.right != null) {
            dfs(node.right);
        }
    }

    private boolean check(TreeNode root) {
        if(root.left == null && root.right == null) {
            return deque.poll() == root.val;
        }
        boolean res = true;
        if(root.left != null) {
            res = check(root.left);
        }
        if(res && root.right != null) {
            res = res && check(root.right);
        }
        return res;
    }
}
