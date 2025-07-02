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
    private int sum=0;
    public boolean checkTree(TreeNode root) {
        func(root);
        return (root.val==sum-root.val);
    }
    public void func(TreeNode node)
    {
        if(node==null)
        {
            return;
        }
        sum+=node.val;
        func(node.left);
        func(node.right);
    }
}