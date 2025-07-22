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
        int a = l1.val+l2.val;
        int z = a%10;
        ListNode ans = new ListNode(z);
        int c = a/10;
        ListNode temp1 = l1.next;
        ListNode temp2 = l2.next;
        ListNode curr = ans;
        while(temp1!=null || temp2!=null)
        {
            int d;
            if(temp1!=null && temp2!=null)
            {
                int b = temp1.val+temp2.val+c;
                d = b%10;
                c=b/10;
            }
            else if(temp1!=null && temp2==null)
            {
                int b = temp1.val+c;
                d = b%10;
                c=b/10;
            }
            else
            {
                int b = temp2.val+c;
                d = b%10;
                c=b/10;
            }
            if(temp1!=null)
            {
                temp1=temp1.next;
            }
            if(temp2!=null)
            {
                temp2=temp2.next;
            }
            ListNode newnode = new ListNode(d);
            curr.next=newnode;
            curr=curr.next;
        }
        if(c>0)
        {
            ListNode newnode = new ListNode(c);
            curr.next=newnode;
        }
        return ans;
    }
}