/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        
        ListNode tempA=headA;
        int sizeA=0;
        int sizeB=0;
        ListNode tempB=headB;
        while(tempA!=null){
            sizeA++;
            tempA=tempA.next;
        }
        while(tempB!=null){
            sizeB++;
            tempB=tempB.next;
        }
        int cmp=Math.abs(sizeA-sizeB);
        tempA=headA;
        tempB=headB;
        if(sizeA>sizeB){
            while(cmp!=0){
                tempA=tempA.next;
                cmp--;

            }
        }
        else{
            while(cmp!=0){
                tempB=tempB.next;
                cmp--;
            }
        }

        while(tempA!=null && tempB!=null){
            if(tempA==tempB){
                return tempA;
            }
            tempA=tempA.next;
            tempB=tempB.next;
        }
    return null;
    }
}