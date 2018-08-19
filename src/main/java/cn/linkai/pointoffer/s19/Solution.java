package cn.linkai.pointoffer.s19;

public class Solution {

    public void Mirror(TreeNode root) {
        if(root==null) return;

        TreeNode temp=root.left;
        root.left=root.right;
        root.right=temp;

        Mirror(root.left);
        Mirror(root.right);
    }

    public static void main(String[] args) {
        TreeNode node1=new TreeNode(8);
        TreeNode node2=new TreeNode(6);
        TreeNode node3=new TreeNode(10);
        TreeNode node4=new TreeNode(5);
        TreeNode node5=new TreeNode(7);
        TreeNode node6=new TreeNode(9);
        TreeNode node7=new TreeNode(11);

        node1.left=node2; node1.right=node3;
        node2.left=node4; node2.right=node5;
        node3.left=node6; node3.right=node7;

        Solution solution=new Solution();
        solution.Mirror(node1);
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