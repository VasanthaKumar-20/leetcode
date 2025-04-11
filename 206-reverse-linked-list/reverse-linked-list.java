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
    public ListNode reverseList(ListNode head) {
        ListNode temp=head;
        ListNode ans = null;
        while(temp!=null)
        {
            ListNode newNode = new ListNode(temp.val);
            newNode.next=ans;
            ans=newNode;
            temp=temp.next;
        }
        return ans;
    }
}