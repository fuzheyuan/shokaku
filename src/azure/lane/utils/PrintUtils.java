package azure.lane.utils;

import azure.lane.data.ListNode;

import java.util.List;

/**
 * @author Zheyuan Fu
 * @date 2019.04.24
 */
public class PrintUtils {
    public static void printIntArray(int[] array) {
        for (int num : array) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    public static void printStringArray(List<String> array) {
        for (int i = 0; i < array.size(); i++) {
            System.out.print(array.get(i) + " ");
        }
        System.out.println();
    }

    public static void printListNodes(ListNode head) {
        if(head == null) return ;
        while(head != null) {
            System.out.print(head.val);
            if(head.next != null) {
                System.out.print("->");
            }
            head = head.next;
        }
    }
}
