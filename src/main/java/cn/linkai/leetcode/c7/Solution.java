package cn.linkai.leetcode.c7;

import java.util.ArrayList;

public class Solution {

    public int reverse(int x) {
        ArrayList<Integer> list=new ArrayList<>();
        boolean positive=x>=0?true:false;
        x=Math.abs(x);
        while(x!=0){
            list.add(x%10);
            x=x/10;
        }
        long result=0;
        for(int e:list){
            result=result*10+e;
        }
        result=positive?result:-result;
        if(result< Integer.MIN_VALUE||result>Integer.MAX_VALUE){
            result=0;
        }
        return (int)result;
    }

    public static void main(String[] args) {
        Solution solution=new Solution();

        System.out.println(solution.reverse(1555555555));
    }
}
