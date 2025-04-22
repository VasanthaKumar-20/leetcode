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
        if(head.next==null)
        {
            return null;
        }
        head=reverse(head);
        if(n==1)
        {
            return reverse(head.next);
        }
        ListNode cur = head;
        int c = 2;
        while(cur!=null)
        {
            if(c==n)
            {
                cur.next=cur.next.next;
                break;
            }
            c++;
            cur=cur.next;
        }
        return reverse(head);
    }

    public static ListNode reverse(ListNode head)
    {
        ListNode prev = null;
        while(head!=null)
        {
            ListNode next=head.next;
            head.next=prev;
            prev=head;
            head=next;
        }
        return prev;
    }
}