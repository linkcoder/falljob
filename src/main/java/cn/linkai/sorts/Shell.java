package cn.linkai.sorts;

public class Shell<T extends Comparable<T>> extends Sort<T> {
    /**
     * 希尔排序
     * 时间复杂度：N^1.3 ~ N^2
     * 空间复杂度：1
     * 稳定性：不稳定
     */
    @Override
    public T[] sort(T[] nums) {
        int N = nums.length;
        int h = 1;
        while (h < N / 3)
            h = 3 * h + 1;  // 1, 4, 13, 40, ...

        while (h >= 1) {
            for (int i = h; i < N; i++)
                for (int j = i; j >= h && less(nums[j], nums[j - h]); j -= h){
                    swap(nums, j, j - h);
                    printEveryResult(nums);
                }
            h = h / 3;
        }
        return nums;
    }
}