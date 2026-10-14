package leetcode_problems.binary_tree_leetcode_problems.binary_tree_lc_nc_150;

import leetcode_problems.binary_tree_leetcode_problems.TreeNode;

/**
 * Recursive DFS
 * TC - O(N)
 * SC - O(H) -> O(logN) (as height = logN for balanced binary tree),
 *              but for worst case skewed tree - SC - O(N)
 */
public class LC100_SameTree {
    public boolean isSameTree(TreeNode p, TreeNode q) {
        if (p == null && q == null) {
        	return true;
        }
        
        if (p == null || q == null || p.val != q.val) {
        	return false;
        }
        
        return isSameTree(p.left, q.left) && isSameTree(p.right, q.right);
    }
}
