package leetcode_problems.stack_leetcode_problems.stack_lc_nc_150;

import java.util.ArrayDeque;
import java.util.Deque;

/**
 * Stack
 * TC - O(N)
 * SC - O(N)
 */
public class LC150_EvaluateReversePolishNotation {

    public int evalRPN(String[] tokens) {

        Deque<Integer> stack = new ArrayDeque<>();

        for (String token : tokens) {

            if (token.equals("+")) {

                int second = stack.pop();
                int first = stack.pop();

                stack.push(first + second);

            } else if (token.equals("-")) {

                int second = stack.pop();
                int first = stack.pop();

                stack.push(first - second);

            } else if (token.equals("*")) {

                int second = stack.pop();
                int first = stack.pop();

                stack.push(first * second);

            } else if (token.equals("/")) {

                int second = stack.pop();
                int first = stack.pop();

                stack.push(first / second);

            } else {

                stack.push(Integer.parseInt(token));
            }
        }

        return stack.pop();
    }

    public static void main(String[] args) {

        LC150_EvaluateReversePolishNotation solution =
                new LC150_EvaluateReversePolishNotation();

        String[] tokens = {
            "2", "1", "+", "3", "*"
        };

        int result = solution.evalRPN(tokens);

        System.out.println(result);
    }
}
