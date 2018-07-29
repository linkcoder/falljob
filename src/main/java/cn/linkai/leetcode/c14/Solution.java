package cn.linkai.leetcode.c14;

import java.util.Arrays;

public class Solution {

    public String longestCommonPrefix(String[] strs) {

        String ans;
        if (strs != null && strs.length >0) {  //防止坑爹情况
            int num = 0;
            Arrays.sort(strs); // 给数组排序

            char[] one = strs[0].toCharArray();
            char[] end = strs[strs.length - 1].toCharArray();
            //取第一个和最后一个字符串进行比较
            for (int i = 0; i < one.length; i++) {
                if (one[i] == end[i])
                    num++;
                else
                    break;
            }
            //如果第一个字符都不相等，那就return"";
            if (num == 0) {
                return "";
            }

            //变成String类型返回
            char[] temp = new char[num];
            for (int i = 0; i < num; i++) {
                temp[i] = one[i];
            }
            ans = String.valueOf(temp);
            return ans;
        }
        return "";
    }
}
