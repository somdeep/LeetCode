/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {
    public ListNode reverseList(ListNode head) {
        
            if(head==null)
        return head;
        ListNode node=head;
        ListNode prev,current;
        prev=null;
        current=null;
        
    
        
        // if(node==head)
        // System.out.println("Equal");
        
        
        while(node.next!=null)
        {
            current=node;
            
            if(node.next!=null)
            node=node.next;
 
            if(!(prev==null))
            current.next=prev;
            
            prev=current;
        }
        
        head.next=null;
        node.next=prev;
        
        
        head = node;
        return head;
        
    }
}