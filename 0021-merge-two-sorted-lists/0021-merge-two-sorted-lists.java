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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode tmp1= list1;
        ListNode tmp2= list2;
        ListNode fnltemp= new ListNode(0);
        ListNode temp= fnltemp;
        while(tmp1!=null && tmp2!=null) {

            if(tmp1.val<=tmp2.val) {
                temp.next= tmp1;
                tmp1=tmp1.next;
                temp=temp.next;
            } else {
                temp.next= tmp2;
                tmp2=tmp2.next;
                temp=temp.next;
            }
        }
        if(tmp1!=null) {
            temp.next=tmp1;
        } else {
            temp.next=tmp2;
        }
        return fnltemp.next;
    }
}