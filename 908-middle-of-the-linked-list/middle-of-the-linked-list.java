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
    public ListNode middleNode(ListNode head) {
        ListNode temp = head;
        int c=1;
        while(temp.next!=null)
        {
            c++;
            temp=temp.next;
        }
        temp = head;
            int i=0;
            while(i!=c/2)
            {
                i++;
                head=head.next;
            }
        return head;
    }
}