package cn.linkai.leetcode.c70;

public class Solution {

    public int climbStairs(int n) {

        if(n<=2) return n;
        int p1=1,p2=2;
        int tmp=0;
        for(int i=3;i<=n;i++){
            tmp=p2;
            p2=p1+p2;
            p1=tmp;
        }

        return p2;
    }

    public static void main(String[] args) {
        Solution solution=new Solution();
        int re = solution.climbStairs(3);
        System.out.println(re);
    }
}
