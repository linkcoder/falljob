package cn.linkai.pointoffer.s6;

import java.util.Stack;

public class Solution {

    Stack<Integer> stack1 = new Stack<Integer>();//主
    Stack<Integer> stack2 = new Stack<Integer>();//辅

    public void push(int node) {
        if(stack1.isEmpty()){
            stack1.push(node);
        }else{
            int len=stack1.size();
            while(len>0){
                int e=stack1.pop();
                stack2.push(e);
                len--;
            }
            stack1.push(node);
            int len2=stack2.size();
            while(len<len2){
                int e=stack2.pop();
                stack1.push(e);
                len++;
            }
        }
    }

    public int pop() {
        return stack1.pop();
    }

    public static void main(String[] args) {
        Solution solution=new Solution();
        solution.push(1);
        solution.push(2);
        solution.push(3);
        int pop = solution.pop();
        System.out.println(pop);
        solution.push(4);
    }
}
