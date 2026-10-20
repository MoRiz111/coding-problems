package leetcode_problems.bst_leetcode_problems.bst_lc_nc_150;

import leetcode_problems.binary_tree_leetcode_problems.TreeNode;

/**
 * Moving left and right, based on p & q values
 * TC - O(H) -> O(logN) (as height = logN for balanced binary tree),
 *              as we are moving either left or right, and not traversing through every element.
 * SC - O(1)
 */
public class LC235_LowestCommonAncestorOfABST {
	public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        while (root != null) {
        	if (p.val > root.val && q.val > root.val) {
        		root = root.right;
        	} else if (p.val < root.val && q.val < root.val) {
        		root = root.left;
        	} else {
        		return root;
        	}
        }
        
        return root;
    }
}
