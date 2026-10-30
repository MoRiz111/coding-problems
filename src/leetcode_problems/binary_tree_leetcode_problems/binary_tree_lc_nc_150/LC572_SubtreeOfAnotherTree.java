package leetcode_problems.binary_tree_leetcode_problems.binary_tree_lc_nc_150;

import java.util.Stack;

import leetcode_problems.binary_tree_leetcode_problems.TreeNode;

/**
 * PreOrder Traversal (or any type of traversal)
 * 
 * N - no. of nodes in tree
 * M - no. of nodes in sub-tree
 * 
 * TC - O(N*M)
 * SC - O(logN * logM)
 */
public class LC572_SubtreeOfAnotherTree {
	public boolean isSubtree(TreeNode root, TreeNode subRoot) { // TC - O(N)
		if (root == null) {
			return false;
		}
		
		if (isTreeIdentical(root, subRoot)) {
			return true;
		}
		
		return (isSubtree(root.left, subRoot) || isSubtree(root.right, subRoot));
	}
	
	public boolean isTreeIdentical(TreeNode root, TreeNode subRoot) { // TC - O(N)
		if (root == null && subRoot == null) {
			return true;
		}
		
		if (root == null || subRoot == null) {
			return false;
		}
		
		if (root.val != subRoot.val) {
			return false;
		}
		
		return isTreeIdentical(root.left, subRoot.left) && isTreeIdentical(root.right, subRoot.right);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
    public boolean isSubtreeWrong(TreeNode root, TreeNode subRoot) {
        Stack<TreeNode> stack = new Stack<TreeNode>();
        
        stack.push(root);
        
        while(!stack.isEmpty()) {
        	root = stack.pop();
        	
        	if (root.val == subRoot.val) {
        		if (isTreeIdenticalWrong(root, subRoot)) {
        			return true;
        		}
        	}
        	
        	TreeNode left = root.left;
        	TreeNode right = root.right;
        	
        	if (left != null) {
        		stack.push(left);
        	}
        	
        	if (right != null) {
        		stack.push(right);
        	}
        }
        
        return false;
    }
    
    public boolean isTreeIdenticalWrong(TreeNode root, TreeNode subRoot) {
    	Stack<TreeNode> stack1 = new Stack<TreeNode>();
    	Stack<TreeNode> stack2 = new Stack<TreeNode>();
    	
    	stack1.push(root);
    	stack2.push(subRoot);
    	
    	while(!stack1.isEmpty() && !stack2.isEmpty()) {
    		root = stack1.pop();
    		subRoot = stack2.pop();
    		
        	if (root.val != subRoot.val) {
        		return false;
        	}
    		
        	TreeNode left = root.left;
        	TreeNode right = root.right;
        	TreeNode subLeft = subRoot.left;
        	TreeNode subRight = subRoot.right;
        	
        	
        	if (left != null) {
        		stack1.push(left);
        	}
        	
        	if (right != null) {
        		stack1.push(right);
        	}
        	
        	if (subLeft != null) {
        		stack2.push(subLeft);
        	}
        	
        	if (subRight != null) {
        		stack2.push(subRight);
        	}
        	
        	if (left.val != subLeft.val || right.val != subRight.val) {
        		return false;
        	}
    	}
    	
    	if (!stack1.isEmpty() || !stack2.isEmpty()) {
    		return false;
    	}
    	
    	return true;
    }
}
