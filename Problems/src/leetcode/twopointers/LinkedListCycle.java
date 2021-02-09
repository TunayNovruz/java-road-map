/*
 * Copyright (c) 2021.
 * @author TunayNovruz
 *
 */

package leetcode.twopointers;

import leetcode.ListNode;

import java.util.HashSet;
import java.util.Set;

public class LinkedListCycle {
    public Set<ListNode> set = new HashSet<>();

    public boolean hasCycle(ListNode head) {
        if (head == null)
            return false;

        if (set.contains(head))
            return true;
        else {
            set.add(head);
            return hasCycle(head.next);
        }
    }
    //two pointer way

    public boolean hasCycle2(ListNode head) {
        if (head == null) return false;
        ListNode p1 = head;
        ListNode p2 = head.next;
        while (p2 != null && p2.next != null) {
            if (p1 == p2) return true;
            p1 = p1.next;
            p2 = p2.next.next;
        }
        return false;
    }
}
