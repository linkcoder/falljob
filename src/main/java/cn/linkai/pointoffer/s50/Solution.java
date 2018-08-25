package cn.linkai.pointoffer.s50;

public class Solution {

    public int Sum_Solution(int n) {
        int sum = n;
        boolean b = (n > 0) && ((sum += Sum_Solution(n - 1)) > 0);
        return sum;
    }

    public static void main(String[] args) {
        Solution solution=new Solution();
        int re = solution.Sum_Solution(5);
        System.out.println(re);
    }
}
