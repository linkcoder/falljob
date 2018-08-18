package cn.linkai.pointoffer.s14;

public class Solution {

    public void reOrderArray(int [] array) {

        int negativeCount=0;
        for(int e:array){
            if(e%2!=0){
                negativeCount++;
            }
        }

        int[] copy=array.clone();
        int i=0,j=negativeCount;
        for(int num:copy){
            if(num%2==0){
                array[j++]=num;
            }else {
                array[i++]=num;
            }
        }
    }

    public static void main(String[] args) {
        Solution solution=new Solution();
    }
}
