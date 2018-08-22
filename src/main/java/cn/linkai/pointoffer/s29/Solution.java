package cn.linkai.pointoffer.s29;

public class Solution {

    //摩尔投票算法，用来计算一个数组中出现的数的次数大于1/2
    public int MoreThanHalfNum_Solution(int [] array) {
        int majority=array[0];

        for(int i=1 ,cnt=1;i<array.length;i++){
            cnt = array[i]==majority ? cnt+1 : cnt-1;

            if(cnt==0){
                cnt=1;
                majority=array[i];
            }
        }

        int count=0;
        for(int e:array){
            if(e==majority)
                count++;
        }

        return count>(array.length/2)?majority:0;
    }

}
