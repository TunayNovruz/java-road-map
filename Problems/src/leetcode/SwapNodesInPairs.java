/*
 * Copyright (c) 2021.
 * @author TunayNovruz
 *
 */

package leetcode;

public class SwapNodesInPairs {
    public static void main(String[] args) {
        ListNode root = new ListNode(1,
                new ListNode(2,
                        new ListNode(3,
                                new ListNode(4, new ListNode(5,
                                        new ListNode(6))))));
        ListNode result = swapPairs(root);

        while (result != null) {
            System.out.println(result.val);
            result = result.next;
        }
    }

    public static ListNode swapPairs(ListNode head) {
        if (head != null && head.next != null) {
            ListNode temp = head;
            head = head.next;
            temp.next = head.next;
            head.next = temp;
            if (head.next.next != null) {
                head.next.next = swapPairs(head.next.next);
            }
        }
        return head;
    }

//    public static void swapRec(ListNode before, ListNode rep) {
//        if (rep.next != null) {
////            before.next =7;
//        }
//    }
}
