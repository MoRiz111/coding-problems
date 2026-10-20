package leetcode_problems.binary_tree_leetcode_problems.binary_tree_lc_nc_150;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

import leetcode_problems.binary_tree_leetcode_problems.TreeNode;

public class LC105_ConstructBinaryTreeFromPreOrderAndInOrderTraversal {
	public TreeNode buildTree(int[] preorder, int[] inorder) {
		int len = preorder.length;
		
		if (len == 0) {
			return null;
		}
		
		TreeNode root = new TreeNode(preorder[0]);
		
		int mid = 0;
		
		for (int i=0; i<len; i++) {
			if (inorder[i] == preorder[0]) {
				mid = i;
				break;
			}
		}
		
		root.left = buildTree(Arrays.copyOfRange(preorder, 1, mid+1), Arrays.copyOfRange(inorder, 0, mid));
		root.right = buildTree(Arrays.copyOfRange(preorder, mid+1, len), Arrays.copyOfRange(inorder, mid+1, len));
		
		return root;
	}
	
    public TreeNode buildTreeEffective(int[] preorder, int[] inorder) {
        Map<Integer, Integer> inorderMap = new HashMap<Integer, Integer>();
        
        for (int i = 0; i < inorder.length; i++) {
        	inorderMap.put(inorder[i], i);
        }
        
        return helperEffective(preorder, inorderMap, 0, inorder.length-1);
    }
    
    public TreeNode helperEffective(int[] preorder,
    		Map<Integer, Integer> inorderMap, int left, int right) {
    	TreeNode root = new TreeNode(preorder[left]);
    	
    	if (left == right) {
    		return root;
    	}
    	
    	int mid = inorderMap.get(preorder[0]);
    	
    	root.left = helperEffective(preorder, inorderMap, left+1, mid);
    	root.right = helperEffective(preorder, inorderMap, mid+1, right);
    	
    	return root;
    }
}
