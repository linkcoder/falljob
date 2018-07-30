package cn.linkai.sorts;

public class Merge<T extends Comparable> extends MergeSort<T> {

    /**
     *归并排序
     * 时间复杂度：N*logN
     */
    public T[] mergeSort(T[] nums){
        aux = (T[]) new Comparable[nums.length];
        mergeSort(nums, 0, nums.length - 1);
        return nums;
    }

    public void mergeSort(T[] nums,int l,int h){
        if (h <= l)
            return;
        int mid = l + (h - l) / 2;
        mergeSort(nums, l, mid);
        mergeSort(nums, mid + 1, h);
        merge(nums, l, mid, h);
        printEveryResult(nums);
    }
}
