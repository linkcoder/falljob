package cn.linkai.leetcode.c94;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class Solution {

    public List<Integer> inorderTraversal(TreeNode root) {
        Stack<TreeNode> stack = new Stack<>();
        List<Integer> list = new ArrayList<>();
        while(true){
            if (root != null){
                stack.push(root);
                root = root.left;
            } else {
                if (stack.empty()) {
                    return list;
                }
                root = stack.pop();
                list.add(root.val);
                root = root.right;
            }
        }
    }

    public static void main(String[] args) {
        Solution solution=new Solution();
//        solution.inorderTraversal()
    }
}


class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;TreeNode(int x) { val = x; }
}