package leetcode_problems.bst_leetcode_problems.bst_lc_nc_150;

import java.util.ArrayList;
import java.util.List;

import leetcode_problems.binary_tree_leetcode_problems.TreeNode;

/**
 * In-order traversal of BST gives sorted list
 * TC - O(N)
 * SC - O(H) -> O(logN) (as height = logN for balanced binary tree),
 *              but for worst case skewed tree - SC - O(N)
 */
public class LC230_KthSmallestElementInABST {
	public int kthSmallest(TreeNode root, int k) {
		List<Integer> res = new ArrayList<>();
		getKthSmallest(root, k, res);
		return res.get(k-1);
    }
	
	public void getKthSmallest(TreeNode root, int k, List<Integer> res) {
		if (root == null) {
			return;
		}
		
		getKthSmallest(root.left, k, res);
		
		int val = root.val;
		res.add(val);
		
		if (res.size() == k) {
			return;
		}
		
		getKthSmallest(root.right, k, res);
	}
}
