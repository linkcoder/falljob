package cn.linkai.leetcode.c434;

public class Solution {

    public int countSegments(String s) {
        if(s==null || s.equals("")) return 0;
        String[] ss = s.split(" ");
        int cnt=0;
        for(String v:ss){
            if(v.trim().equals("")) continue;

            cnt++;
        }
        return cnt;
    }

    public static void main(String[] args) {
        Solution solution=new Solution();
        int re = solution.countSegments(", , , ,       a, eaefa");
        System.out.println(re);
    }
}
