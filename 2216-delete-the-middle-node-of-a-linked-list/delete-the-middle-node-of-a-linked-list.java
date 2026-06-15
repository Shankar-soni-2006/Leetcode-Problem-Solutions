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
        ListNode temp = new ListNode(0,head);
        ListNode arr = temp;
        ListNode arr2 = head;
        while(arr2!=null && arr2.next!=null){
            arr = arr.next;
            arr2 = arr2.next.next;

        }
        arr.next = arr.next.next;
        return temp.next;
    }
}