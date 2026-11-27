package util;

import leetcode_problems.binary_tree_leetcode_problems.TreeNode;

public class UtilClass {
	public static TreeNode convertArrayToBinaryTree(String[] input) {
		int[] ind = {0};
        return deserializeHelper(input, ind);
	}
	
	private static TreeNode deserializeHelper(String[] arr, int[] ind) {
    	String valAsString = arr[ind[0]++];
    	
    	if (valAsString.equals("N")) {
    		return null;
    	}
    	
    	TreeNode root = new TreeNode(Integer.valueOf(valAsString));
    	root.left = deserializeHelper(arr, ind);
    	root.right = deserializeHelper(arr, ind);
    	
    	return root;
    }
	
	public static String convertBinaryTreeToArray(TreeNode root) {
		StringBuilder sb = new StringBuilder();
        serializeHelper(sb, root);
        return sb.toString();
	}
	
	private static void serializeHelper(StringBuilder sb, TreeNode root) {
    	sb.append(root.val).append(",");
    	
    	TreeNode left = root.left;
    	if (left != null) {
    		serializeHelper(sb, left);
    	} else {
    		sb.append("N,");
    	}
    	
    	TreeNode right = root.right;
    	if (right != null) {
    		serializeHelper(sb, right);
    	} else {
    		sb.append("N,");
    	}
    }

//	public TreeNode convertArrayToBinaryTreeIterative(Integer[] input) {
//		int len = input.length;
//		
//		if (len == 0) {
//			return null;
//		}
//		
//		TreeNode root = new TreeNode(input[0]);
//		
//		int i = 0;
//		
//		
//		while (i < len) {
//			TreeNode cur = root;
//			Integer left = (i+1) < len ? input[i+1] : null;
//			Integer right = (i+2) < len ? input[i+2] : null;
//			
//		}
//		
//		return null;
//	}
//	
//	public TreeNode convertArrayToBinaryTreeRecursive(Integer[] input) {
//		int len = input.length;
//		
//		if (len == 0) {
//			return null;
//		}
//		
//		return helper(input, len, 0);
//	}
//	
//	TreeNode helper(Integer[] input, int len, int i) {
//		if (i >= len || input[i] == null) {
//			return null;
//		}
//		
//		TreeNode root = new TreeNode(input[i]);
//		root.left = helper(input, len, 2*i+1);
//		root.right = helper(input, len, 2*i+2);
//		
//		return root;
//	}
}
