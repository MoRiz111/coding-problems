package leetcode_problems.stack_leetcode_problems.stack_lc_nc_150;

import java.util.ArrayDeque;
import java.util.Deque;

/**
 * Stack
 * TC - O(1)
 */
public class LC155_MinStack {

    private Deque<Integer> stack;
    private Deque<Integer> minStack;

    public LC155_MinStack() {

        stack = new ArrayDeque<>();
        minStack = new ArrayDeque<>();
    }

    public void push(int val) {

        stack.push(val);

        if (minStack.isEmpty()) {
            minStack.push(val);
        } else {
            minStack.push(Math.min(val, minStack.peek()));
        }
    }

    public void pop() {

        stack.pop();
        minStack.pop();
    }

    public int top() {

        return stack.peek();
    }

    public int getMin() {

        return minStack.peek();
    }

    public static void main(String[] args) {

        LC155_MinStack minStack =
                new LC155_MinStack();

        minStack.push(-2);
        minStack.push(0);
        minStack.push(-3);

        System.out.println(
                "Minimum: " + minStack.getMin()
        );

        minStack.pop();

        System.out.println(
                "Top: " + minStack.top()
        );

        System.out.println(
                "Minimum: " + minStack.getMin()
        );
    }
}
