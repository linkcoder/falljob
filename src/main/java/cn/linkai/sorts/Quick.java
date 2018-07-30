package cn.linkai.sorts;

public class Quick<T extends Comparable<T>> extends Sort<T> {
    @Override
    public T[] sort(T[] nums) {
        quickSort(nums,0,nums.length-1);
        return nums;
    }

    public void quickSort(T[] nums,int l,int h){
        if(l>=h) return;
        printEveryResult(nums);
        int mid=patition(nums,l,h);
        quickSort(nums,l,mid);
        quickSort(nums,mid+1,h);
    }

    private int patition(T[] nums,int l,int h){

        while(l<h){
            while(l<h && nums[l].compareTo(nums[h])<=0){
                h--;
            }
            if(l<h){
                swap(nums,l,h);
            }
            while (l<h && nums[l].compareTo(nums[h])<=0){
                l++;
            }
            if(l<h){
                swap(nums,l,h);
            }
        }
        return l;
    }
}
