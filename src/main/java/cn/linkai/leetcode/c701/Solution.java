package cn.linkai.leetcode.c701;

public class Solution {
    public TreeNode insertIntoBST(TreeNode root, int val) {
        if(root.val>val && root.left==null){
            root.left=new TreeNode(val);
            return root;
        }
        if(root.val<val && root.right==null){
            root.right=new TreeNode(val);
            return root;
        }

        if(root.val>val) {
            insertIntoBST(root.left,val);
        }else{
            insertIntoBST(root.right,val);
        }

        return root;
    }

    public static void main(String[] args) {
        TreeNode t1 =new TreeNode(4);
        TreeNode t2=new TreeNode(2);
        TreeNode t3=new TreeNode(7);
//        TreeNode t4=new TreeNode(1);
//        TreeNode t5=new TreeNode(3);


    }
}

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int x) { val = x; }
}