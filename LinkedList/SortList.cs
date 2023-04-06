// 148. Sort List
// Medium
// 9.5K
// 288
// company
// Amazon
// company
// TikTok
// company
// Apple
// Given the head of a linked list, return the list after sorting it in ascending order.



// Example 1:


// Input: head = [4,2,1,3]
// Output: [1,2,3,4]
// Example 2:


// Input: head = [-1,5,3,4,0]
// Output: [-1,0,3,4,5]
// Example 3:

// Input: head = []
// Output: []


// Constraints:

// The number of nodes in the list is in the range [0, 5 * 104].
// -105 <= Node.val <= 105


// Follow up: Can you sort the linked list in O(n logn) time and O(1) memory (i.e. constant space)?

// Accepted
// 618.3K
// Submissions
// 1.1M
// Acceptance Rate
// 55.1%

using System.Collections.Generic;

public class ListNode
{
    public int val;
    public ListNode next;
    public ListNode(int val = 0, ListNode next = null)
    {
        this.val = val;
        this.next = next;
    }
}
public class Solution
{
    public ListNode SortList(ListNode head)
    {
        ListNode dummy = new ListNode(0);
        ListNode result = dummy;
        if (head == null) return null;

        PriorityQueue<ListNode, int> pq = new PriorityQueue<ListNode, int>();
        while (head != null)
        {
            pq.Enqueue(head, head.val);
            head = head.next;
        }
        while (pq.Count > 0)
        {
            ListNode node = new ListNode(pq.Dequeue().val);
            result.next = node;
            result = result.next;
        }

        return dummy.next;
    }
}