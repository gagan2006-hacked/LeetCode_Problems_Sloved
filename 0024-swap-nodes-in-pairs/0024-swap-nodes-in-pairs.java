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
   public static ListNode swapPairs(ListNode head) {
        if (head==null||head.next==null){
            return head;
        }
        ListNode first=head;
        ListNode sec=head.next;
        while (sec!=null){
         int f=first.val;
         int s= sec.val;
         first.val=s;
         sec.val=f;
         if (sec.next!=null&&first.next!=null){
             sec=sec.next.next;
             first=first.next.next;
         }else {
             break;
         }
        }
        return head;
    }
}