package cn.linkai.leetcode.c191;

public class Solution {

    public int hammingWeight(int n) {
        int cnt=0;
        while(n!=0){
            cnt++;
            n=n&(n-1);
        }
        return cnt;
    }

    public static void main(String[] args) {
        Solution solution=new Solution();
        int re = solution.hammingWeight(-5);
        System.out.println(re);
    }
}
