package cn.linkai.pointoffer.s39;

public class Solution {

    public int TreeDepth(TreeNode root) {
        if(root==null) return 0;

        if(root.left==null && root.right==null) return 1;

        int lDep=1+TreeDepth(root.left);
        int rDep=1+TreeDepth(root.right);

        return Math.max(lDep,rDep);
    }
}

class TreeNode {
    int val = 0;
    TreeNode left = null;
    TreeNode right = null;

    public TreeNode(int val) {
        this.val = val;

    }

}