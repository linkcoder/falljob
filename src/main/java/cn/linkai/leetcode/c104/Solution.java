package cn.linkai.leetcode.c104;

public class Solution {

    public int maxDepth(TreeNode root) {
        if(root==null) return 0;

        if(root.left==null && root.right==null) return 1;
        int ld=0,rd=0;
        if(root.left!=null)  ld=1+maxDepth(root.left);
        if(root.right!=null) rd=1+ maxDepth(root.right);

        return Math.max(ld,rd);
    }

    public static void main(String[] args) {
        TreeNode n1=new TreeNode(3);
        TreeNode n2=new TreeNode(9);
        TreeNode n3=new TreeNode(20);
        TreeNode n4=new TreeNode(15);
        TreeNode n5=new TreeNode(7);

        n1.left=n2;
        n1.right=n3;
//        n3.left=n4;
//        n3.right=n5;

        Solution solution=new Solution();

        System.out.println(solution.maxDepth(n1));
    }
}


class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode(int x) { val = x; }
}