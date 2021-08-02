/*
 * Copyright (c) 2021.
 * @author TunayNovruz
 *
 */

package leetcode.hash;

import leetcode.ListNode;

class MyHashSet {
    ListNode root;
    ListNode last;

    public MyHashSet() {
    }

    public void add(int key) {
        ListNode next = new ListNode(key);
        if (root == null) {
            root = next;
            last = root;
        } else if (!contains(key)) {
            last.next = next;
            last = last.next;
        }
    }

    public void remove(int key) {
        if (root == null) return;
        if (key == root.val) {
            if (root.next != null)
                root = root.next;
            else {
                root = null;
                last = root;
            }
        }

        ListNode current = root;
        while (current.next != null) {
            if (key == current.next.val) {
                current.next = current.next.next != null ? current.next.next : null;
                if (key == last.val)
                    last = current.next != null ? current.next : current;
                break;
            }
            current = current.next;
        }
    }

    public boolean contains(int key) {
        if (last != null && last.val == key)
            return true;

        ListNode current = root;
        while (current != null) {
            if (key == current.val) return true;
            current = current.next;
        }
        return false;
    }

    public void output() {
        ListNode current = root;
        while (current != null) {
            System.out.print(current.val);
            current = current.next;
        }
        System.out.println(" ");
    }
}
