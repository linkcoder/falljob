package cn.linkai.leetcode.c106;

public class Solution {

    public TreeNode buildTree(int[] inorder, int[] postorder) {

        if(postorder.length==0 || inorder.length==0) return null;

        TreeNode node=new TreeNode(postorder[postorder.length-1]);
        if(inorder.length==1) return node;

        int top=findTop(postorder[postorder.length-1],inorder);

        int[] l_po=new int[top];
        int[] l_in=new int[top];
        int[] r_po=new int[inorder.length-top-1];
        int[] r_in=new int[inorder.length-top-1];

        for(int i=0;i<top;i++){
            l_po[i]=postorder[i];
            l_in[i]=inorder[i];
        }
        node.left=buildTree(l_in,l_po);

        for(int i=0;i<inorder.length-top-1;i++){
            r_po[i]=postorder[i+top];
            r_in[i]=inorder[i+top+1];
        }

        node.right=buildTree(r_in,r_po);

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
        int[] po={4,5,3,2,1};
        int[] in={1,2,3,4,5};

        TreeNode t1=solution.buildTree(in,po);

    }
}

class TreeNode {
  int val;
  TreeNode left;
  TreeNode right;
  TreeNode(int x) { val = x; }
}