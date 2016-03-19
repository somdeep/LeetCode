//83. Remove Duplicates from Sorted List My Submissions Question
//Total Accepted: 107291 Total Submissions: 294409 Difficulty: Easy
//Given a sorted linked list, delete all duplicates such that each element appear only once.
//
//For example,
//Given 1->1->2, return 1->2.
//Given 1->1->2->3->3, return 1->2->3.



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
               
               
               if(head==null || head.next==null)
                return head;
                
                
               ListNode node = head.next;
               ListNode prev=head;
               while(node!=null)
               {
                   if(node.val == prev.val)
                    {   node=node.next;
                        continue;
                    }
                //   System.out.println(node.val);
                   prev.next=node;
                    prev=node;   
                   node=node.next;
               }
               
               prev.next=null;
               
               return head;
    }
}