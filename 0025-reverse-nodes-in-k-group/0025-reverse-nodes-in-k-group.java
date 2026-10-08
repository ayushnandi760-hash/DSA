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
    public ListNode reverseKGroup(ListNode head, int k) {

        

        int size=0;
        ListNode temp=head;

        while(temp!=null){
            size++;
            temp=temp.next;

        }

        if(size<k){
            return head;
        }

        temp=head;
        ListNode prev=null;
        for(int i=1;i<=k;i++){
            ListNode forward=temp.next;
            temp.next=prev;
            prev=temp;
            temp=forward;

        }

       ListNode recursionhead=reverseKGroup(temp,k);
        head.next=recursionhead;
        return prev;
        
    }
}