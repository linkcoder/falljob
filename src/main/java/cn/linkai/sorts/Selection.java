package cn.linkai.sorts;

public class Selection<T extends Comparable<T>> extends Sort<T>{

    /**
     * 选择排序
     * 时间复杂度：N^2
     * 空间复杂度：1
     * 稳定性：不稳定
     */
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
