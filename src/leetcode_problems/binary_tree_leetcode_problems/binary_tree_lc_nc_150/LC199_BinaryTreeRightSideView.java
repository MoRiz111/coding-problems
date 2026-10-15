package leetcode_problems.binary_tree_leetcode_problems.binary_tree_lc_nc_150;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;

import leetcode_problems.binary_tree_leetcode_problems.TreeNode;

/**
 * Binary Tree - BFS level order traversal
 * TC - O(N)
 * SC - O(W), space for queue, where W is the maximum width of the binary tree. 
 *      The BFS queue stores nodes level by level, 
 *      so its maximum space usage depends on the maximum number of nodes at any level. 
 *      In a perfect binary tree, nearly half of all nodes are at the last level (leaf level), 
 *      so W can be O(N) in the worst case.
 *      In case of skewed tree, SC - O(1), as skewed tree's max. width is 1.
 */
public class LC199_BinaryTreeRightSideView {
    public List<Integer> rightSideView(TreeNode root) {
    	List<Integer> res = new ArrayList<Integer>();
    	
    	if (root == null) {
    		return res;
    	}
    	
    	ArrayDeque<TreeNode> queue = new ArrayDeque<TreeNode>();
    	
    	queue.add(root);
    	
    	while (!queue.isEmpty()) {
    		int size = queue.size();
    		
    		for (int i=0; i<size; i++) {
    			TreeNode poppedElt = queue.pollFirst();
    			
    			if (i == size-1) {
    				res.add(poppedElt.val);
    			}
    			
    			TreeNode left = poppedElt.left;
    			TreeNode right = poppedElt.right;
    			
    			if (left != null) {
    				queue.add(poppedElt.left);
    			}
    			
    			if (right != null) {
    				queue.add(right);
    			}
    		}
    	}
    	
    	return res;
    }
}
