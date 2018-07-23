package leetcode.c3;

import java.util.HashMap;
import java.util.Map;

public class Solution {

    public int lengthOfLongestSubstring(String s) {
        int len=s.length();
        Map<Character,Integer> map=new HashMap<>();
        int maxLen=0;

        for(int i=0,j=0;j<len;j++){
            if(map.containsKey(s.charAt(j))){
                i=Math.max(map.get(s.charAt(j)),i);
            }
            maxLen=Math.max(j-i+1,maxLen);
            map.put(s.charAt(j),j+1);
        }

        return maxLen;
    }

    public static void main(String[] args) {
        Solution solution=new Solution();
        int i=solution.lengthOfLongestSubstring("vvvvvv");
        System.out.println(i);
    }



}
