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
    public ListNode oddEvenList(ListNode head) {

        if(head==null || head.next==null){
            return head;
        }

        ListNode ohead=head;
        ListNode otail=head;
        ListNode ehead=head.next;
        ListNode etail=head.next;
        while(etail!=null && etail.next!=null){
            otail.next=etail.next;
            otail=etail.next;

            etail.next=otail.next;
            etail=otail.next;
        }
        otail.next=ehead;
        return ohead;
    }
}