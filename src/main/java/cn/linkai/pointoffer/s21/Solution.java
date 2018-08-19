package cn.linkai.pointoffer.s21;

import java.util.Stack;

public class Solution {

    Stack<Integer> stack=new Stack<>();
    Stack<Integer> minStack=new Stack<>();

    public void push(int node) {
        stack.push(node);
        minStack.push(minStack.isEmpty()?node:Math.min(minStack.peek(),node));
    }

    public void pop() {
        stack.pop();
        minStack.pop();
    }

    public int top() {
        return stack.peek();
    }

    public int min() {
        return minStack.peek();
    }

    public static void main(String[] args) {
        Solution solution=new Solution();
        solution.push(1);
        solution.push(2);
        solution.push(3);
        solution.push(1);

        System.out.println(solution.min());
        solution.pop();
        System.out.println(solution.min());
    }
}
