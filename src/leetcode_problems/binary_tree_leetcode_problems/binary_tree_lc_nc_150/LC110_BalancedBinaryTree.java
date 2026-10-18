package leetcode_problems.binary_tree_leetcode_problems.binary_tree_lc_nc_150;

import leetcode_problems.binary_tree_leetcode_problems.TreeNode;

/**
 * Recursion - DFS, bottom up
 * TC - O(N)
 * SC - O(H) -> O(logN) (as height = logN for balanced binary tree),
 *              but for worst case skewed tree - SC - O(N)
 */
public class LC110_BalancedBinaryTree {
    public boolean isBalanced(TreeNode root) {
        return isHeightBalanced(root) != -1;
    }
    
    public int isHeightBalanced(TreeNode root) {
    	if (root == null) {
    		return 0;
    	}
    	
    	int leftHeight = isHeightBalanced(root.left);
    	int rightHeight = isHeightBalanced(root.right);
    	
    	if (leftHeight == -1 || rightHeight == -1 || Math.abs(rightHeight-leftHeight) > 1) {
    		return -1;
    	}
    	
    	return 1 + Math.max(leftHeight, rightHeight);
    }
}
