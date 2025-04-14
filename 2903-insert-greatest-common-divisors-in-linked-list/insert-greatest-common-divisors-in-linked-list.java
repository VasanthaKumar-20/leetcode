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
    public ListNode insertGreatestCommonDivisors(ListNode head) {
        ListNode prev=head;
        ListNode nxt=head.next;
        while(nxt!=null)
        {
            int gcd = func(prev.val,nxt.val);
            ListNode cur = new ListNode(gcd);
            prev.next=cur;
            cur.next=nxt;
            prev=nxt;
            nxt=nxt.next;
        }
        return head;
    }
    static int func(int a,int b)
    {
        if(a<b)
        {
            b=a+b;
            a=b-a;
            b=b-a;
        }
        if(b==0)
        {
            return a;
        }
        return func(b,a%b);
    }
}