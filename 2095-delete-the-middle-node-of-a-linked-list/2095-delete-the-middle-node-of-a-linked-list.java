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
    public ListNode deleteMiddle(ListNode head) {
        if (head == null || head.next == null) {
            return null;
        }
        ListNode tem=head;
        int size=0;
        while(tem!=null){
            tem=tem.next;
            size++;
        }
        delpos(size/2,head);
        return head;
    }

    public void delpos(int pos,ListNode head){

        
            ListNode temp=head;
            for(int i=0;i<pos-1;i++){
                temp=temp.next;

            }
            temp.next=temp.next.next;
            

        

    }
}