package cn.linkai.pointoffer.s12;

public class Solution {

    public int NumberOf1(int n) {
        int cnt = 0;
        while (n != 0) {
            cnt++;
            n &= (n - 1);
        }
        return cnt;
    }

    public static void main(String[] args) {
        Solution solution=new Solution();
        int re = solution.NumberOf1(-5);
        System.out.println(re);
    }
}
