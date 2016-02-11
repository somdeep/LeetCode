// 61. Rotate List My Submissions Question
// Total Accepted: 60901 Total Submissions: 271183 Difficulty: Medium
// Given a list, rotate the list to the right by k places, where k is non-negative.
//
// For example:
// Given 1->2->3->4->5->NULL and k = 2,
// return 4->5->1->2->3->NULL.
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {
    public ListNode rotateRight(ListNode head, int k) {
    ListNode cur = head;
    int num = 0;
    int len = Integer.MAX_VALUE;
    while( cur != null ){
        if( cur.next == null ){
            num++;
            len = num;
            cur.next = head;
            cur = head;
            num = 0;
            k %= len;
        }if( num == len - k - 1 ){
            ListNode nextNode = cur.next;
            cur.next = null;
            return nextNode;
        }
        num++;
        cur = cur.next;
    }
    return head;
}


}
