// 98. Validate Binary Search Tree My Submissions Question
// Total Accepted: 81302 Total Submissions: 393763 Difficulty: Medium
// Given a binary tree, determine if it is a valid binary search tree (BST).
//
// Assume a BST is defined as follows:
//
// The left subtree of a node contains only nodes with keys less than the node's key.
// The right subtree of a node contains only nodes with keys greater than the node's key.
// Both the left and right subtrees must also be binary search trees.
/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class Solution {
        // boolean a1=true;
        // int prev=Integer.MIN_VALUE;
        // int cur;
        // int count=0;
   public boolean isValidBST(TreeNode root) {
    return isValidBST(root, Long.MIN_VALUE, Long.MAX_VALUE);
}
    private boolean isValidBST(TreeNode root,long min,long max)
    {
        return (root==null)||(min<root.val && max>root.val && isValidBST(root.left,min,root.val) && isValidBST(root.right,root.val,max) );

    }
}
