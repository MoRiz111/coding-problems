package leetcode_problems.binary_tree_leetcode_problems.binary_tree_lc_nc_150;

import leetcode_problems.binary_tree_leetcode_problems.TreeNode;

public class LC297_SerializeAndDeserializeBinaryTree {
    // Encodes a tree to a single string.
    public String serialize(TreeNode root) {
    	if (root == null) {
            return "N";
        }
    	
        StringBuilder sb = new StringBuilder();
        serializeHelper(sb, root);
        return sb.toString();
    }
    
    private void serializeHelper(StringBuilder sb, TreeNode root) {
    	sb.append(root.val).append(",");
    	
    	TreeNode left = root.left;
    	if (left != null) {
    		serializeHelper(sb, left);
    	} else {
    		sb.append("N,");
    	}
    	
    	TreeNode right = root.right;
    	if (right != null) {
    		serializeHelper(sb, right);
    	} else {
    		sb.append("N,");
    	}
    }

    // Decodes your encoded data to tree.
    public TreeNode deserialize(String data) {
        String[] arr = data.split(",");
        int[] ind = {0};
        
        return deserializeHelper(arr, ind);
    }
    
    private TreeNode deserializeHelper(String[] arr, int[] ind) {
    	String valAsString = arr[ind[0]++];
    	
    	if (valAsString.equals("N")) {
    		return null;
    	}
    	
    	TreeNode root = new TreeNode(Integer.valueOf(valAsString));
    	root.left = deserializeHelper(arr, ind);
    	root.right = deserializeHelper(arr, ind);
    	
    	return root;
    }
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
//	/**
//	 * DFS - Preorder Traversal
//	 * TC - O(N)
//	 * SC - O(H) -> O(logN) (as height = logN for balanced binary tree),
// *              but for worst case skewed tree - SC - O(N)
// *          [sb - O(N) space is for the output, so shouldn't be considered
// *                for auxiliary SC]
//	 */
//	public String serialize(TreeNode root) {
//		StringBuilder sb = new StringBuilder();
//		serializeHelper(root, sb);
//		return sb.toString();
//	}
//	
//	public void serializeHelper(TreeNode root, StringBuilder sb) {
//		if (root == null) {
//			sb.append("N,");
//			return;
//		}
//		
//		sb.append(root.val).append(",");
//		
//		serializeHelper(root.left, sb);
//		serializeHelper(root.right, sb);
//	}
//	
//	/**
//	 * DFS - Preorder Traversal
//	 * TC - O(N)
//	 * SC - O(N)
//	 */
//	public TreeNode deserialize(String data) {
//		String[] arr = data.split(",");
//		int[] i = {0};
//		
//		return deserializeHelper(i, arr);
//	}
//	
//	public TreeNode deserializeHelper(int[] i, String[] arr) {
//		String val = arr[i[0]++];
//		
//		if (val.equals("N")) {
//			return null;
//		}
//		
//		TreeNode root = new TreeNode(Integer.valueOf(val));
//		
//		root.left = deserializeHelper(i, arr);
//		root.right = deserializeHelper(i, arr);
//		
//		return root;
//	}
}
