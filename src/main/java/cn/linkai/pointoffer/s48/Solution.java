package cn.linkai.pointoffer.s48;

import java.util.Arrays;
import java.util.HashSet;

public class Solution {

    public boolean isContinuous(int [] numbers) {
        if(numbers.length!=5) return false;

        HashSet set=new HashSet();
        int zeroCount=0;

        Arrays.sort(numbers);

        for(int puke:numbers){
            if(puke==0) {
                zeroCount++;
            }
            else {
                set.add(puke);
            }
        }
        if(set.size()+zeroCount!=5) return false;

        int chaV=numbers[numbers.length-1]-numbers[zeroCount];
        if(chaV>4) return false;

        return true;
    }

    public static void main(String[] args) {
        Solution solution=new Solution();
        boolean re = solution.isContinuous(new int[]{1, 3, 0, 0, 9});
        System.out.println(re);
    }
}
