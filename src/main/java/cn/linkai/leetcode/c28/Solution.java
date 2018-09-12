package cn.linkai.leetcode.c28;

public class Solution {

    public int strStr(String haystack, String needle) {
        if(needle==null || needle.length()==0) return 0;

        int[] next=Solution.getNext(needle);

        char[] ts=haystack.toCharArray();
        char[] ps=needle.toCharArray();

        int i=0;
        int j=0;

        while(i<ts.length && j<ps.length){

            if(j==-1 || ts[i]==ps[j]){
                i++;
                j++;
            }else {
                j=next[j];
            }
        }

        if(j==ps.length){
            return i-j;
        }else
            return -1;
    }

    private static int[] getNext(String ps) {
        char[] p = ps.toCharArray();
        int[] next = new int[p.length];
        next[0] = -1;
        int j = 0;
        int k = -1;
        while (j < p.length - 1) {
            if (k == -1 || p[j] == p[k]) {
                next[++j] = ++k;
            } else {
                k = next[k];
            }
        }
        return next;
    }

    public static void main(String[] args) {
        Solution solution=new Solution();
        int re = solution.strStr("aaab", "ab");
        System.out.println(re);
    }
}
