package leetcode_problems.binary_tree_leetcode_problems.binary_tree_lc_non_nc_150;

import leetcode_problems.binary_tree_leetcode_problems.TreeNode;

/**
 * Recursive DFS - Post-order traversal
 * TC - O(N)
 * SC - O(H) -> O(logN) (as height = logN for balanced binary tree),
 *              but for worst case skewed tree - SC - O(N)
 */
public class LC236_LowestCommonAncestorOfBinaryTree {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
    	//Handle 3 conditions
    	//1
    	if (root == null || root.val == p.val || root.val == q.val) {
    		return root;
    	}
    	
    	TreeNode left = lowestCommonAncestor(root.left, p, q);
    	TreeNode right = lowestCommonAncestor(root.right, p, q);
    	
    	
    	//2.value or present on both subtrees, so current root is the LCA
    	if (left != null && right != null) {
    		return root;
    	}
    	
    	//3
    	return (left != null) ? left : right;
    }
}
