//9. Remove Nth Node From End of List My Submissions Question
//Total Accepted: 86802 Total Submissions: 309352 Difficulty: Easy
//Given a linked list, remove the nth node from the end of list and return its head.
//
//For example,
//
//   Given linked list: 1->2->3->4->5, and n = 2.
//
//   After removing the second node from the end, the linked list becomes 1->2->3->5.
//Note:
//Given n will always be valid.
//Try to do this in one pass.

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
         if(head==null)
        return head;
        ListNode node=head;
        ListNode prev,current;
        prev=null;
        current=null;
        
        
        int i,j;
        i=0;
        int count=0;
        
        while(node!=null)
        {
            count++;
               
                node=node.next;
                // count++;
                    
                
        }
        
        
       // System.out.println(count);
        
        if(n==count)
        return head.next;
        
        prev=null;
        current=null;
        node=head;
        
        while(i<count)
        {
            // System.out.println("In loop  = " + i);
            current=node;
            
            if(i==0 && count-i == n)
            {
                head=head.next;
                return head;
            }
            else if(count-i == n)
            {
                prev.next=current.next;
            
                return head;
            }
            else
            {
                //if(node.next!=null)
                node=node.next;
                prev=current;
                i++;
            }
            
        }
        
        
        
        
        return head;
    }
}
