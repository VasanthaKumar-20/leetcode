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
    private boolean istrue=true;
    public boolean isSameTree(TreeNode p, TreeNode q) {
        func(p,q);
        return istrue;       
    }
    public void func(TreeNode p,TreeNode q)
    {
        if((p==null&&q!=null) ||(p!=null&&q==null))
        {
            istrue=false;
            return;
        }
        if(p==null && q==null)
        {
            return;
        }
        if(p.val!=q.val)
        {
            istrue=false;
        }
        func(p.left,q.left);
        func(p.right,q.right);
    }
}