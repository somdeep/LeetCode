// 445. Add Two Numbers II   QuestionEditorial Solution  My Submissions
// Total Accepted: 806
// Total Submissions: 1998
// Difficulty: Medium
// Contributors: Admin
// You are given two linked lists representing two non-negative numbers. The most significant digit comes first and each of their nodes contain a single digit. Add the two numbers and return it as a linked list.

// You may assume the two numbers do not contain any leading zero, except the number 0 itself.

// Follow up:
// What if you cannot modify the input lists? In other words, reversing the lists is not allowed.

// Example:

// Input: (7 -> 2 -> 4 -> 3) + (5 -> 6 -> 4)
// Output: 7 -> 8 -> 0 -> 7

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
 
import java.util.Stack;

public class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
         Stack<Integer> a = new Stack<Integer>();
         Stack<Integer> b = new Stack<Integer>();
         int i,j;
         int carry,val;
         carry = val = 0;
         ListNode node = l1;
         ListNode after = null;
         int len1,len2;
         len1 = len2 = 0;
         int aval,bval;
         aval = bval = 0;
         ListNode anode,bnode;
         anode = l1;
         bnode = l2;
         
         
         while(anode != null || bnode!= null)
         {
             if(anode != null)
             {
                 len1++;
                 a.push(anode.val);
                 anode = anode.next;
             }
        
             if(bnode != null)
             {
                 len2++;
                 b.push(bnode.val);
                 bnode = bnode.next;
             }
                 
        }
         
         if(len1 == 0 && len2 == 0)
            return null;
         if(len1 == 0)
            return l2;
         if(len2 == 0)
            return l1;
         
         //got stacks set up with values, easy access to reverse order
         
         while(!a.isEmpty() || !b.isEmpty())
         {
             if(a.isEmpty())
                aval = 0;
             else
                aval = a.pop();
            
            if(b.isEmpty())
                bval = 0;
             else
                bval = b.pop();
                
             val = aval + bval + carry;
             
             if(val >= 10)
             {
                 carry = val / 10;
                 val = val - 10;
             }
             else
                carry = 0;
             
             
             if(after == null)
             {
                 ListNode n = new ListNode(val);
                 //n.val = val;
                 n.next = null;
                 after = n;
             }
             else
             {
                 ListNode n = new ListNode(val);
                 //n.val = val;
                 n.next = after;
                 after = n;
             }
             
         }
         
         if(carry > 0)
         {
             ListNode n = new ListNode(carry);
             n.next  = after;
             after = n;
         }
         
         
         return after;
     
        
    }
}