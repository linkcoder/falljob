package cn.linkai.sorts;

public abstract class MergeSort<T extends Comparable> {
    protected T[] aux;

    public void merge(T[] nums,int l,int m,int h){
        int i=l,j=m+1;
        for(int k=l;k<=h;k++){
            aux[k]=nums[k];
        }

        for(int k=l;k<=h;k++){
            if(i>m){
                nums[k]=aux[j++];
            }else if(j>h){
                nums[k]=aux[i++];
            }else if(aux[i].compareTo(nums[j])<=0){
                nums[k]=aux[i++];
            }else{
                nums[k]=aux[j++];
            }
        }
    }

    protected void printEveryResult(T[] nums){
        for(T t:nums){
            System.out.print(t+" ");
        }
        System.out.println();
    }
}
