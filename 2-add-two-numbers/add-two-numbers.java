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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode cur1 = l1;
        ListNode cur2 = l2;
        int c1,c2;
        ListNode ans=null;
        int carry=0;
        while(cur1!=null || cur2!=null)
        {
            if(cur1==null)
            {
                c1=0;
            }
            else
            {
                c1=cur1.val;
                cur1=cur1.next;
            }
            if(cur2==null)
            {
                c2=0;
            }
            else
            {
                c2=cur2.val;
                cur2=cur2.next;
            }
            int d = c1+c2+carry;
            ListNode newnode = new ListNode(d%10);
            carry=d/10;
            newnode.next=ans;
            ans=newnode;
        }
        if(carry>0)
        {
            ListNode newnode = new ListNode(carry);
            newnode.next=ans;
            ans=newnode;
        }
        return reverse(ans);
    }

    public static ListNode reverse(ListNode head)
    {
        ListNode prev = null;
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