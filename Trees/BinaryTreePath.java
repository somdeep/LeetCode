// 257. Binary Tree Paths   QuestionEditorial Solution  My Submissions
// Total Accepted: 73555
// Total Submissions: 222075
// Difficulty: Easy
// Contributors: Admin
// Given a binary tree, return all root-to-leaf paths.

// For example, given the following binary tree:

//    1
//  /   \
// 2     3
//  \
//   5
// All root-to-leaf paths are:

// ["1->2->5", "1->3"]

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
    public List<String> binaryTreePaths(TreeNode root) {
	   	List<String> answer = new ArrayList<String>();
        if(root == null)
    	    return answer;
    	helper(root,"",answer);
    	return answer;
    }


    public void  helper(TreeNode root, String path, List<String> ans)
    {
        if(root.left == null && root.right == null)
            ans.add(path+root.val);
        if(root.left != null)
        {
        	helper(root.left,path+root.val+"->",ans);
        }
        if(root.right != null)
        {
        	helper(root.right,path+root.val+"->",ans);
        }
    }
}
