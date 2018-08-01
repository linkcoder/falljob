package cn.linkai.leetcode.c136;

public class Solution {

    public int singleNumber(int[] nums) {
        int result=nums[0];

        for(int i=1;i<nums.length;i++){
            result=result ^ nums[i];
        }
        return result;
    }

    public static void main(String[] args) {
        Solution solution=new Solution();
        int[] nums={6,2,2,3,3,5,6};
        int result=solution.singleNumber(nums);
        System.out.println(result);
    }
}
