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
    public ListNode mergeInBetween(ListNode list1, int a, int b, ListNode list2) {
        ListNode cur1 = list1;
        ListNode cur2 = list2;
        int c=0;
        while(cur1!=null || cur1.next!=null)
        {
            if(c==b)
            {
                while(cur2.next!=null)
                {
                    cur2=cur2.next;
                }
                cur2.next=cur1.next;
                break;
            }
            c++;
            cur1=cur1.next;
        }
        cur1=list1;
        cur2=list2;
        c=1;
        while(c!=a)
        {
            cur1=cur1.next;
            c++;
        }
        cur1.next=list2;
        return list1;
    }
}