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
    public ListNode doubleIt(ListNode head) {
        head=reverse(head);
        int carry=0;
        ListNode cur=head;
        while(cur!=null)
        {
            int d = cur.val*2+carry;
            cur.val=d%10;
            carry=d/10;
            if(cur.next==null && carry>0)
            {
                cur.next=new ListNode(carry);
                break;
            }
            cur=cur.next;
        }
        return reverse(head);
    }


    public static ListNode reverse(ListNode head)
    {
        ListNode prev=null;
        while(head!=null)
        {
            ListNode next = head.next;
            head.next=prev;
            prev=head;
            head=next;
        }
        return prev;
    }
}