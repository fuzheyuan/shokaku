package azure.lane.solutions.KthLargestElementinaStream;

import java.util.PriorityQueue;

/**
 * @author Zheyuan Fu
 * @date 2019.05.09
 */
public class KthLargestElementinaStream {
    /**
     * Design a class to find the kth largest element in a stream. Note that it is the kth largest element in the sorted order, not the kth distinct element.
     *
     * Your KthLargest class will have a constructor which accepts an integer k and an integer array nums, which contains initial elements from the stream. For each call to the method KthLargest.add, return the element representing the kth largest element in the stream.
     *
     * Example:
     *
     * int k = 3;
     * int[] arr = [4,5,8,2];
     * KthLargest kthLargest = new KthLargest(3, arr);
     * kthLargest.add(3);   // returns 4
     * kthLargest.add(5);   // returns 5
     * kthLargest.add(10);  // returns 5
     * kthLargest.add(9);   // returns 8
     * kthLargest.add(4);   // returns 8
     * Note:
     * You may assume that nums' length ≥ k-1 and k ≥ 1.
     * */
    PriorityQueue<Integer> queue;
    int k;
    public KthLargestElementinaStream(int k, int[] nums) {
        this.k = k;
        queue = new PriorityQueue<>(k);
        for(int num : nums) {
            add(num);
        }
    }

    public int add(int val) {
        if(queue.size() < k) {
            queue.offer(val);
        } else if(queue.peek() < val) {
            queue.poll();
            queue.offer(val);
        }
        return queue.peek();
    }
}
