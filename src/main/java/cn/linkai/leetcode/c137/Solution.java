package cn.linkai.leetcode.c137;

public class Solution {

    public int singleNumber(int[] nums) {
        int[] count = new int[32];
        int result = 0;

        for (int i = 0; i < 32; i++) {
            for (int n : nums) {
                // 统计第i位的1的个数
                if (((n >> i) & 1) == 1) {
                    count[i]++;
                }
            }

            result |= (count[i] % 3) << i;
        }

        return result;
    }
}
