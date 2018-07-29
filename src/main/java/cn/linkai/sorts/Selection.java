package cn.linkai.sorts;

import java.util.Collections;

public class Selection<T extends Comparable<T>> extends Sort<T>{

    public T[] sort(T[] nums) {
        int length=nums.length;
        for(int i=0;i<length;i++){
            int min=i;
            for(int j=i+1;j<length;j++){
                if(less(nums[j],nums[min]))
                    min=j;
            }
            swap(nums,i,min);
            printEveryResult(nums);
        }
        return nums;
    }


}
