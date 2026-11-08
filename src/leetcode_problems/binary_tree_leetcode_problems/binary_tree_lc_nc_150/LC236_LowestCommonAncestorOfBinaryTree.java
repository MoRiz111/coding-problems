package leetcode_problems.binary_tree_leetcode_problems.binary_tree_lc_nc_150;

import leetcode_problems.binary_tree_leetcode_problems.TreeNode;

public class LC236_LowestCommonAncestorOfBinaryTree {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        TreeNode res = null;
        boolean[] val = {false, false};
        
        dfs(root,p,q,res,val);
        return res;
    }
    
    private void dfs(TreeNode root, TreeNode p, TreeNode q, TreeNode res, boolean[] val) {
    	if (root == null || (val[0] && val[1])) {
    		return;
    	}
    	
    	if (p.val == root.val) {
    		val[0] = true;
    	} else if (q.val == root.val) {
    		val[1] = true;
    	}
    	
    	dfs(root.left,p,q,res,val);
    	dfs(root.right,p,q,res,val);
    	
    	if (val[0] && val[1]) {
    		if (res == null) {
    			res = root;
    			return;
    		}
    	}
    }
}
