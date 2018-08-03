package cn.linkai.leetcode.c144;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class Solution {

    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> result=new ArrayList<>();
        Stack<TreeNode> treeNodeStack=new Stack<>();

        if(root==null) return result;

        while(true){
            result.add(root.val);
            if(root.right!=null)
                treeNodeStack.push(root.right);
            if(root.left!=null)
                treeNodeStack.push(root.left);
            if(!treeNodeStack.isEmpty()){
                root=treeNodeStack.pop();
            }else{
                return result;
            }
        }
    }

    public static void main(String[] args) {
        TreeNode t1 =new TreeNode(1);
        TreeNode t2=new TreeNode(2);
        TreeNode t3=new TreeNode(3);

        t1.left=t3;
        t1.right=t2;

        Solution solution=new Solution();
        List<Integer> re = solution.preorderTraversal(t1);

        for (Integer e:re){
            System.out.println(e);
        }
    }
}

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;TreeNode(int x) { val = x; }
}