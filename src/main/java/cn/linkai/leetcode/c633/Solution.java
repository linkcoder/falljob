package cn.linkai.leetcode.c633;

public class Solution {

    public boolean judgeSquareSum(int c) {
        int low=0;
        int high= (int) Math.sqrt(c);
        int sum;
        while(low<=high){
            sum=low * low + high * high;
            if(sum==c) return true;
            if(sum<c) low++;
            else high--;
        }
        return false;
    }

    public static void main(String[] args) {
        Solution solution=new Solution();
        boolean is = solution.judgeSquareSum(5);
        System.out.println(is);

    }
}
