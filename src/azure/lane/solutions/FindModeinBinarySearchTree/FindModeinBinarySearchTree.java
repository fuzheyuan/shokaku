package azure.lane.solutions.FindModeinBinarySearchTree;

import azure.lane.data.TreeNode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author Zheyuan Fu
 * @date 2019.05.13
 */
public class FindModeinBinarySearchTree {
    /**
     * Given a binary search tree (BST) with duplicates, find all the mode(s) (the most frequently occurred element) in the given BST.
     *
     * Assume a BST is defined as follows:
     *
     * The left subtree of a node contains only nodes with keys less than or equal to the node's key.
     * The right subtree of a node contains only nodes with keys greater than or equal to the node's key.
     * Both the left and right subtrees must also be binary search trees.
     *
     *
     * For example:
     * Given BST [1,null,2,2],
     *
     *    1
     *     \
     *      2
     *     /
     *    2
     *
     *
     * return [2].
     *
     * Note: If a tree has more than one mode, you can return them in any order.
     *
     * Follow up: Could you do that without using any extra space? (Assume that the implicit stack space incurred due to recursion does not count).
     * */
    Map<Integer, Integer> map = new HashMap<>();
    public int[] findMode(TreeNode root) {
        dfs(root);
        int count = 0;
        for(Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if(entry.getValue() > count) {
                count = entry.getValue();
            }
        }

        List<Integer> list = new ArrayList<>();
        for(Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if(entry.getValue() == count) {
                list.add(entry.getKey());
            }
        }
        int[] ret = new int[list.size()];
        for(int i = 0; i < list.size(); i ++) {
            ret[i] = list.get(i);
        }
        return ret;
    }

    private void dfs(TreeNode root) {
        if(root == null) return ;
        map.put(root.val, map.getOrDefault(root.val, 0) + 1);
        dfs(root.left);
        dfs(root.right);
    }
}
