package leetcode_problems.binary_tree_leetcode_problems.binary_tree_lc_nc_150;

import leetcode_problems.binary_tree_leetcode_problems.TreeNode;

public class LC124_BinaryTreeMaximumPathSum {
	int res = 0;
	
	public int maxPathSum(TreeNode root) {
		int sum = helper(root);
		return sum;
    }
	
	public int helper(TreeNode root) {
		if (root == null) {
			return 0;
		}
		
        int sum = 0;
        int leftSum = maxPathSum(root.left);
        int rightSum = maxPathSum(root.right);
        
        sum = (leftSum) > 0 ? leftSum : 0;
        res = Math.max(res, sum);
        sum = (sum + root.val) > 0 ? (sum + root.val) : 0;
        res = Math.max(res, sum);
        sum = (sum + rightSum) > 0 ? (sum + rightSum) : 0;
        res = Math.max(res, sum);
        
        return sum;
	}
}
