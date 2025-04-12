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
    public boolean isPalindrome(ListNode head) {
        ListNode temp = head;
        ListNode rev = null;
        int c=0;
        while(temp!=null)
        {
            ListNode newNode = new ListNode(temp.val);
            newNode.next=rev;
            rev=newNode;
            temp=temp.next;
            c++;
        }
        temp=head;
        ListNode cur = rev;
        int z=0;
        while(temp!=null && z<c/2)
        {
            if(temp.val!=cur.val)
            {
                return false;
            }
            temp=temp.next;
            cur=cur.next;
            z++;
        }
        return true;
    }
}