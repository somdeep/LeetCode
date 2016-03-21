//230. Kth Smallest Element in a BST My Submissions Question
//Total Accepted: 40519 Total Submissions: 110153 Difficulty: Medium
//Given a binary search tree, write a function kthSmallest to find the kth smallest element in it.
//
//Note: 
//You may assume k is always valid, 1 ≤ k ≤ BST's total elements.
//
//Follow up:
//What if the BST is modified (insert/delete operations) often and you need to find the kth smallest frequently? How would you optimize the kthSmallest routine?


public class Solution {
    boolean notFound = true;
    int answer = 0;
    int _k;
    public int kthSmallest(TreeNode root, int k) {
        _k = k;
        kthSmallestRecurse(root);
        return answer;
    }

    private void kthSmallestRecurse(TreeNode node){
        if(node==null)
            return;
        if(notFound)kthSmallestRecurse(node.left);
        
        if(--_k == 0)
        {
            answer=node.val;
            notFound=false;
            return;
        }
        
        if(notFound)kthSmallestRecurse(node.right);
        
        
        
    }
}