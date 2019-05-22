package azure.lane.solutions.ReverseLinkedList;

import azure.lane.data.ListNode;

/**
 * @author Zheyuan Fu
 * @date 2019.04.30
 */
public class ReverseLinkedList {
    /**
     * Reverse a singly linked list.
     *
     * Example:
     *
     * Input: 1->2->3->4->5->NULL
     * Output: 5->4->3->2->1->NULL
     * Follow up:
     *
     * A linked list can be reversed either iteratively or recursively. Could you implement both?
     * */
    public ListNode reverseList(ListNode head) {
        if(head == null || head.next == null) return head;

        ListNode pre = null;
        while(head.next != null) {
            ListNode next = head.next;
            head.next = pre;
            pre = head;
            head = next;
        }
        head.next = pre;
        return head;
    }
}
