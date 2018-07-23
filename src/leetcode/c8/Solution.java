package leetcode.c8;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Solution {
    public int myAtoi(String str) {
        String regex="(\\+|\\-)?\\d*";
        Pattern pattern=Pattern.compile(regex);
        Matcher m=pattern.matcher(str.trim());
        String str1 = str;
        str1.matches(regex);
        System.out.println(str1);
        return Integer.valueOf(String.valueOf("22"));
    }

    public static void main(String[] args) {
        Solution solution=new Solution();
        System.out.println(solution.myAtoi("-12233"));
    }
}
