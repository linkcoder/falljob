package cn.linkai.leetcode.c598;

import java.util.Arrays;

public class Solution {

    public int maxCount(int m, int n, int[][] ops) {
        if(ops==null || ops.length==0) return m*n;

        int[] l1=new int[ops.length];
        int[] l2=new int[ops.length];
        for(int i=0;i<ops.length;i++){
            l1[i]=ops[i][0];
            l2[i]=ops[i][1];
        }

        Arrays.sort(l1);
        Arrays.sort(l2);

        return l1[0]*l2[0];
    }
}
