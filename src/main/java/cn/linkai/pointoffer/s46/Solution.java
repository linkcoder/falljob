package cn.linkai.pointoffer.s46;

import java.util.LinkedList;

public class Solution {

    public String LeftRotateString(String str,int n) {
        if(str==null || str.equals("") || str.length()==1 || n==0) return str;

        int need=n%str.length();

        String reStr=str.substring(0,need);

        String newPreStr=str.substring(need);

        return newPreStr+reStr;
    }

    public static void main(String[] args) {
        Solution solution=new Solution();
        String re = solution.LeftRotateString("abcXYZdef", 10);
        System.out.println(re);
    }
}
