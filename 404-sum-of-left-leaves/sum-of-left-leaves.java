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
    public int sumOfLeftLeaves(TreeNode root) {
        func(root);
        return ans;
    }
    public void func(TreeNode node)
    {
        if(node==null)
        {
            return;
        }
        if(node.left!=null && node.left.left==null && node.left.right==null)
        {
            ans=ans+node.left.val;
        }
        func(node.left);
        func(node.right);
    }
}