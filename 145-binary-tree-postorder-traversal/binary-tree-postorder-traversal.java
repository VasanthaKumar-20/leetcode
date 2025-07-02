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
    private ArrayList<Integer> list = new ArrayList<>();
    public List<Integer> postorderTraversal(TreeNode root) {
        func(root);
        return list;
    }
    public void func(TreeNode node)
    {
        if(node==null)
        {
            return;
        }
        func(node.left);
        func(node.right);
        list.add(node.val);
    }
}