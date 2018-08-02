package cn.linkai.leetcode.c122;

public class Solution {

    public int maxProfit(int[] prices) {

        int p_in = 0,sum=0;
        boolean buy=false;

        for(int i=0;i<prices.length-1;i++){
            if(!buy){
                if(prices[i]<prices[i+1]){
                    p_in=prices[i];
                    buy=true;
                }
            }else{
                if(prices[i]>prices[i+1]){
                    buy=false;
                    sum+=prices[i]-p_in;
                }
            }
        }
        if(buy){
            sum+=prices[prices.length-1]-p_in;
        }
        return sum;
    }

    public static void main(String[] args) {
        Solution solution=new Solution();
        int[] prices={7,1,5,3,6,4};
        System.out.println(solution.maxProfit(prices));
    }
}
