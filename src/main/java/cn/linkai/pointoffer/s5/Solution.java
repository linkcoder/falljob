package cn.linkai.pointoffer.s5;

import java.util.Arrays;

public class Solution {

    public TreeNode reConstructBinaryTree(int [] pre,int [] in) {
        if(pre==null || in==null ||pre.length==0 || in.length==0) return null;

        int nodeVal=pre[0];
        TreeNode node=new TreeNode(nodeVal);
        if(pre.length==1) return node;
        int splitIndex=findIndex(in,nodeVal);

        int[] l_pr=new int[splitIndex];
        int[] l_in=new int[splitIndex];
        int[] r_pr=new int[in.length-splitIndex-1];
        int[] r_in=new int[in.length-splitIndex-1];

        for(int i=0;i<splitIndex;i++){
            l_pr[i]=pre[i+1];
            l_in[i]=in[i];
        }

        node.left=reConstructBinaryTree(l_pr,l_in);

        for(int i=0;i<in.length-splitIndex-1;i++){
            r_pr[i]=pre[i+splitIndex+1];
            r_in[i]=in[i+splitIndex+1];
        }

        node.right=reConstructBinaryTree(r_pr,r_in);
        return node;
    }

    private int findIndex(int[] in, int nodeVal) {
        int i;
        for(i=0;i<in.length;i++){
            if(in[i]==nodeVal) break;
        }
        return i;
    }

}

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int x) { val = x; }
}