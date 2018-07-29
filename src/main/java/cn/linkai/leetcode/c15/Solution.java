package cn.linkai.leetcode.c15;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution {

    public List<List<Integer>> threeSum(int[] nums) {

        List<List<Integer>> result=new ArrayList<>();
        if(nums==null||nums.length<3){
            result.add(new ArrayList<>());
        }
        Arrays.sort(nums);
        for(int i=0;i<nums.length-2;){
            int j=i+1;
            int k=nums.length-1;

            while(j<k){
                if(nums[j]+nums[k]==-nums[i]){
                    List<Integer> list=new ArrayList<>();
                    list.add(nums[i]);
                    list.add(nums[j]);
                    list.add(nums[k]);
                    result.add(list);
                    j++;
                    k--;

                    while(j<k && nums[j]==nums[j-1]){
                        j++;
                    }
                    while(j<k && nums[k]==nums[k+1]){
                        k--;
                    }
                }else if(nums[j]+nums[k]>-nums[i]){
                    k--;
                    while(j<k && nums[k]==nums[k+1]){
                        k--;
                    }
                }else if(nums[j]+nums[k]<-nums[i]){
                    j++;
                    while(j<k && nums[j]==nums[j-1]){
                        j++;
                    }
                }
            }
            i++;
            // 从左向右找第一个与之前处理的数不同的数的下标
            while (i < nums.length - 2 && nums[i] == nums[i - 1]) {
                i++;
            }
        }

        return result;
    }

    public static void main(String[] args) {

    }
}
