package cn.linkai.leetcode.c462;

import java.util.Arrays;

public class Solution {

    public int minMoves2(int[] nums) {
        if(nums==null || nums.length<=1) return 0;
        Arrays.sort(nums);

        int l=0,h=nums.length;
        int mid=(l+h)/2;
        int midV=nums[mid];

        int moveCnt=0;
        for(int i=0;i<nums.length;i++){
            moveCnt+=Math.abs(midV-nums[i]);
        }
        return moveCnt;
    }

    public static void main(String[] args) {
        Solution solution=new Solution();
        int re = solution.minMoves2(new int[]{1,3,5,8});
        System.out.println(re);
    }
}
