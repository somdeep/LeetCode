// Given a linked list, determine if it has a cycle in it.

// Follow up:
// Can you solve it without using extra space?

/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public boolean hasCycle(ListNode head) {
        
        
        if(head == null || head.next == null)
            return false;
            
        
            
            
        ListNode node = head;
        ListNode slow,fast;
        slow=fast=head;
        fast=head.next.next;
        
        while(fast != null)
        {
            if(fast==slow)
                return true;
                
            if(fast.next == null)
                return false;
            fast=fast.next.next;
            slow=slow.next;
        }
        
        return false;
    }
}