package cn.linkai.leetcode.c746;

public class Solution {

    public int minCostClimbingStairs(int[] cost) {
        int dp[]=new int[cost.length+1];
        dp[0]=0;dp[1]=0;
        for(int n=2;n<cost.length+1;++n){
            dp[n]=Math.min(dp[n-1]+cost[n-1],dp[n-2]+cost[n-2]);
        }

        return dp[cost.length];

    }

}
