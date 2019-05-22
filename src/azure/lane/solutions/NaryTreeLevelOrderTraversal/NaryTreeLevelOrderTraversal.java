package azure.lane.solutions.NaryTreeLevelOrderTraversal;

import azure.lane.data.Node;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * @author Zheyuan Fu
 * @date 2019.04.29
 */
public class NaryTreeLevelOrderTraversal {
    /**
     * Given an n-ary tree, return the level order traversal of its nodes' values. (ie, from left to right, level by level).
     *
     * For example, given a 3-ary tree:
     *
     *
     *
     *
     *
     *
     *
     * We should return its level order traversal:
     *
     * [
     *      [1],
     *      [3,2,4],
     *      [5,6]
     * ]
     *
     *
     * Note:
     *
     * The depth of the tree is at most 1000.
     * The total number of nodes is at most 5000.
     * */
    public List<List<Integer>> levelOrder(Node root) {
        List<List<Integer>> res = new ArrayList<>();
        if(root == null) return res;
        Queue<Node> queue = new LinkedList<>();
        queue.offer(root);
        while(!queue.isEmpty()) {
            List<Integer> line = new ArrayList<>();
            int len = queue.size();
            for(int i = 0; i < len; i ++) {
                Node node = queue.poll();
                line.add(node.val);
                for(Node child : node.children) {
                    queue.offer(child);
                }
            }
            res.add(line);
        }
        return res;
    }
}
