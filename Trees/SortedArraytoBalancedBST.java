// 108. Convert Sorted Array to Binary Search Tree My Submissions Question
// Total Accepted: 67273 Total Submissions: 185357 Difficulty: Medium
// Given an array where elements are sorted in ascending order, convert it to a height balanced BST.


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
	TreeNode head;

	public TreeNode sortedArrayToBST(int[] nums) {
		if(nums.length == 0)          return null;
		TreeNode root = new TreeNode(nums[nums.length/2]);
		root.left = sortedArrayToBST(Arrays.copyOfRange(nums, 0, nums.length/2));
		root.right = sortedArrayToBST(Arrays.copyOfRange(nums, nums.length/2 + 1, nums.length));
		return root;
	}
}