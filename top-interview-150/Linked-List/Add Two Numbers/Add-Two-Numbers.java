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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int carry = 0;
        ListNode temp1 = l1;
        ListNode temp2 = l2;
        ListNode outHead = new ListNode();
        ListNode outCurrent = outHead;

        while(temp1 != null || temp2 != null){
            if(temp1 != null && temp2 != null){
                outCurrent.val = (temp1.val + temp2.val + carry) % 10;
                carry = (temp1.val + temp2.val + carry) > 9 ? 1 : 0;
                temp1 = (temp1.next != null) ? temp1.next : null;
                temp2 = (temp2.next != null) ? temp2.next : null;
            }
            else if(temp1 != null){
                outCurrent.val = (temp1.val + carry) % 10;
                carry = (temp1.val + carry) > 9 ? 1 : 0;
                temp1 = (temp1.next != null) ? temp1.next : null;
            }
            else{
                outCurrent.val = (temp2.val + carry) % 10;
                carry = (temp2.val + carry) > 9 ? 1 : 0;
                temp2 = (temp2.next != null) ? temp2.next : null;
            }
            if(temp1 != null || temp2 != null){
                outCurrent.next = new ListNode();
                outCurrent = outCurrent.next;
            }
        }
        if(carry > 0){
            outCurrent.next = new ListNode(1);
        }
        return outHead;
    }
}