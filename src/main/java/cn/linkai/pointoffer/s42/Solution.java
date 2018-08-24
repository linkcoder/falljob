package cn.linkai.pointoffer.s42;

import java.util.Arrays;

public class Solution {

    public void FindNumsAppearOnce(int [] array,int num1[] , int num2[]) {

        Arrays.sort(array);

        int len=array.length;
        int fast=0;
        int slow=0;
        int[] nums=new int[2];
        int index=0;
        while(fast<len && slow<len && index<2){
            if(array[slow]==array[fast]){
                fast++;
            }else if((fast-slow)==1){
                nums[index++]=array[slow];
                slow=fast;
            }else {
                slow = fast;
            }
        }
        if(fast-slow==1)
            nums[1]=array[slow];

        num1[0]=nums[0];
        num2[0]=nums[1];
    }

    public static void main(String[] args) {
        Solution solution=new Solution();
        int[] array={2,4,3,6,3,2,5,5};
        int[] num1=new int[1];
        int[] num2=new int[1];

        solution.FindNumsAppearOnce(array,num1,num2);
        System.out.println(num1[0]+" "+num2[0]);
    }
}
