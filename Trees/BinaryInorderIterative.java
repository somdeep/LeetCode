// 94. Binary Tree Inorder Traversal My Submissions Question
// Total Accepted: 109085 Total Submissions: 282399 Difficulty: Medium
// Given a binary tree, return the inorder traversal of its nodes' values.

// For example:
// Given binary tree {1,#,2,3},
//    1
//     \
//      2
//     /
//    3
// return [1,3,2].

// Note: Recursive solution is trivial, could you do it iteratively?


/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */import java.util.*;
public class Solution {
    public List<Integer> inorderTraversal(TreeNode root) {
    List<Integer> res = new LinkedList<Integer>();
    if (root == null) return res;

    Stack<TreeNode> stack = new Stack<TreeNode>();
    TreeNode cur = root;
    while (cur != null || !stack.isEmpty()) { 
        while (cur != null) {// Travel to the left leaf
            stack.push(cur);
            cur = cur.left;             
        }        
        cur = stack.pop(); // Backtracking to higher level node A
        res.add(cur.val);  // Add the node to the result list
        cur = cur.right;   // Switch to A'right branch
    }
    return res;
}
}





//recursive inorder
//public class Solution {
//    List<Integer> res = new LinkedList<Integer>();
//    public List<Integer> inorderTraversal(TreeNode root) {
//    
//    if (root == null) return res;
//    
//    if(root.left != null)
//        res=inorderTraversal(root.left);
//    
//    res.add(root.val);
//    
//    if(root.right!= null)
//        res=inorderTraversal(root.right);
//        
//    return res;
//}
//}