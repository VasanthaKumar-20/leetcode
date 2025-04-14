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
    public ListNode mergeNodes(ListNode head) {
        ListNode ans = new ListNode(0);
        ListNode cur=ans;
        int sum = 0 ;
        while(head!=null)
        {
            if(head.val!=0)
            {
                sum=sum+head.val;
            }
            else
            {
                ListNode newnode = new ListNode(sum);
                cur.next=newnode;
                cur=newnode;
                sum=0;
            }
            head=head.next;
        }
        return ans.next.next;
    }    
}