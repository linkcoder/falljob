package cn.linkai.leetcode.c455;

import java.util.Arrays;

public class Solution {

    public int findContentChildren(int[] g, int[] s) {

        Arrays.sort(g);
        Arrays.sort(s);

        int count=0;
        int gi=0;
        int si=0;

        while(gi<g.length && si<s.length){
            if(s[si]>=g[gi]) {
                count++;
                gi++;
            }
            si++;
        }
        return count;
    }

    public static void main(String[] args) {
        Solution solution=new Solution();
        int e=solution.findContentChildren(new int[]{1, 2, 3}, new int[]{1, 1});
        System.out.println(e);
    }
}
