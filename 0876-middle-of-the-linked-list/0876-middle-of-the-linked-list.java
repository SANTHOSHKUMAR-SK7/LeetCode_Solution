/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode middleNode(ListNode head) {
        ListNode p1=head;
        ListNode p2=head;
        while(p1 != null && p1.next != null){
            p1=p1.next.next;
            p2=p2.next;
        }
        return p2;
    }
}