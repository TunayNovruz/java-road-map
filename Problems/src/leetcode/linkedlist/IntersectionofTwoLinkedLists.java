/*
 * Copyright (c) 2021.
 * @author TunayNovruz
 *
 */

package leetcode.linkedlist;

import leetcode.ListNode;

public class IntersectionofTwoLinkedLists {
    public ListNode getIntersectionNodeBruteForce(ListNode headA, ListNode headB) {

        //bruteforce
        if (headA == null || headB == null) return null;
        ListNode tempA = headA;
        while (tempA != null) {
            tempA = tempA.next;
            ListNode tempB = headB;
            while (tempB != null) {
                if (tempA == tempB) return tempA;
                tempB = tempB.next;
            }
        }
        return null;
    }

    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {

        if (headA == null || headB == null) return null;
        int lengthA = 0;
        int lengthB = 0;
        ListNode tempA = headA;
        ListNode tempB = headB;

        while (tempA != null) {
            lengthA++;
            tempA = tempA.next;
        }

        while (tempB != null) {
            lengthB++;
            tempB = tempB.next;
        }

        if (tempA != tempB) return null;

        tempA = headA;
        tempB = headB;

        if (lengthA > lengthB) {
            tempA = headA;
            int diff = lengthA - lengthB;
            while (diff > 0) {
                tempA = tempA.next;
                diff--;
            }
        } else if (lengthA < lengthB) {
            int diff = lengthB - lengthA;
            tempB = headB;
            while (diff > 0) {
                tempB = tempB.next;
                diff--;
            }
        }

        while (tempA != null && tempB != null) {
            if (tempA == tempB) return tempA;
            tempA = tempA.next;
            tempB = tempB.next;
        }
        return null;
    }
}
