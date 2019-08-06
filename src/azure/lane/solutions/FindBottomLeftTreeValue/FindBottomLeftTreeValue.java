package azure.lane.solutions.FindBottomLeftTreeValue;

import azure.lane.data.TreeNode;

import java.util.LinkedList;
import java.util.Queue;

/**
 * @author Zheyuan Fu
 * @date 2019.07.16
 */
public class FindBottomLeftTreeValue {
    public int findBottomLeftValue(TreeNode root) {
        if(root == null) return -1;
        int res = root.val;
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);

        while(!queue.isEmpty()) {
            int len = queue.size();
            for(int i = 0; i < len; i ++) {
                TreeNode node = queue.poll();
                if(i == 0) {
                    res = node.val;
                }
                if(node.left != null) queue.offer(node.left);
                if(node.right != null) queue.offer(node.right);
            }
        }

        return res;
    }
}
