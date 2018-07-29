package cn.linkai.leetcode.c1;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public int[] twoSum(int[] nums, int target) {
        List<Integer> result= new ArrayList<>();
        for(int i=0;i<nums.length;i++){

            for(int j=i+1;j<nums.length;j++){
                if((nums[i]+nums[j])==target){
                    result.add(i);
                    result.add(j);
                }
            }
        }
        int[] returnList=new int[result.size()];
        int index=0;
        for(int e:result){
            returnList[index++]=e;
        }
        return returnList;
    }


    public static void main(String[] args) {

    }
}
