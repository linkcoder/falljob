package cn.linkai.leetcode.c700;

public class Solution {
    public TreeNode searchBST(TreeNode root, int val) {
        TreeNode re=null;
        if(root==null) return null;

        if(root.val==val) return root;

        if(root.val<val) re=searchBST(root.right,val);
        else if (root.val>val) re=searchBST(root.left,val);

        return re;
    }

    public static void main(String[] args) {
        TreeNode t1 =new TreeNode(4);
        TreeNode t2=new TreeNode(2);
        TreeNode t3=new TreeNode(7);
        TreeNode t4=new TreeNode(1);
        TreeNode t5=new TreeNode(3);

        t1.left=t2; t1.right=t3;
        t2.left=t4; t2.right=t5;

        Solution solution=new Solution();
        TreeNode re=solution.searchBST(t1,2);
        System.out.println(re.val);

    }
}

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int x) { val = x; }
}