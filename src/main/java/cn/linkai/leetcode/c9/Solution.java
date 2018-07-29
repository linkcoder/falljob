package cn.linkai.leetcode.c9;

public class Solution {

    public boolean isPalindrome(int x) {
        boolean is= true;
        String s1=String.valueOf(x);
        for(int i=0,j=s1.length()-1;i<=j;i++,j--){
            if(s1.charAt(i)==s1.charAt(j))
                continue;
            else
                return false;
        }
        return is;
    }

    public static void main(String[] args) {
        Solution solution=new Solution();
        System.out.println(solution.isPalindrome(-12221));
    }
}
