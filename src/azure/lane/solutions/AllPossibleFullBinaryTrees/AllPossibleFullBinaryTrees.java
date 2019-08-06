package azure.lane.solutions.AllPossibleFullBinaryTrees;

import azure.lane.data.ListNode;
import azure.lane.data.TreeNode;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Zheyuan Fu
 * @date 2019.05.22
 */
public class AllPossibleFullBinaryTrees {
    /**
     * A full binary tree is a binary tree where each node has exactly 0 or 2 children.
     *
     * Return a list of all possible full binary trees with N nodes.  Each element of the answer is the root node of one possible tree.
     *
     * Each node of each tree in the answer must have node.val = 0.
     *
     * You may return the final list of trees in any order.
     *
     *
     *
     * Example 1:
     *
     * Input: 7
     * Output: [[0,0,0,null,null,0,0,null,null,0,0],[0,0,0,null,null,0,0,0,0],[0,0,0,0,0,0,0],[0,0,0,0,0,null,null,null,null,0,0],[0,0,0,0,0,null,null,0,0]]
     * Explanation:
     *
     *
     *
     * Note:
     *
     * 1 <= N <= 20
     * */
    public List<TreeNode> allPossibleFBT(int N) {
        List<TreeNode> res = new ArrayList<>();
        if(N % 2 == 0) {
            return res;
        }
        if(N == 1) {
            res.add(new TreeNode(0));
            return res;
        }
        for(int i = 1; i < N; i += 2) {
            List<TreeNode> lefts = allPossibleFBT(i);
            List<TreeNode> rights = allPossibleFBT(N - i - 1);
            for(TreeNode left : lefts) {
                for(TreeNode right : rights) {
                    TreeNode root = new TreeNode(0);
                    root.left = left;
                    root.right = right;
                    res.add(root);
                }
            }
        }
        return res;
    }
}
