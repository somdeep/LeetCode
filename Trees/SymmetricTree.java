// 101. Symmetric Tree My Submissions Question
// Total Accepted: 93627 Total Submissions: 281610 Difficulty: Easy
// Given a binary tree, check whether it is a mirror of itself (ie, symmetric around its center).
//
// For example, this binary tree is symmetric:
//
//     1
//    / \
//   2   2
//  / \ / \
// 3  4 4  3
// But the following is not:
//     1
//    / \
//   2   2
//    \   \
//    3    3
// Note:
// Bonus points if you could solve it both recursively and iteratively.

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
   public boolean isSymmetric(TreeNode root) {

       // flip tree around root node
       TreeNode rTree = flipTree(root);

       // compare if those two trees are identical
       return compareTree(root, rTree);

    }

    private TreeNode flipTree(TreeNode root) {

        if (root == null)
            return null;

        TreeNode rTree = new TreeNode(root.val);
        rTree.left = flipTree(root.right);
        rTree.right = flipTree(root.left);

        return rTree;
    }

    private boolean compareTree(TreeNode tr1, TreeNode tr2) {
        if (tr1 == null && tr2 == null)
            return true;
        else if ((tr1 != null && tr2 != null) && (tr1.val == tr2.val))
            return compareTree(tr1.left, tr2.left) && compareTree(tr1.right, tr2.right);
        else
            return false;
    }
}
