/*
 * Copyright (c) 2021.
 * @author TunayNovruz
 *
 */

package leetcode.twopointers;

import leetcode.ListNode;

import java.util.ArrayList;
import java.util.List;

public class PalindromeLinkedList {
    public boolean isPalindrome(ListNode head) {
        List<Integer> list = new ArrayList<>();
        while (head != null) {
            list.add(head.val);
            head = head.next;
        }
        int len = list.size() - 1;
        for (int i = 0; i <= len; i++) {
            if (!list.get(i).equals(list.get(len - i)))
                return false;
        }

        return true;
    }
}
