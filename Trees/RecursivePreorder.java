//
//Given a binary tree, return the preorder traversal of its nodes' values.
//
//For example:
//Given binary tree {1,#,2,3},
//   1
//    \
//     2
//    /
//   3
//return [1,2,3].

/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
 
 import java.util.*;
public class Solution {
    List<Integer> a1 = new ArrayList();
    public List<Integer> preorderTraversal(TreeNode root) {
        
        
        if(root==null)
        return a1;
        
        a1.add(root.val);
        
        if(root.left!=null)
        a1=preorderTraversal(root.left);
        
        
        if(root.right!=null)
        a1=preorderTraversal(root.right);
        
        
        
        return a1;
    }
}