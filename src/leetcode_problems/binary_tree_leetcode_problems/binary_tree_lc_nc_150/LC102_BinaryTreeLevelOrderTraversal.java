package leetcode_problems.binary_tree_leetcode_problems.binary_tree_lc_nc_150;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

import leetcode_problems.binary_tree_leetcode_problems.TreeNode;

public class LC102_BinaryTreeLevelOrderTraversal {
    public List<List<Integer>> levelOrder(TreeNode root) {
    	List<List<Integer>> res = new ArrayList<List<Integer>>();
        Stack<TreeNode> oldStack = new Stack<>();
        Stack<TreeNode> newStack = new Stack<>();
        oldStack.add(root);
        
        while (!oldStack.isEmpty()) {
        	TreeNode poppedElt = oldStack.pop();
        	
        	if (poppedElt != null) {
        		newStack.add(poppedElt.left);
        		newStack.add(poppedElt.right);
        	}
        }
    }
}
