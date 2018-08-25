package cn.linkai.pointoffer.s49;

public class Solution {

    /**
     *  约瑟夫环问题
     *  f(nmm)=0 n=1
     *  f(n,m)=[f(n-1,m)+m]%n n>1
     */
    public int LastRemaining_Solution(int n, int m) {
        if(n==0) return -1;
        if(n==1) return 0;
        return (LastRemaining_Solution(n-1,m)+m)%n;
    }

    public static void main(String[] args) {
        Solution solution=new Solution();
        int re = solution.LastRemaining_Solution(5, 2);
        System.out.println(re);
    }
}
