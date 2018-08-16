package cn.linkai.pointoffer.s7;

import java.util.ArrayList;

public class Solution {

    public int minNumberInRotateArray(int [] array) {
        if(array==null || array.length==0) return 0;

        int minIndex=findMINIndex(array);
        int min=array[minIndex];

        if(minIndex==0) return min;

        int[] tmp=new int[minIndex];

        for(int i=0;i<minIndex;i++){
            tmp[i]=array[i];
        }
        int nex=minIndex;
        for(;nex<array.length;nex++){
            array[nex-minIndex]=array[nex];
        }
        int len=nex-minIndex;
        for(int i=len;i<array.length;i++){
            array[i]=tmp[i-len];
        }
        return min;

    }

    public int minNumberInRotateArray2(int [] array) {
        if(array==null || array.length==0) return 0;

        int minIndex=findMINIndex(array);
        int min=array[minIndex];

        if(minIndex==0) return min;

        int i=0;
        ArrayList<Integer> nums=new ArrayList<>();
        while(i<array.length){
            nums.add(array[minIndex%array.length]);
            minIndex++;
            i++;
        }

        for(int j=0;j<nums.size();j++){
            array[j]=nums.get(j);
        }
        return min;

    }

    private int findMINIndex(int[] array) {
        int minIndex=0;
        for(int i=0;i<array.length;i++){
            if(array[minIndex]>array[i]) minIndex=i;
        }
        return minIndex;
    }


    public static void main(String[] args) {
        Solution solution=new Solution();
        int[] arr={3,4,5,1,2};
        int min = solution.minNumberInRotateArray2(arr);
        System.out.println(min);
        for(int e:arr)
            System.out.println(e);
    }

}
