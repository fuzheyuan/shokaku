package azure.lane.solutions.RemoveDuplicatesfromSortedList;

import azure.lane.data.ListNode;

/**
 * @author Zheyuan Fu
 * @date 2019.05.13
 */
public class RemoveDuplicatesfromSortedList {
    /**
     * Given a sorted linked list, delete all duplicates such that each element appear only once.
     *
     * Example 1:
     *
     * Input: 1->1->2
     * Output: 1->2
     * Example 2:
     *
     * Input: 1->1->2->3->3
     * Output: 1->2->3
     * */
    public ListNode deleteDuplicates(ListNode head) {
        ListNode cur = head;
        while(cur != null) {
            while(cur.next != null && cur.next.val == cur.val) {
                cur.next = cur.next.next;
            }
            cur = cur.next;
        }
        return head;
    }
}
