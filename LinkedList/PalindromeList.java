//234. Palindrome Linked List My Submissions Question
//Total Accepted: 37467 Total Submissions: 139805 Difficulty: Easy
//Given a singly linked list, determine if it is a palindrome.
//
//Follow up:
//Could you do it in O(n) time and O(1) space?


    /**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {
    public boolean isPalindrome(ListNode head) {
        ListNode node=head;
        int flag=0;
        if(node==null) 
            return true;
        Stack<Integer> st = new Stack<Integer>();
        int temp=Integer.MAX_VALUE;
        while(node!=null)
        {
            st.push(node.val);
            node=node.next;
        }
        
        node=head;
        
        while(node!=null)
        {
            if(!st.empty())
                temp=st.pop();
            if(temp!=node.val)
            {    
                flag=1;
                break;
            }
            
        
            node=node.next;
            
        }
        
        
        if(flag==1)
            return false;
        
        return true;
    }
}