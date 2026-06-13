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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode fast= head;
        ListNode slow= head;
        int count=1;
         if(head.next==null) {
            return null;
         }
        while(fast.next!= null) {
            fast= fast.next;
            count++;
        }
        if(count==n) {
            return head.next;
        }
        
        int target_node= count-n+1;
        for(int i=1;i<target_node-1;i++) {
            slow= slow.next;
        }
        slow.next= slow.next.next;
        return head;
    }
}