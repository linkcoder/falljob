package cn.linkai.pointoffer.s22;

import java.util.Stack;

public class Solution {



    public boolean IsPopOrder(int [] pushA,int [] popA) {
        int n=pushA.length;
        Stack<Integer> stack=new Stack<>();
        for(int pushIndex=0, popIndex=0;pushIndex<n;pushIndex++){
            stack.push(pushA[pushIndex]);

            while(popIndex<n && stack.peek()==popA[popIndex]){
                stack.pop();
                popIndex++;
            }
        }

        return stack.isEmpty();
    }


    public boolean IsPopOrder2(int[] pushSequence, int[] popSequence) {
        int n = pushSequence.length;
        Stack<Integer> stack = new Stack<>();
        for (int pushIndex = 0, popIndex = 0; pushIndex < n; pushIndex++) {
            stack.push(pushSequence[pushIndex]);
            while (popIndex < n && stack.peek() == popSequence[popIndex]) {
                stack.pop();
                popIndex++;
            }
        }
        return stack.isEmpty();
    }
    public static void main(String[] args) {
        Solution solution=new Solution();
        int[] pushs={1};
        int[] pops={4,5,3,2,1};
        int[] pops2={1};

        boolean b1 = solution.IsPopOrder(pushs, pops2);
        System.out.println(b1);
        boolean b2= solution.IsPopOrder2(pushs,pops2);
        System.out.println(b2);
    }
}
