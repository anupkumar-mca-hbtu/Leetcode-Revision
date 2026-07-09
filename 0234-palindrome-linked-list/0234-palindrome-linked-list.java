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
    public boolean isPalindrome(ListNode head) {
        if(head == null || head.next == null)
            return true;

        ListNode middle = middleOfLinkedList(head);

        ListNode secondHalf = reverseLinkedList(middle.next);

        ListNode firstHalf = head;

        while(secondHalf != null){

            if(firstHalf.val != secondHalf.val)
                return false;

            firstHalf = firstHalf.next;
            secondHalf = secondHalf.next;
        }

        return true;
    }

    public ListNode reverseLinkedList(ListNode head){

        ListNode prev = null;
        ListNode curr = head;

        while(curr != null){

            ListNode next = curr.next;

            curr.next = prev;

            prev = curr;

            curr = next;
        }

        return prev;
    }

    public ListNode middleOfLinkedList(ListNode head){

        ListNode slow = head;
        ListNode fast = head;

        while(fast.next != null && fast.next.next != null){

            slow = slow.next;
            fast = fast.next.next;
        }

        return slow;
    }
}