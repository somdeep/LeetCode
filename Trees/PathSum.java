//112. Path Sum My Submissions Question
//Total Accepted: 95702 Total Submissions: 308037 Difficulty: Easy
//Given a binary tree and a sum, determine if the tree has a root-to-leaf path such that adding up all the values along the path equals the given sum.
//
//For example:
//Given the below binary tree and sum = 22,
//              5
//             / \
//            4   8
//           /   / \
//          11  13  4
//         /  \      \
//        7    2      1
//return true, as there exist a root-to-leaf path 5->4->11->2 which sum is 22.


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
    public boolean hasPathSum(TreeNode root, int sum) {
        return checksum(root,0,sum);
        
    }
    
    public boolean checksum(TreeNode node, int sum, int check)
    {
        if(node==null)
            return false;
        if(node.right==null && node.left==null)
        {
            if((node.val + sum) == check)
                return  true;
        }   
            return (checksum(node.left,node.val+sum,check) || checksum(node.right,node.val+sum,check) );
    }
    
    
}