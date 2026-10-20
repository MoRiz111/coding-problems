package util;

import leetcode_problems.binary_tree_leetcode_problems.TreeNode;

public class UtilClass {

	public TreeNode convertArrayToBinaryTreeIterative(Integer[] input) {
		int len = input.length;
		
		if (len == 0) {
			return null;
		}
		
		TreeNode root = new TreeNode(input[0]);
		
		int i = 0;
		
		
		while (i < len) {
			TreeNode cur = root;
			Integer left = (i+1) < len ? input[i+1] : null;
			Integer right = (i+2) < len ? input[i+2] : null;
			
		}
		
		return null;
	}
	
	public TreeNode convertArrayToBinaryTreeRecursive(Integer[] input) {
		int len = input.length;
		
		if (len == 0) {
			return null;
		}
		
		return helper(input, len, 0);
	}
	
	TreeNode helper(Integer[] input, int len, int i) {
		if (i >= len || input[i] == null) {
			return null;
		}
		
		TreeNode root = new TreeNode(input[i]);
		root.left = helper(input, len, 2*i+1);
		root.right = helper(input, len, 2*i+2);
		
		return root;
	}
}
