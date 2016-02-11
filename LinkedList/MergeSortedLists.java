// 21. Merge Two Sorted Lists My Submissions Question
// Total Accepted: 107553 Total Submissions: 311390 Difficulty: Easy
// Merge two sorted linked lists and return it as a new list. The new list should be made by splicing together the nodes of the first two lists.
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode head=null;
        ListNode l=head;

        if(l1==null && l2==null)
            return null;
        if(l1==null)
            return l2;
        if(l2==null)
            return l1;


        while(l1!=null || l2 != null)
        {
            if(l1==null && l2==null)
            break;

            else if(l1==null)
            {
                if(head==null)
                {head=l2;l=head;}
                else
                {
                head.next=l2;
                head=head.next;
                }
                //if()
                l2=l2.next;


            }
            else if(l2==null)
            {
                if(head==null)
                {head=l1;l=head;}
                else
                {
                    head.next=l1;
                    head=head.next;
                }
                l1=l1.next;
            }

            else if(l1.val<=l2.val)
            {
                 if(head==null)
                {head=l1;l=head;}
                else
                {
                    head.next=l1;
                    head=head.next;
                }
                l1=l1.next;

            }

            else
            {
                if(head==null)
                {head=l2;l=head;}
                else
                {
                head.next=l2;
                head=head.next;
                }
                //if()
                l2=l2.next;
            }
        }

        return l;
    }
}
