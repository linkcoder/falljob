package cn.linkai.leetcode.c235;

public class Solution {

    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if (root==null) return root;

        while(root!=null){
            if(root.val>p.val && root.val>q.val){
                root=root.left;
            }else if(root.val<p.val && root.val<q.val){
                root= root.right;
            }else return root;
        }
        return root;
    }
}

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int x) { val = x; }
}
