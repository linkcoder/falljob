package cn.linkai.pointoffer.s51;

public class Solution {
    public int Add(int a, int b) {
        return b == 0 ? a : Add(a ^ b, (a & b) << 1);
    }
}
