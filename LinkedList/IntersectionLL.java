// 160. Intersection of Two Linked Lists My Submissions Question
// Total Accepted: 62077 Total Submissions: 206860 Difficulty: Easy
// Write a program to find the node at which the intersection of two singly linked lists begins.


// For example, the following two linked lists:

// A:          a1 → a2
//                    ↘
//                      c1 → c2 → c3
//                    ↗            
// B:     b1 → b2 → b3
// begin to intersect at node c1.


// Notes:

// If the two linked lists have no intersection at all, return null.
// The linked lists must retain their original structure after the function returns.
// You may assume there are no cycles anywhere in the entire linked structure.
// Your code should preferably run in O(n) time and use only O(1) memory.

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
	public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
		
		if(headA==null || headB=null)
			return null;
		
		ListNode a=heada;
		ListNode b = headb;
		
		
		while(a!=b)
		{
			a=(a==null)?headB:a.next;
			b=(b==null)?headA:b.next;
		}
		return a;
	}
}