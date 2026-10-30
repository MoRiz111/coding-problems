package leetcode_problems.binary_tree_leetcode_problems.binary_tree_lc_nc_150;

import java.util.Stack;

import leetcode_problems.binary_tree_leetcode_problems.TreeNode;

public class LC297_SerializeAndDeserializeBinaryTree {
    // Encodes a tree to a single string.
    public String serialize(TreeNode root) {
    	StringBuilder treeAsString = new StringBuilder();
    	serializeHelper(root, treeAsString);
    	
    	return treeAsString.toString();
    }

    public void serializeHelper(TreeNode root, StringBuilder treeAsString) {
    	if (root == null) {
        	treeAsString.append("N,");
        	return;
        }
    	
        treeAsString.append(root.val).append(',');
        
        serializeHelper(root.left, treeAsString);
        serializeHelper(root.right, treeAsString);
    }
    
    // Decodes your encoded data to tree.
    public TreeNode deserialize(String data) {
        String[] treeArray = data.split(",");

        return deserializeHelper(0, treeArray);
    }
    
    public TreeNode deserializeHelper(int i, String[] treeArray) {
    	if (i >= treeArray.length || treeArray[i].equals("N")) {
    		return null;
    	}
    	
    	 TreeNode tree = new TreeNode(Integer.valueOf(treeArray[i]));
    	 tree.left = deserializeHelper(2*i+1, treeArray);
    	 tree.left = deserializeHelper(2*i+2, treeArray);
    	 
    	 return tree;
    }
}
