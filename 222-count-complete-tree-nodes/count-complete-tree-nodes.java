/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    private int ans=0;
    public int countNodes(TreeNode root) {
        ans=0;
        func(root);
        return ans;
    }
    public int func(TreeNode node)
    {
        if(node==null)
        {
            return ans;
        }
        ans++;
        func(node.left);
        func(node.right);
        return ans;
    }
}