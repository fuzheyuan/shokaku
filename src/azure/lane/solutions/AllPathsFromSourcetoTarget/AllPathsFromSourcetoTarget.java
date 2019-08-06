package azure.lane.solutions.AllPathsFromSourcetoTarget;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Zheyuan Fu
 * @date 2019.05.22
 */
public class AllPathsFromSourcetoTarget {
    /**
     * Given a directed, acyclic graph of N nodes.  Find all possible paths from node 0 to node N-1, and return them in any order.
     *
     * The graph is given as follows:  the nodes are 0, 1, ..., graph.length - 1.  graph[i] is a list of all nodes j for which the edge (i, j) exists.
     *
     * Example:
     * Input: [[1,2], [3], [3], []]
     * Output: [[0,1,3],[0,2,3]]
     * Explanation: The graph looks like this:
     * 0--->1
     * |    |
     * v    v
     * 2--->3
     * There are two paths: 0 -> 1 -> 3 and 0 -> 2 -> 3.
     * Note:
     *
     * The number of nodes in the graph will be in the range [2, 15].
     * You can print different paths in any order, but you should keep the order of nodes inside one path.
     * */
    public List<List<Integer>> allPathsSourceTarget(int[][] graph) {
        List<List<Integer>> res = new ArrayList<>();
        if(graph == null || graph.length == 0) return res;
        List<Integer> path = new ArrayList<>();
        path.add(0);
        dfs(graph, res, path, 0);

        return res;
    }

    private List<List<Integer>> dfs(int[][] graph, List<List<Integer>> res, List<Integer> path, int start) {
        if(start == graph.length - 1) {
            res.add(new ArrayList<>(path));
        }

        for(int next : graph[start]) {
            path.add(next);
            dfs(graph, res, path, next);
            path.remove(path.size() - 1);
        }
        return res;
    }
}
