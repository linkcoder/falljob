package cn.linkai.pointoffer.s32;

public class Solution {

    //534 = （个位1出现次数）+（十位1出现次数）+（百位1出现次数）=（53*1+1）+（5*10+10）+（0*100+100）= 214
    public int NumberOf1Between1AndN_Solution(int n) {
        if(n<1) return 0;

        int weight=0;
        int count=0;
        int base=1;
        int round=n;

        while(round>0){
            weight=round%10;
            round=round/10;
            count+=round*base;

            if(weight==1){
                count+=(n%base)+1;//10 11 ...19
            }else if(weight>1){
                count+=base;
            }

            base=base*10;
        }

        return count;
    }
}
