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
    public int[] nextLargerNodes(ListNode head) {
        ArrayList<Integer> list = new ArrayList<>();
        ListNode cur1 = head;
        ListNode cur2;
        while(cur1!=null)
        {
            cur2=cur1.next;
            int ans = 0;
            while(cur2!=null)
            {
                if(cur1.val<cur2.val)
                {
                    ans=cur2.val;
                    break;
                }
                cur2=cur2.next;
            }
            list.add(ans);
            cur1=cur1.next;
        }
        int[] array = list.stream().mapToInt(i -> i).toArray();
        return array;
    }
}