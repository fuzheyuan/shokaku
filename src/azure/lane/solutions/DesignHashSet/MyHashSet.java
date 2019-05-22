package azure.lane.solutions.DesignHashSet;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author Zheyuan Fu
 * @date 2019.04.30
 */
public class MyHashSet {
    Integer[] set;
    /** Initialize your data structure here. */
    public MyHashSet() {
        set = new Integer[1000001];
        Arrays.fill(set, -1);
    }

    public void add(int key) {
        set[key] = key;
    }

    public void remove(int key) {
        set[key] = -1;
    }

    /** Returns true if this set contains the specified element */
    public boolean contains(int key) {
        return set[key] != -1;
    }
}
