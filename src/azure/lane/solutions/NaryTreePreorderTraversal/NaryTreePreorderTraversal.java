package azure.lane.solutions.NaryTreePreorderTraversal;

import azure.lane.data.Node;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * @author Zheyuan Fu
 * @date 2019.04.24
 */
public class NaryTreePreorderTraversal {
    /**
     * Given an n-ary tree, return the preorder traversal of its nodes' values.
     *
     * Return its preorder traversal as: [1,3,5,6,2,4].
     * */
    public List<Integer> preorder(Node root) {
        if(root == null) return new ArrayList<>();
        List<Integer> res = new ArrayList<>();

        Stack<Node> stack = new Stack<>();
        stack.add(root);

        while(!stack.isEmpty()) {
            root = stack.pop();
            res.add(root.val);
            for(int i = root.children.size() - 1; i >= 0; i --) {
                stack.add(root.children.get(i));
            }
        }
        return res;
    }

    public List<Integer> preorderRecursive(Node root) {
        if(root == null) return new ArrayList<>();
        List<Integer> res = new ArrayList<>();
        preorderRecursive(root, res);
        return res;
    }

    public void preorderRecursive(Node root, List<Integer> res) {
        if(root == null) return ;
        res.add(root.val);
        for(Node node : root.children) {
            preorderRecursive(node, res);
        }
    }
}
