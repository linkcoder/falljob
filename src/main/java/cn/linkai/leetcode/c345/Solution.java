package cn.linkai.leetcode.c345;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Solution {

    static Set<Character> yuanSet=new HashSet<>();

    static {
        yuanSet.addAll(Arrays.asList('a','e','i','o','u','A','E','I','O','U'));
    }

    public String reverseVowels(String s) {
        int low=0;
        int high=s.length()-1;
        char[] re=s.toCharArray();
        while(low<high){
            char lowe=s.charAt(low);
            char highe=s.charAt(high);
            if(!yuanSet.contains(lowe)) {
                re[low++]=lowe;
            }
            if(!yuanSet.contains(highe)){
                re[high--]=highe;
            }

            if(yuanSet.contains(lowe) && yuanSet.contains(highe)){
                re[low++]=highe;
                re[high--]=lowe;
            }
        }

        return new String(re);
    }

    public static void main(String[] args) {
        Solution solution=new Solution();
        String re = solution.reverseVowels("leetcode");
        System.out.println(re);
    }
}
