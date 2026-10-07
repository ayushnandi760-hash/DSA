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
    public ListNode partition(ListNode head, int x) {

        ListNode dummy1=new ListNode(-1);
        ListNode head1=dummy1;
        ListNode tail1=dummy1;
        ListNode dummy2=new ListNode(-1);
        ListNode head2=dummy2;
        ListNode tail2=dummy2;
        ListNode temp=head;

        while(temp!=null){
            if(temp.val<x){
                tail1.next=temp;
                tail1=tail1.next;
            }
            else{
                tail2.next=temp;
                tail2=tail2.next;
            }
            temp=temp.next;
        }
        tail2.next=null;
        tail1.next=head2.next;

        return head1.next;





    }
}