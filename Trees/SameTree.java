// 100. Same Tree My Submissions Question
// Total Accepted: 109754 Total Submissions: 257150 Difficulty: Easy
// Given two binary trees, write a function to check if they are equal or not.
//
// Two binary trees are considered equal if they are structurally identical and the nodes have the same value.


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
    boolean state=true;
    public boolean isSameTree(TreeNode p, TreeNode q) {
     if(p==null || q==null) return q==p;
return p.val==q.val && isSameTree(p.left,q.left) && isSameTree(p.right,q.right);
    }
}
