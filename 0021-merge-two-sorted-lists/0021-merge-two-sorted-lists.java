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
         public static ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        if (list1==null){
            return list2;
        }if (list2==null){
            return list1;
        }
        ListNode t1=list1;
        ListNode t2=list2;
        ListNode re=new ListNode();
        if (t1.val<t2.val){
            ListNode t=new ListNode(t1.val);
            re=t;
            t1=t1.next;
        } else if (t1.val>t2.val) {
            ListNode t=new ListNode(t2.val);
            re=t;
            t2=t2.next;
        }
        else {
            ListNode t=new ListNode(t1.val);
            re=t;
            t1=t1.next;
        }
        ListNode re1=re;
        while (t1!=null && t2!=null){
            if (t1.val<t2.val){
                ListNode t=new ListNode(t1.val);
                re1.next=t;
                t1=t1.next;
            } else if (t1.val>t2.val) {
                ListNode t=new ListNode(t2.val);
                re1.next=t;
                t2=t2.next;
            }
            else {
                ListNode t=new ListNode(t1.val);
                re1.next=t;
                t1=t1.next;
            }
            re1=re1.next;
        }
        while (t1!=null && t2==null){
            ListNode t=new ListNode(t1.val);
            re1.next=t;
            t1=t1.next;
            re1=re1.next;
        }
        while (t1==null && t2!=null){
            ListNode t=new ListNode(t2.val);
            re1.next=t;
            t2=t2.next;
            re1=re1.next;
        }
        return re;
    }

}