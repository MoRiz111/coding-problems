package leetcode_problems.binary_tree_leetcode_problems.binary_tree_lc_nc_150;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Queue;

import leetcode_problems.binary_tree_leetcode_problems.TreeNode;

/**
 * BFS - Level Order Traversal
 * TC - O(N)
 * SC - O(W), space for queue, where W is the maximum width of the binary tree. 
 *      The BFS queue stores nodes level by level, 
 *      so its maximum space usage depends on the maximum number of nodes at any level. 
 *      In a perfect binary tree, nearly half of all nodes are at the last level (leaf level), 
 *      so W can be O(N) in the worst case.
 *      In case of skewed tree, SC - O(1), as skewed tree's max. width is 1.
 */
public class LC102_BinaryTreeLevelOrderTraversal {
    public List<List<Integer>> levelOrder(TreeNode root) {
    	List<List<Integer>> res = new ArrayList<List<Integer>>();
    	Queue<TreeNode> queue = new ArrayDeque<TreeNode>();
    	
    	if (root != null) {
    		queue.add(root);
    	}
    	
    	while (!queue.isEmpty()) {
    		int size = queue.size();
    		List<Integer> curLevelElts = new ArrayList<Integer>();
    		
    		for (int i=0; i<size; i++) {
    			TreeNode poppedElt = queue.poll();
    			curLevelElts.add(poppedElt.val);
    			
    			TreeNode left = poppedElt.left;
    			TreeNode right = poppedElt.right;
    			
    			if (left != null) {
    				queue.add(left);
    			}
    			
    			if (right != null) {
    				queue.add(right);
    			}
    		}
    		
    		res.add(curLevelElts);
    	}
    	
    	return res;
    }
}
