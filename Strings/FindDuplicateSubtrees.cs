// 652. Find Duplicate Subtrees
// Medium
// 5.2K
// 413
// company
// Google
// company
// Amazon
// company
// Bloomberg
// Given the root of a binary tree, return all duplicate subtrees.

// For each kind of duplicate subtrees, you only need to return the root node of any one of them.

// Two trees are duplicate if they have the same structure with the same node values.



// Example 1:


// Input: root = [1,2,3,4,null,2,4,null,null,4]
// Output: [[2,4],[4]]
// Example 2:


// Input: root = [2,1,1]
// Output: [[1]]
// Example 3:


// Input: root = [2,2,2,3,null,3,null]
// Output: [[2,3],[3]]


// Constraints:

// The number of the nodes in the tree will be in the range [1, 5000]
// -200 <= Node.val <= 200
// Accepted
// 229.4K
// Submissions
// 389K
// Acceptance Rate
// 59.0%

using System.Collections.Generic;

public class TreeNode
{
    public int val;
    public TreeNode left;
    public TreeNode right;
    public TreeNode(int val = 0, TreeNode left = null, TreeNode right = null)
    {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}
public class Solution
{
    public IList<TreeNode> FindDuplicateSubtrees(TreeNode root)
    {
        IList<TreeNode> res = new List<TreeNode>();
        traverse(root, new Dictionary<string, int>(), new Dictionary<int, int>(), res);
        return res;
    }

    public int traverse(TreeNode node, Dictionary<string, int> triples, Dictionary<int, int> cnt, IList<TreeNode> res)
    {
        if (node == null) return 0;

        string triplet = traverse(node.left, triples, cnt, res) + "," + node.val + traverse(node.right, triples, cnt, res);

        if (!triples.ContainsKey(triplet)) triples[triplet] = triples.Count + 1;

        int id = triples[triplet];
        if (!cnt.ContainsKey(id)) cnt[id] = 0;
        cnt[id]++;
        if (cnt[id] == 2) res.Add(node);

        return id;
    }
}