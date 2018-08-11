package cn.linkai.leetcode.c105;

public class Solution {

    public TreeNode buildTree(int[] preorder, int[] inorder) {

        if(preorder.length==0 || inorder.length==0) return null;

        TreeNode node=new TreeNode(preorder[0]);
        if(preorder.length==1) return node;

        int top=findTop(preorder[0],inorder);

        int[] l_pr=new int[top];
        int[] l_in=new int[top];
        int[] r_pr=new int[inorder.length-top-1];
        int[] r_in=new int[inorder.length-top-1];

        for(int i=0;i<top;i++){
            l_pr[i]=preorder[i+1];
            l_in[i]=inorder[i];
        }
        node.left=buildTree(l_pr,l_in);

        for(int i=0;i<preorder.length-top-1;i++){
            r_pr[i]=preorder[i+top+1];
            r_in[i]=inorder[i+top+1];
        }

        node.right=buildTree(r_pr,r_in);

        return node;
    }

    private int findTop(int node, int[] inorder) {

        int index=0;
        while(index<inorder.length){
            if(inorder[index]==node) break;
             index++;
        }
        return index;
    }

    public static void main(String[] args) {
        Solution solution=new Solution();
        int[] pr={3,9,20,15,7};
        int[] in={9,3,15,20,7};

        TreeNode t1=solution.buildTree(pr,in);

    }
}

class TreeNode {
  int val;
  TreeNode left;
  TreeNode right;
  TreeNode(int x) { val = x; }
}