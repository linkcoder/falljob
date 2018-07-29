package cn.linkai.leetcode.c12;

import java.util.HashMap;
import java.util.Map;

public class Solution {

    private static Map<Integer,String> table=new HashMap<>();

    private static int[] nums={1000,900,500,400,100,90,50,40,10,9,5,4,1};

    static {
        table.put(1,"I");
        table.put(5,"V");
        table.put(10,"X");
        table.put(50,"L");
        table.put(100,"C");
        table.put(500,"D");
        table.put(1000,"M");
        table.put(4,"IV");
        table.put(9,"IX");
        table.put(40,"XL");
        table.put(90,"XC");
        table.put(400,"CD");
        table.put(900,"CM");
    }

    public String intToRoman(int num) {
        StringBuilder builder=new StringBuilder();
        int index=0;
        int times=0;
        int lay=num;
        do {
            times=lay/nums[index];
            lay=lay%nums[index];
            addCode(builder,nums[index],times);
            index=(index==nums.length-1)?index:++index;
        }while (lay>0);

        return builder.toString();
    }

    public void addCode(StringBuilder builder,int num,int times){
        System.out.println(num+":"+times);
        for(int i=0;i<times;i++){
            builder.append(table.get(num));
        }
    }


    public static void main(String[] args) {
        Solution solution=new Solution();
        System.out.println(solution.intToRoman(58 ));
    }
}
