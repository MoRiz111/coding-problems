package leetcode_problems.binary_tree_leetcode_problems.binary_tree_lc_nc_150;

import leetcode_problems.binary_tree_leetcode_problems.TreeNode;

/**
 * Recursive - DFS. 
 * Passing the max. from the top, and check if the current is >= max
 * TC - O(N)
 * SC - O(H) -> O(logN) (as height = logN for balanced binary tree),
 *              but for worst case skewed tree - SC - O(N) 
 */
public class LC1448_CountGoodNodesInBinaryTree {
    public int goodNodes(TreeNode root) {
        int[] count = {0};
        helper(count,-10001, root);
        
        return count[0];
    }
    
    public void helper(int[] count, int max, TreeNode root) {
    	if (root == null) {
    		return;
    	}
    	
    	int val = root.val;
    	
    	if (max <= val) {
    		count[0]++;
    		max = val;
    	}
    	
    	helper(count, max, root.left);
    	helper(count, max, root.right);
    }
}
