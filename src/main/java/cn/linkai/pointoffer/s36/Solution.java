package cn.linkai.pointoffer.s36;

import java.util.BitSet;

public class Solution {

    public int FirstNotRepeatingChar(String str) {
        int[] cnts=new int[256];

        for(int i=0;i<str.length();i++){
            char c = str.charAt(i);
            cnts[c]++;
        }

        for(int i=0;i<str.length();i++){
            if(cnts[str.charAt(i)]==1){
                return i;
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        Solution solution=new Solution();
        int re = solution.FirstNotRepeatingChar("hellohre");
        System.out.println(re);
    }
}
