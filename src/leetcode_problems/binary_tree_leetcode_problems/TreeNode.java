package leetcode_problems.binary_tree_leetcode_problems;

public class TreeNode {
	public int val;
	public TreeNode left;
	public TreeNode right;

	
	public TreeNode(int val) { 
		this.val = val;
	}
	
	TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
	}
}
