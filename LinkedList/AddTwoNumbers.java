// 2. Add Two Numbers   QuestionEditorial Solution  My Submissions
// Total Accepted: 202756
// Total Submissions: 793016
// Difficulty: Medium
// Contributors: Admin
// You are given two linked lists representing two non-negative numbers. The digits are stored in reverse order and each of their nodes contain a single digit. Add the two numbers and return it as a linked list.

// Input: (2 -> 4 -> 3) + (5 -> 6 -> 4)
// Output: 7 -> 0 -> 8

// Subscribe to see which companies asked this question

// Hide Tags Linked List Math
// Show Similar Problems


/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode head = null;
        ListNode node=null;
        ListNode newNode=null;int sum=0;
       int diff=0;
        int carry=0;
       sum=l1.val+l2.val;
       if(sum>=10)
       {
           diff=sum-10;
           carry=1;
           sum=diff;
           
       }
        head= new ListNode(sum);
       // System.out.println(l1.val);
        l1=l1.next;
        l2=l2.next;
       node=head;
              
        while(l1!=null || l2!=null)
        {
           
            if(l1==null)
            {
                 //System.out.println(carry);
                sum=l2.val+carry;  
                if(sum>=10)
                {
                        diff=sum-10;
                        carry=1;
                        sum=diff;
                }
                else
                carry=0;
                
            newNode=new ListNode(sum);
            l2=l2.next;
                
            }
            else if(l2==null)
            {
                sum=l1.val+carry;  
                if(sum>=10)
                {
                        diff=sum-10;
                        carry=1;
                        sum=diff;
                }
                else
                carry=0;
                
            newNode=new ListNode(sum);
            l1=l1.next;
                
            }
            else
            {
            sum=l1.val + l2.val+carry;  
                if(sum>=10)
                {
                        diff=sum-10;
                        carry=1;
                        sum=diff;
                }
                else
                    carry=0;
                
            newNode=new ListNode(sum);
            
            
             l1=l1.next;
        l2=l2.next;
                
            }
            node.next=newNode;
            node=newNode;
        }
        if(carry==1)
        {
            newNode = new ListNode(1);
            node.next=newNode;
            node=node.next;
        }
        
        node.next=null;
        return head;
    }
}