package azure.lane.solutions.PalindromeLinkedList;

import azure.lane.data.ListNode;
import azure.lane.utils.ListNodeUtils;
import azure.lane.utils.PrintUtils;

/**
 * @author Zheyuan Fu
 * @date 2019.05.14
 */
public class PalindromeLinkedList {
    /**
     * Given a singly linked list, determine if it is a palindrome.
     *
     * Example 1:
     *
     * Input: 1->2
     * Output: false
     * Example 2:
     *
     * Input: 1->2->2->1
     * Output: true
     * Follow up:
     * Could you do it in O(n) time and O(1) space?
     * */
    public boolean isPalindrome(ListNode head) {
        if(head == null || head.next == null) return true;

        ListNode first = head, second = head;
        while(second != null && second.next != null) {
            first = first.next;
            second = second.next.next;
        }
        ListNode reversed = reverse(first);
        while(reversed != null && head != null) {
            if(reversed.val != head.val) {
                return false;
            }
            reversed = reversed.next;
            head = head.next;
        }
        return true;
    }

    private ListNode reverse(ListNode head) {
        if(head == null || head.next == null) return head;

        ListNode pre = null, newHead = head;
        while(newHead.next != null) {
            ListNode next = newHead.next;
            newHead.next = pre;
            pre = newHead;
            newHead = next;
        }
        newHead.next = pre;
        return newHead;
    }

    public static void main(String[] args) {
        int[] nums = {1,2,3,1};
        PalindromeLinkedList palindromeLinkedList = new PalindromeLinkedList();
        ListNode head = ListNodeUtils.buildList(nums);
        System.out.println(palindromeLinkedList.isPalindrome(head));
    }
}
