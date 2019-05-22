package azure.lane.utils;

import azure.lane.data.ListNode;

/**
 * @author Zheyuan Fu
 * @date 2019.05.14
 */
public class ListNodeUtils {
    public static ListNode buildList(int[] nums) {
        if(nums == null || nums.length == 0) return null;
        ListNode head = new ListNode(nums[0]);
        ListNode cur = head;
        for(int i = 1; i < nums.length; i ++) {
            cur.next = new ListNode(nums[i]);
            cur = cur.next;
        }
        return head;
    }
}
