package cn.linkai.pointoffer.s34;

public class Solution {

    public int GetUglyNumber_Solution(int index) {
        if(index<=6) return index;

        int index2=0,index3=0,index5=0;
        int[] uglys=new int[index];
        uglys[0]=1;
        for(int i=1;i<index;i++){
            int next2=uglys[index2]*2;
            int next3=uglys[index3]*3;
            int next5=uglys[index5]*5;

            uglys[i]=Math.min(Math.min(next2,next3),next5);
            //不适用if-else，为了跳过重复的
            if(uglys[i]==next2)
                index2++;
            if(uglys[i]==next3)
                index3++;
            if(uglys[i]==next5)
                index5++;
        }

        return uglys[index-1];
    }

    public static void main(String[] args) {
        Solution solution=new Solution();
        int re = solution.GetUglyNumber_Solution(8);
        System.out.println(re);
    }
}
