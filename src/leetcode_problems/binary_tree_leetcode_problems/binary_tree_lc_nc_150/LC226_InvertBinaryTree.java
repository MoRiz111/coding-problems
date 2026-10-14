package leetcode_problems.binary_tree_leetcode_problems.binary_tree_lc_nc_150;

import leetcode_problems.binary_tree_leetcode_problems.TreeNode;

/**
 * Recursive DFS
 * TC - O(N) 
 * SC - O(H) -> O(logN) (as height = logN for balanced binary tree),
 *              but for worst case skewed tree - SC - O(N)
 */
public class LC226_InvertBinaryTree {
    public TreeNode invertTree(TreeNode root) {
    	if (root != null) {
    		TreeNode temp = root.left;
    		root.left = root.right;
    		root.right = temp;
    		
    		invertTree(root.left);
    		invertTree(root.right);
    	}
    	
    	return root;
    }
}
