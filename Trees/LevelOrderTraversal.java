// 102. Binary Tree Level Order Traversal My Submissions Question
// Total Accepted: 88907 Total Submissions: 280928 Difficulty: Easy
// Given a binary tree, return the level order traversal of its nodes' values. (ie, from left to right, level by level).
//
// For example:
// Given binary tree {3,9,20,#,#,15,7},
//     3
//    / \
//   9  20
//     /  \
//    15   7
// return its level order traversal as:
// [
//   [3],
//   [9,20],
//   [15,7]
// ]

/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;a
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class Solution {

    private List<List<Integer>> result= new ArrayList<List<Integer>>();
    public List<List<Integer>> levelOrder(TreeNode root) {
        getAllResults(root,1);
        return result;
    }

   public void getAllResults(TreeNode node,int level){
       if(node!=null)
       {
            if(result.size()<level)
            {
                result.add(new ArrayList<Integer>());

            }

            result.get(level-1).add(node.val);

            if(node.left!=null)
                getAllResults(node.left,level+1);

            if(node.right!=null)
                getAllResults(node.right,level+1);




       }

   }
}
