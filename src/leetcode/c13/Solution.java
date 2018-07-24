package leetcode.c13;

import java.util.HashMap;
import java.util.Map;

public class Solution {

    private static Map<String,Integer> table=new HashMap<>();

    static {
        table.put("I",1);
        table.put("V",5);
        table.put("X",10);
        table.put("L",50);
        table.put("C",100);
        table.put("D",500);
        table.put("M",1000);
        table.put("IV",4);
        table.put("IX",9);
        table.put("XL",40);
        table.put("XC",90);
        table.put("CD",400);
        table.put("CM",900);
    }

    public int romanToInt(String s) {
        StringBuilder builder =new StringBuilder(s);
        int num=0;
        int index=0;
        while (index<=builder.length()-2){
            String code=builder.substring(index,index+2);
            if(table.containsKey(code)){
                index+=2;
            }else{
                code= String.valueOf(code.charAt(0));
                index++;
            }
            num=+table.get(code);
        }

        for(int i=index;i<builder.length();i++){
            String code=builder.substring(i,i+1);
            num+=table.get(code);
        }

        return num;
    }

    public static void main(String[] args) {
        Solution solution=new Solution();
        System.out.println(solution.romanToInt("III"));
    }

}
