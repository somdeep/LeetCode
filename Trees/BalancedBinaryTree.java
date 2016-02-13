// 110. Balanced Binary Tree My Submissions Question
// Total Accepted: 96099 Total Submissions: 287825 Difficulty: Easy
// Given a binary tree, determine if it is height-balanced.
//
// For this problem, a height-balanced binary tree is defined as a binary tree in which the depth of the two subtrees of every node never differ by more than 1.


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
    public boolean isBalanced(TreeNode root) {
        int test=height(root);
        if(test==-1)
            return false;

            else return true;
    }

    public int height(TreeNode root)
    {
        if(root==null)
            return 0;

        int left=height(root.left);
        int right=height(root.right);

        if(left==-1 || right ==-1 || Math.abs(left-right)>1)
            return -1;

        else
            return Math.max(left,right)+1;
    }
}
