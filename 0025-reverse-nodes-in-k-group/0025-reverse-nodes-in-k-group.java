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
    public static ListNode reverseKGroup(ListNode head, int k) {
         int h=1;
        int t=1;
        int len=lenOfTheLinkList(head);
        if (k>len){
            return head;
        }
        while (t<=len){
            while (t-h!=k-1){
                t++;
            }
            if (t-h==k-1 && t<=len) {
                head=reverseBetween(head, h, t);
                h=t+1;
            }
        }
        return head;
    }
    private static int lenOfTheLinkList(ListNode head) {
        if (head==null){
            return 0;
        }
        ListNode t=head;
        int len=0;
        while (t!=null){
            t=t.next;
            len++;
        }
        return len;
    }
        public static ListNode reverseBetween(ListNode head, int left, int right) {
        if (head == null || left == right) return head;

        ListNode present=head;
        ListNode prev=null;
        for (int i = 0; present!=null &&i <left-1; i++) {
            prev=present;
            present=present.next;
        }

        ListNode next=(present!=null)?present.next:null;
        ListNode last=prev;
        ListNode tail=present;
        for (int i = 0; present!=null &&  i <(right-left)+1; i++) {
            present.next=prev;
            prev=present;
            present=next;
            if (next!=null){
                next=next.next;
            }
        }
        if (last!=null){
            last.next=prev;
        }
        else {
            head=prev;
        }
        tail.next=present;
        return head;
    }
}