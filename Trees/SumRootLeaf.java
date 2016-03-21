//129. Sum Root to Leaf Numbers My Submissions Question
//Total Accepted: 72005 Total Submissions: 222886 Difficulty: Medium
//Given a binary tree containing digits from 0-9 only, each root-to-leaf path could represent a number.
//
//An example is the root-to-leaf path 1->2->3 which represents the number 123.
//
//Find the total sum of all root-to-leaf numbers.
//
//For example,
//
//    1
//   / \
//  2   3
//The root-to-leaf path 1->2 represents the number 12.
//The root-to-leaf path 1->3 represents the number 13.
//
//Return the sum = 12 + 13 = 25.


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
    
    int result=0;
    
    public int sumNumbers(TreeNode root) {
     
     if(root == null)
        return 0;
        
     findsum(root,0);
     return result;
        
    }
    
    public void findsum(TreeNode node, int sum)
    {
       
        
        if(node.left==null && node.right==null)
        { 
            sum=(sum*10) + node.val;
            result+=sum;
            return;
        }   
        
        
        
        
        sum=(sum*10) + node.val;
        
        if(node.left != null)
        findsum(node.left,sum);
        
        if(node.right != null)
        findsum(node.right,sum);
        
    }
}