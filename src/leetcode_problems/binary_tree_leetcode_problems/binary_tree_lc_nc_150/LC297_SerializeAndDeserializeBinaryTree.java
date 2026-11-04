package leetcode_problems.binary_tree_leetcode_problems.binary_tree_lc_nc_150;

import java.util.Stack;

import leetcode_problems.binary_tree_leetcode_problems.TreeNode;

public class LC297_SerializeAndDeserializeBinaryTree {
	public String serialize(TreeNode root) {
		StringBuilder serializedTree = new StringBuilder();
		Stack<TreeNode> stack = new Stack<>();
		
		while (root != null || !stack.isEmpty()) {
			if (stack.isEmpty()) {
				stack.add(root);
			}
			
			root = stack.pop();
			
			if (root != null) {
				serializedTree.append(Integer.toString(root.val));
				serializedTree.append(",");
				
				stack.add(root.left);
				stack.add(root.right);
			} else {
				serializedTree.append("N,");
			}
		}
		
		return serializedTree.toString();
	}
	
	public TreeNode deserialize(String data) {
		String[] serializeArray = data.split(",");
		int size = serializeArray.length;
		int[] i = {0};
		
		return deserializeHelper(serializeArray, i, size);
	}
	
	public TreeNode deserializeHelper(String[] serializeArray, int[] i, int size) {
		String valStr = serializeArray[i[0]];
		i[0]++;
		
		if (i[0] >= size || valStr.equals("N")) {
			return null;
		}
		
		TreeNode root = new TreeNode(Integer.valueOf(valStr));
		root.left = deserializeHelper(serializeArray, i, size);
		root.right = deserializeHelper(serializeArray, i, size);
		
		return root;
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
    // Encodes a tree to a single string.
//    public String serialize(TreeNode root) {
//    	StringBuilder treeAsString = new StringBuilder();
//    	serializeHelper(root, treeAsString);
//    	
//    	return treeAsString.toString();
//    }

//    public void serializeHelper(TreeNode root, StringBuilder treeAsString) {
//    	if (root == null) {
//        	treeAsString.append("N,");
//        	return;
//        }
//    	
//        treeAsString.append(root.val).append(',');
//        
//        serializeHelper(root.left, treeAsString);
//        serializeHelper(root.right, treeAsString);
//    }
//    
//    // Decodes your encoded data to tree.
//    public TreeNode deserialize(String data) {
//        String[] treeArray = data.split(",");
//
//        return deserializeHelper(0, treeArray);
//    }
//    
//    public TreeNode deserializeHelper(int i, String[] treeArray) {
//    	if (i >= treeArray.length || treeArray[i].equals("N")) {
//    		return null;
//    	}
//    	
//    	 TreeNode tree = new TreeNode(Integer.valueOf(treeArray[i]));
//    	 tree.left = deserializeHelper(2*i+1, treeArray);
//    	 tree.left = deserializeHelper(2*i+2, treeArray);
//    	 
//    	 return tree;
//    }
}
