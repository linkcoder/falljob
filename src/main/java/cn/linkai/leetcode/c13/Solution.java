package cn.linkai.leetcode.c13;

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
        int num=0;
        String code=null;
        for(int i=0;i<s.length();i++){
            boolean is2Exsist=false;
            if(i+1<s.length()){
                code=s.substring(i,i+2);
                is2Exsist=table.containsKey(code);
            }
            if(!is2Exsist){
                code=s.substring(i,i+1);
            }else {
                i++;
            }
            num+=table.get(code);
        }
        return num;
    }

    public static void main(String[] args) {
        Solution solution=new Solution();
        System.out.println(solution.romanToInt("MCMXCIV"));
    }

}
