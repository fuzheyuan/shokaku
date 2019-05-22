package azure.lane.solutions.TwoSumIVInputIsABST;

import azure.lane.data.TreeNode;

/**
 * @author Zheyuan Fu
 * @date 2019.04.30
 */
public class TwoSumIVInputIsABST {
    /**
     * Given a Binary Search Tree and a target number, return true if there exist two elements in the BST such that their sum is equal to the given target.
     *
     * Example 1:
     *
     * Input:
     *     5
     *    / \
     *   3   6
     *  / \   \
     * 2   4   7
     *
     * Target = 9
     *
     * Output: True
     *
     *
     * Example 2:
     *
     * Input:
     *     5
     *    / \
     *   3   6
     *  / \   \
     * 2   4   7
     *
     * Target = 28
     *
     * Output: False
     * */
    public boolean myFindTarget(TreeNode root, int k) {
        if(k == root.val) {
            return find(root.left, 0);
        } else if(k < root.val) {
            return findTarget(root.left, k);
        } else {
            boolean searchLeft = findTarget(root.left, k);
            boolean searchRight = findTarget(root.right, k);
            boolean useRoot = false;
            if(k - root.val < root.val) {
                useRoot = find(root.left, k - root.val);
            } else if(k - root.val > root.val) {
                useRoot = find(root.right, k - root.val);
            }
            boolean searchBoth = false;
            for(int i = 0 ; i <= k; i ++) {
                if(find(root.left, i) && find(root.right, k - i)) {
                    searchBoth = true;
                }
            }
            return searchLeft || searchRight || useRoot || searchBoth;
        }
    }

    public boolean find(TreeNode root, int k) {
        if(root == null) return false;
        if(root.val == k) return true;
        if(k < root.val) {
            return find(root.left, k);
        } else {
            return find(root.right, k);
        }
    }

    public boolean findTarget(TreeNode root, int k) {
        return dfs(root, root,  k);
    }

    public boolean dfs(TreeNode root,  TreeNode cur, int k){
        if(cur == null)return false;
        return search(root, cur, k - cur.val) || dfs(root, cur.left, k) || dfs(root, cur.right, k);
    }

    public boolean search(TreeNode root, TreeNode cur, int value){
        if(root == null)return false;
        return (root.val == value) && (root != cur)
                || (root.val < value) && search(root.right, cur, value)
                || (root.val > value) && search(root.left, cur, value);
    }
}
