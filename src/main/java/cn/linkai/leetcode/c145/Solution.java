package cn.linkai.leetcode.c145;

import java.util.*;

public class Solution {

    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> list=new ArrayList<>();
        if (root != null) {
            // 双端队列，当作栈来使用
            Deque<TreeNode> deque = new LinkedList<>();
            // 指向前一个处理的结点
            TreeNode prev = null;
            // 指向当前处理的结点
            TreeNode curr;
            // 根结点入栈
            deque.addLast(root);
            // 栈非空
            while (!deque.isEmpty()) {
                // 获取栈顶元素（不删除）
                curr = deque.getLast();
                if ((curr.left == null && curr.right == null) // 当前元素无左右子树
                        // prev != null && curr.left == prev，当前结点只有左子树，并且左子树已经遍历完
                        // prev != null && curr.right == prev，当前结点有左右子树，并且左右子树已经遍历完
                        || (prev != null && (curr.left == prev || curr.right == prev))) {
                    // 删除栈顶元素
                    curr = deque.removeLast();
                    // 结点值入栈
                    list.add(curr.val);
                    // 更新上一个处理的结点
                    prev = curr;
                } else {

                    // 左右子树未遍历完，将非空左右子树入栈

                    if (curr.right != null) {
                        deque.addLast(curr.right);
                    }

                    if (curr.left != null) {
                        deque.addLast(curr.left);
                    }
                }
            }
        }

        return list;
    }
}

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;TreeNode(int x) { val = x; }
}