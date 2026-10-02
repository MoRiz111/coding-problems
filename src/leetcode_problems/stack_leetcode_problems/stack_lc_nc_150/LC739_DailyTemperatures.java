package leetcode_problems.stack_leetcode_problems.stack_lc_nc_150;

import java.util.Deque;
import java.util.ArrayDeque;
import java.util.Arrays;

/**
 * Stack
 * TC - O(N)
 * SC - O(N)
 */
public class LC739_DailyTemperatures {

    public int[] dailyTemperatures(int[] temperatures) {

        Deque<Integer> stack = new ArrayDeque<>();
        int[] result = new int[temperatures.length];

        for (int i = 0; i < temperatures.length; i++) {

            while (!stack.isEmpty()
                    && temperatures[i] > temperatures[stack.peek()]) {

                int previousIndex = stack.pop();

                result[previousIndex] = i - previousIndex;
            }

            stack.push(i);
        }

        return result;
    }

    public static void main(String[] args) {

        LC739_DailyTemperatures solution =
                new LC739_DailyTemperatures();

        int[] temperatures = {
            73, 74, 75, 71, 69, 72, 76, 73
        };

        int[] result = solution.dailyTemperatures(temperatures);

        System.out.println(Arrays.toString(result));
    }
}
