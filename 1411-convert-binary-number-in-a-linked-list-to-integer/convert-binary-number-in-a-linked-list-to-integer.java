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
        ListNode rev = null;
        ListNode temp=head;
        while(temp!=null)
        {
            ListNode newNode = new ListNode(temp.val);
            newNode.next=rev;
            rev=newNode;
            temp=temp.next;
        }
        ListNode cur = rev;
        int i=1;
        int ans=0;
        while(cur!=null)
        {
            if(cur.val==1)
            {
                ans+=i;
            }
            i=i*2;
            cur=cur.next;
        }
        return ans;
    }
}