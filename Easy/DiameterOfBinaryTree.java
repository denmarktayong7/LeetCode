/*
Given a binary tree, you need to compute the length of the diameter of the tree. The diameter of a binary tree is the length of the longest path between any two nodes in a tree. This path may or may not pass through the root.

Example:
Given a binary tree
          1
         / \
        2   3
       / \     
      4   5    
Return 3, which is the length of the path [4,2,1,3] or [5,2,1,3].

Note: The length of path between two nodes is represented by the number of edges between them.
/*
/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    public int diameterOfBinaryTree(TreeNode root) {
        if(root == null)
            return 0;
        return getDiameter(root);
    }
    
    public int getHeight(TreeNode tn) {
        if(tn == null) {
            return 0;
        }
        
        int leftHeight = 0;
        int rightHeight = 0;
        if(tn.left != null) 
            leftHeight = getHeight(tn.left);
        if(tn.right != null) 
            rightHeight = getHeight(tn.right);
        
        return Math.max(leftHeight,rightHeight)+1;
    }
    
    public int getDiameter(TreeNode tn) {
        if(tn == null) {
            return 0;
        }
        
        int diameter = getHeight(tn.left) + getHeight(tn.right);
        int leftDiameter = 0, rightDiameter = 0;
        if(tn.left != null) {
            if(getHeight(tn.left.left) + getHeight(tn.left.right) >= diameter)
                leftDiameter = getDiameter(tn.left);
        }
        if(tn.right != null) {
            if(getHeight(tn.right.left) + getHeight(tn.right.right) >= diameter)
                rightDiameter = getDiameter(tn.right);
        }
        int higher = Math.max(leftDiameter, rightDiameter);
        return Math.max(diameter, higher);
    }
    
}
