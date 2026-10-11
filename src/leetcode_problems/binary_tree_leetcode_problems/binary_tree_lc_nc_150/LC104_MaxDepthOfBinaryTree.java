package leetcode_problems.binary_tree_leetcode_problems.binary_tree_lc_nc_150;

import leetcode_problems.binary_tree_leetcode_problems.TreeNode;

/**
 * Recursion (DFS)
 * TC - O(N)
 * SC - O(h) -> O(logN) (as height = logN), but for worst case skewed tree - SC - O(N)
 */
public class LC104_MaxDepthOfBinaryTree {
	public int maxDepth(TreeNode root) {
        if (root == null) {
            return 0;
        }

        return 1 + Math.max(maxDepth(root.left), maxDepth(root.right));
    }
}
