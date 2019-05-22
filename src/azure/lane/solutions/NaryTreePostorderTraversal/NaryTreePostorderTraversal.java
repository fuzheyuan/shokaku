package azure.lane.solutions.NaryTreePostorderTraversal;

import azure.lane.data.Node;

import java.util.*;

/**
 * @author Zheyuan Fu
 * @date 2019.04.25
 */
public class NaryTreePostorderTraversal {
    /**
     * Given an n-ary tree, return the postorder traversal of its nodes' values.
     *
     * For example, given a 3-ary tree:
     *
     *
     *
     *
     *
     *
     *
     * Return its postorder traversal as: [5,6,3,2,4,1].
     *
     *
     * Note:
     *
     * Recursive solution is trivial, could you do it iteratively?
     * */
    public List<Integer> postorder(Node root) {
        List<Integer> res = new ArrayList<>();
        if(root == null) return res;
        Stack<Node> stack = new Stack<>();
        stack.push(root);
        while(!stack.isEmpty()) {
            Node cur = stack.pop();
            for(int i = cur.children.size() - 1; i >= 0; i --) {
                stack.push(cur.children.get(i));
            }
            res.add(0, cur.val);
        }
        return res;
    }

    public List<Integer> postorderRecursive(Node root) {
        List<Integer> res = new ArrayList<>();
        postorderRecursive(root, res);
        return res;
    }
    private void postorderRecursive(Node root, List<Integer> res) {
        if(root == null) return ;
        for(Node node : root.children) {
            postorderRecursive(node, res);
        }
        res.add(root.val);
    }
}
