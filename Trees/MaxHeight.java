// 104. Maximum Depth of Binary Tree My Submissions Question
// Total Accepted: 121158 Total Submissions: 257141 Difficulty: Easy
// Given a binary tree, find its maximum depth.
//
// The maximum depth is the number of nodes along the longest path from the root node down to the farthest leaf node.


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
    public int maxDepth(TreeNode root) {
        return height(root);
    }

    public int height(TreeNode root)
    {
        if(root==null)
            return 0;

        return Math.max(height(root.left)+1,height(root.right)+1);

    }
}
