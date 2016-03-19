//82. Remove Duplicates from Sorted List II My Submissions Question
//Total Accepted: 68080 Total Submissions: 255989 Difficulty: Medium
//Given a sorted linked list, delete all nodes that have duplicate numbers, leaving only distinct numbers from the original list.
//
//For example,
//Given 1->2->3->3->4->4->5, return 1->2->5.
//Given 1->1->1->2->3, return 2->3.

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        if(head==null || head.next== null)
            return head;
        
        ListNode node=head.next;
        ListNode prev=head;
        ListNode tail=null;
        ListNode first=null;
        int count = 1;
        while(node != null)
        {
            if(node.val==prev.val)
            {
                count++;
            }
            
            else
            {
                if(count > 1)
                {
                    prev=node;
                    node=node.next; 
                    count=1;
                    continue;
                }
                else
                {
                    if(first == null)
                    {   
                         first=prev; tail=prev;
                         prev=node;
                         count=1;
                    }
                    else
                    {
                        tail.next=prev;
                        tail=tail.next;
                        prev=node;
                        count=1;
                    }
                }
            }    
            node=node.next;
        }
        
        if(count==1)
        {
            if(first == null)
            {   
                first=prev;
                tail=prev;
                prev=node;
                count=1;
                         
            }
            else
            {
                tail.next=prev;
                tail=tail.next;
            }
        }
       
        if(first==null)
            return null;
        
        tail.next=null;
        
        return first;
    }
}