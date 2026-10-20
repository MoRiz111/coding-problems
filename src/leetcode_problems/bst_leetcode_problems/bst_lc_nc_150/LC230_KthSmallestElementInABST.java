package leetcode_problems.bst_leetcode_problems.bst_lc_nc_150;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

import leetcode_problems.binary_tree_leetcode_problems.TreeNode;


public class LC230_KthSmallestElementInABST {
	public int kthSmallestIterative(TreeNode root, int k) {
		int count = 0;
		Stack<TreeNode> stack = new Stack<>();
		
		stack.push(root);
		root = root.left;
		
		while (!stack.isEmpty()) {
			while (root != null) {
				stack.push(root);
				root = root.left;
			}
			
			root = stack.pop();
			count++;
			
			if (count == k) {
				return root.val;
			}
			
			root = root.right;
		}
		
		return 0;
    }
	
	/**
	 * In-order traversal of BST gives sorted list
	 * TC - O(H + K) - In iterative inorder traversal, we use a stack to reach the leftmost node before processing nodes in sorted order.
                       1. Reach the first node: We may need to traverse a path of height \(H\) to reach the leftmost node.
                          This takes - O(H).
                       2. Visit the next k nodes: We process nodes in inorder until we reach the k-th smallest element.
                          This takes O(k) additional time.
	 * SC - O(H) -> O(logN) (as height = logN for balanced binary tree),
	 *              but for worst case skewed tree - SC - O(N)
	 */
	public int kthSmallestInRecursive(TreeNode root, int k) {
		int[] res = {0, 0};
		helper(root, k, res);
		
		return res[1];
    }
	
	public void helper(TreeNode root, int k, int[] res) {
		if (root == null || res[0] >= k) {
			return;
		}
		
		helper(root.left, k, res);
		
		if (res[0] >= k) {
			return;
		}
		
		res[0]++;
		
		if (res[0] == k) {
			res[1] = root.val;
			return;
		}
		
		helper(root.right, k, res);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	/**
	 * In-order traversal of BST gives sorted list
	 * TC - O(N)
	 * SC - O(H) -> O(logN) (as height = logN for balanced binary tree),
	 *              but for worst case skewed tree - SC - O(N)
	 */
	public int kthSmallestInEfficient(TreeNode root, int k) {
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
