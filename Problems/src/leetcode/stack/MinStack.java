/*
 * Copyright (c) 2021.
 * @author TunayNovruz
 *
 */

package leetcode.stack;

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(x);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */

class MinStack {
    StackNode<Integer> root;
    StackNode<Integer> temp;
    int size;

    public MinStack() {
    }

    public void push(int x) {
        StackNode<Integer> node = new StackNode<>(x);
        if (size == 0) {
            temp = root;
            root = node;
            node.next = temp;
        } else
            root = node;
        size++;
    }

    public void pop() {
        root = root.next;
    }

    public int top() {
        return root == null ? 0 : root.value;
    }

    public int getMin() {
        int min = Integer.MAX_VALUE;
        temp = root;
        while (temp != null) {
            if (temp.value < min) min = temp.value;
            temp = temp.next;
        }
        return min;
    }
}

class StackNode<N> {
    int value;
    StackNode<N> next;

    StackNode(int val) {
        value = val;
    }
}