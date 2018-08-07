package cn.linkai.leetcode.c75;

import java.util.Arrays;

public class Solution {

    public void sortColors(int[] nums) {
        int red = 0,white = 0,blue = 0;

        for(int e:nums){
            if(e==0) red++;
            else if(e==1) white++;
            else blue++;
        }

        Arrays.fill(nums,0,red,0);
        Arrays.fill(nums,red,red+white,1);
        Arrays.fill(nums,red+white,red+white+blue,2);
    }

    public static void main(String[] args) {
        Solution solution=new Solution();
        int[] nums={2,0,2,1,1,0};
        solution.sortColors(nums);
        for(int e:nums){
            System.out.println(e);
        }
    }
}
