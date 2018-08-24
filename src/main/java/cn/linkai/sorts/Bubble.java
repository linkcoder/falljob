package cn.linkai.sorts;

public class Bubble<T extends Comparable<T>> extends Sort<T> {
    /**
     * 冒泡排序
     * 时间复杂度：N--N^2（N^2）
     * 空间复杂度: 1
     * 稳定性：稳定（排序前后相对位置不变）
     */
    @Override
    public T[] sort(T[] nums) {
        int length=nums.length;
        boolean hasSorted=false;

        for (int i = 0; i <length && !hasSorted ; i++) {
            hasSorted=true;//优化，当没有出现交换的时候，则说明已经有序了
            for (int j =0;j<length-i-1;j++){
                if(less(nums[j+1],nums[j])){
                    swap(nums,j,j+1);
                    hasSorted=false;
                }
            }
            printEveryResult(nums);
        }
        return nums;
    }
}
