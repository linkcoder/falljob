package cn.linkai.leetcode.c524;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class Solution {

    public String findLongestWord(String s, List<String> d) {
        String longestWord = "";
        for(String target:d){
            int l1 = longestWord.length();
            int l2 = target.length();
            if(l1>l2||(l1==l2&&longestWord.compareTo(target)<0))
                continue;
            if(isValid(s,target))
                longestWord = target;
        }
        return longestWord;
    }
    private boolean isValid(String s,String target){
        int i = 0;
        int j = 0;
        while(i<s.length()&&j<target.length()){
            if(s.charAt(i)!=target.charAt(j))
                i++;
            else{
                i++;
                j++;
            }
        }
        return j==target.length();
    }

    public static void main(String[] args) {
        Solution solution=new Solution();
        String s = "abpcplea";
        String[] list = {"ale","apple","monkey","plea"};
        String e=solution.findLongestWord(s,Arrays.asList(list));
        System.out.println(e);
    }
}
