package azure.lane.solutions.RemoveLinkedListElements;

import azure.lane.data.ListNode;
import azure.lane.utils.ListNodeUtils;
import azure.lane.utils.PrintUtils;

/**
 * @author Zheyuan Fu
 * @date 2019.05.14
 */
public class RemoveLinkedListElements {
    /**
     * Remove all elements from a linked list of integers that have value val.
     *
     * Example:
     *
     * Input:  1->2->6->3->4->5->6, val = 6
     * Output: 1->2->3->4->5
     * */
    public ListNode removeElements(ListNode head, int val) {
        if(head == null) return null;
        ListNode fakeHead = new ListNode(0);
        fakeHead.next = head;
        ListNode pre = fakeHead, cur = head;
        while(cur != null) {
            if(cur.val == val) {
                pre.next = cur.next;
            } else {
                pre = pre.next;
            }
            cur = cur.next;
        }
        return fakeHead.next;
    }

    public static void main(String[] args) {
        int[] nums = {1,1};
        ListNode head = ListNodeUtils.buildList(nums);
        RemoveLinkedListElements removeLinkedListElements = new RemoveLinkedListElements();
        ListNode removed = removeLinkedListElements.removeElements(head, 1);
        PrintUtils.printListNodes(removed);
    }
}
