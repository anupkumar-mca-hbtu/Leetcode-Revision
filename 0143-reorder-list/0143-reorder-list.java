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
    public ListNode findMiddle(ListNode l1) {
        ListNode slow, fast;
        slow=fast=l1;
        while(fast!=null && fast.next!=null) {
            slow=slow.next;
            fast=fast.next.next;
        }
        return slow;
    }
    public void reorderList(ListNode head) {
        ListNode mid= findMiddle(head);
        ListNode rev= reverseLinkedList(mid);
        mid.next=null;
        ListNode temp= head;
        
        while(rev!=null) {
         ListNode temp1= temp.next;
         ListNode temp2= rev.next;
         temp.next= rev;
         rev.next= temp1;
         temp=temp1;
         rev=temp2;
            
        }
        
    }

    public ListNode reverseLinkedList(ListNode head) {
        ListNode prev,curr,nextNode;
        prev=null;
        nextNode=curr=head.next;
        while(curr!=null) {
            nextNode=nextNode.next;
            curr.next= prev;
            prev=curr;
            curr=nextNode;
        }
        return prev;
    }
}