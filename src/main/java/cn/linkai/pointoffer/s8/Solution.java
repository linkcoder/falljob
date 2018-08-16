package cn.linkai.pointoffer.s8;

public class Solution {

    public int Fibonacci(int n) {
        if(n<=1) return n;

        int pre1=0;
        int pre2=1;
        int tem;
        for(int i=2;i<=n;i++){
            tem=pre2;
            pre2=pre1+pre2;
            pre1=tem;
        }
        return pre2;
    }

    public static void main(String[] args) {
        Solution solution=new Solution();
        int fibonacci = solution.Fibonacci(4);
        System.out.println(fibonacci);
    }
}
