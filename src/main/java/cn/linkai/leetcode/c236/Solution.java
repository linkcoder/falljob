package cn.linkai.leetcode.c236;

public class Solution {

    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if(root==null) return root;

        if(root.val==p.val || root.val==q.val) return root;

        //找左子树是否有存储p或q
        TreeNode l=lowestCommonAncestor(root.left,p,q);
        //找右子树是否有存储p或q
        TreeNode r=lowestCommonAncestor(root.right,p,q);

        if(l!=null && r!=null) return root;
        if(l==null) return r;
        else return l;
    }
}

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int x) { val = x; }
}