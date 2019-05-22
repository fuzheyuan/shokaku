package azure.lane.solutions.MaximumDepthOfNaryTree;

import azure.lane.data.Node;

/**
 * @author Zheyuan Fu
 * @date 2019.04.26
 */
public class MaximumDepthOfNaryTree {
    /**
     * Given a n-ary tree, find its maximum depth.
     *
     * The maximum depth is the number of nodes along the longest path from the root node down to the farthest leaf node.
     *
     * For example, given a 3-ary tree:
     *
     *
     *
     *
     *
     *
     * We should return its max depth, which is 3.
     *
     *
     *
     * Note:
     *
     * The depth of the tree is at most 1000.
     * The total number of nodes is at most 5000.
     * */
    public int maxDepth(Node root) {
        if(root == null) {
            return 0;
        }

        int max = 0;
        for(Node node : root.children) {
            max = Math.max(max, maxDepth(node));
        }
        return max + 1;
    }
}
