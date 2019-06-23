// 876. Middle of the Linked List
// Easy

// 520

// 40

// Favorite

// Share
// Given a non-empty, singly linked list with head node head, return a middle node of linked list.

// If there are two middle nodes, return the second middle node.



// Example 1:

// Input: [1,2,3,4,5]
// Output: Node 3 from this list (Serialization: [3,4,5])
// The returned node has value 3.  (The judge's serialization of this node is [3,4,5]).
// Note that we returned a ListNode object ans, such that:
// ans.val = 3, ans.next.val = 4, ans.next.next.val = 5, and ans.next.next.next = NULL.
// Example 2:

// Input: [1,2,3,4,5,6]
// Output: Node 4 from this list (Serialization: [4,5,6])
// Since the list has two middle nodes with values 3 and 4, we return the second one.


// Note:

// The number of nodes in the given list will be between 1 and 100.

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     public int val;
 *     public ListNode next;
 *     public ListNode(int x) { val = x; }
 * }
 */
public class Solution
{
    public ListNode MiddleNode(ListNode head)
    {
        ListNode result;
        int i = 0;
        ListNode node = head;
        Dictionary<int, ListNode> nodes = new Dictionary<int, ListNode>();

        while (node != null)
        {
            nodes.Add(i, node);
            i++;
            node = node.next;
        }

        i--;
        int middle = Convert.ToInt32(Math.Ceiling((double)i/2));

        result = nodes[middle];

        return result;
    }
}