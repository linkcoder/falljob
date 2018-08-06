package cn.linkai.leetcode.c39;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Solution {

    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        //排序然后去除重复的
        Arrays.sort(candidates);
        //去除重复，这样省心
        int i,j,k,n;
        n=1;
        for(i=1;i<candidates.length;i++){
            if(candidates[i]!=candidates[i-1]){
                candidates[n++]=candidates[i];
            }
        }
        this.nums=candidates;
        this.n=n;
        this.result= new ArrayList<>();
        find(new ArrayList<>(),0,target);
        return this.result;
    }

    int n;
    int nums[];
    List<List<Integer>> result;
    //当前集合，当前使用的数字位置，当前还剩多少
    public void find(List<Integer> values,int index,int reserve){
        if(reserve==0){
            ArrayList<Integer> item= new ArrayList<>();
            item.addAll(values);
            result.add(item);
        }
        for(int i=index;i<n;i++){
            if(nums[i]<=reserve){
                values.add(nums[i]);
                find(values,i,reserve-nums[i]);
                values.remove(values.size()-1);
            }
        }
    }


}
