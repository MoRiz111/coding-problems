package leetcode_problems.binary_tree_leetcode_problems.binary_tree_lc_nc_150;

import leetcode_problems.binary_tree_leetcode_problems.TreeNode;

public class LC543_DiameterOfABinaryTree {
    public int diameterOfBinaryTree(TreeNode root) {
    	int[] dia = {0};
    	helper(root, dia);
    	
    	return dia[0];
    }
    
    public int helper(TreeNode root, int[] dia) {
    	if (root == null || (root.left == null && root.right == null)) {
    		return 0;
    	}
    	
    	int len = 1;
    	
    	if (root.left != null && root.right != null) {
    		len = 2;
    	}
    	
    	int leftLen = helper(root.left, dia);
    	int rightLen = helper(root.right, dia);
    	
    	dia[0] = Math.max(dia[0], len + leftLen + rightLen);
    	
    	return 1 + Math.max(leftLen, rightLen);
    }
}
