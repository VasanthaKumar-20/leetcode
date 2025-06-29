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
    public int getDecimalValue(ListNode head) {
        if(head.next==null)
        {
            return (head.val==1)?1:0;
        }
        ListNode prev=null;
        ListNode cur=head;
        while(cur!=null)
        {
            ListNode next=cur.next;
            cur.next=prev;
            prev=cur;
            cur=next;
        }
        int ans=0,b=1;
        while(prev!=null)
        {
            if(prev.val==1)
            {
                ans+=b;
            }
            b*=2;
            prev=prev.next;
        }
        return ans;
    }
}