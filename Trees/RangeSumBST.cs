// 938. Range Sum of BST
// Easy

// 359

// 60

// Favorite

// Share
// Given the root node of a binary search tree, return the sum of values of all nodes with value between L and R (inclusive).

// The binary search tree is guaranteed to have unique values.

// Example 1:

// Input: root = [10,5,15,3,7,null,18], L = 7, R = 15
// Output: 32
// Example 2:

// Input: root = [10,5,15,3,7,13,18,1,null,6], L = 6, R = 10
// Output: 23

// Note:

// The number of nodes in the tree is at most 10000.
// The final answer is guaranteed to be less than 2^31.

/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     public int val;
 *     public TreeNode left;
 *     public TreeNode right;
 *     public TreeNode(int x) { val = x; }
 * }
 */
public class Solution {
    public int RangeSumBST (TreeNode root, int L, int R)
     {
        return PreOrder(node, L , R);

        // while (node != null) {
        //     if (node.val > R) {
        //         return 0;
        //     } else if (node.val < L) {
        //         return 0;
        //     } else {
        //         sum + = node.val +
        //     }
        // }
    }

    public int PreOrder(TreeNode node, int L , int R)
    {
        if(node == null)
        {
            return 0;
        }

        if(node.val > R)
        {
            return 0 + PreOrder(node.left, L , R);
        }

        else if(node.val < L)
        {
            return 0 + PreOrder(node.right, L, R);
        }

        else
        {
            return node.val + PreOrder(node.left, L ,R) + PreOrder(node.right, L , R);
        }

    }
}