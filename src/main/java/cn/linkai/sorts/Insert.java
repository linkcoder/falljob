package cn.linkai.sorts;

public class Insert <T extends Comparable<T>> extends Sort<T>{
    /**
     * 插入排序
     * 时间复杂度：N--N^2
     * 空间复杂度：1
     * 稳定性：稳定
     */
    @Override
    public T[] sort(T[] nums) {
        int len=nums.length;
        for(int i=1;i<len;i++){
            for(int j=i;j>0 && less(nums[j],nums[j-1]);j--){
                swap(nums,j,j-1);
            }
            printEveryResult(nums);
        }
        return nums;
    }
}
