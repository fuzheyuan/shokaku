package azure.lane.data;

import java.util.List;

/**
 * @author Zheyuan Fu
 * @date 2019.04.24
 */
public class Node {
    public int val;
    public List<Node> children;

    public Node() {}

    public Node(int val,List<Node> children) {
        this.val = val;
        this.children = children;
    }
}
