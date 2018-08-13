package cn.linkai.leetcode.c167;

public class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int l=0;
        int h=numbers.length-1;

        while(l<h){
            if(numbers[l]+numbers[h]==target) break;
            if(numbers[l]+numbers[h]<target) l++;
            if(numbers[l]+numbers[h]>target) h--;
        }
        return new int[]{l+1,h+1};
    }
}
