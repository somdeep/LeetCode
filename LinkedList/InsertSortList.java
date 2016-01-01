//147. Insertion Sort List My Submissions Question
//Total Accepted: 60691 Total Submissions: 216166 Difficulty: Medium
//Sort a linked list using insertion sort.
//
//Subscribe to see which companies asked this question

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {
    public ListNode insertionSortList(ListNode head) {
        
        if(head==null)
        return null;
        if(head.next==null)
        return head;
        
        ListNode newList=null;
        ListNode node=null;
        ListNode i=null;
        ListNode j= null;
        ListNode prev=null;
        i=head;
        // ListNode temp=null;
        ListNode current=null;
        int temp=0;
        int pass =0 ;
        
        newList=new ListNode(head.val);
        i=head.next;
        prev=newList;
        node=newList;
        //newList=newList.next;
        while(i!=null)
        {
         
            current = new ListNode(i.val);
            
            j=newList;
            while(j!=null)
            {
            
                if(current.val<=j.val && j==newList)
                {
                    current.next=j;
                    newList=current;
                    break;
                }
                else if(j.next==null && current.val >= j.val)
                {
                    j.next=current;
                    current.next=null;
                    break;
                }
                else if(current.val>=j.val && current.val<=j.next.val)
                {
                    current.next=j.next;
                    j.next=current;
                    break;
                }
                
                j=j.next;
            }

            i=i.next;
            
            
        }
        
        return newList;
        
        
        
    }
}