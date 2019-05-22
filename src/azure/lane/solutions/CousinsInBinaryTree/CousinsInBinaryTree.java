package azure.lane.solutions.CousinsInBinaryTree;

import azure.lane.data.TreeNode;

import java.util.LinkedList;
import java.util.Queue;

/**
 * @author Zheyuan Fu
 * @date 2019.04.30
 */
public class CousinsInBinaryTree {
    /**
     * In a binary tree, the root node is at depth 0, and children of each depth k node are at depth k+1.
     *
     * Two nodes of a binary tree are cousins if they have the same depth, but have different parents.
     *
     * We are given the root of a binary tree with unique values, and the values x and y of two different nodes in the tree.
     *
     * Return true if and only if the nodes corresponding to the values x and y are cousins.
     *
     *
     *
     * Example 1:
     *
     *
     * Input: root = [1,2,3,4], x = 4, y = 3
     * Output: false
     * Example 2:
     *
     *
     * Input: root = [1,2,3,null,4,null,5], x = 5, y = 4
     * Output: true
     * Example 3:
     *
     *
     *
     * Input: root = [1,2,3,null,4], x = 2, y = 3
     * Output: false
     *
     *
     * Note:
     *
     * The number of nodes in the tree will be between 2 and 100.
     * Each node has a unique integer value from 1 to 100.
     * */
    public boolean isCousins(TreeNode root, int x, int y) {
        if(root == null) return false;

        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        while(!queue.isEmpty()) {
           int len = queue.size();
           boolean xExist = false, yExist = false;
           for(int i = 0; i < len; i ++) {
               TreeNode cur = queue.poll();
               if(cur.val == x) xExist = true;
               if(cur.val == y) yExist = true;
               if(cur.left != null && cur.right != null) {
                   if(cur.left.val == x && cur.right.val == y) return false;
                   if(cur.left.val == y && cur.right.val == x) return false;
               }

               if(cur.left != null) queue.offer(cur.left);
               if(cur.right != null) queue.offer(cur.right);
           }
           if(xExist && yExist) return true;
        }
        return false;
    }

}
