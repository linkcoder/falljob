package cn.linkai.pointoffer.s13;

public class Solution {

    public double Power(double base, int exponent) {
        if (exponent == 0)
            return 1;
        if (exponent == 1)
            return base;
        boolean isNegative = false;
        if (exponent < 0) {
            exponent = -exponent;
            isNegative = true;
        }
        double pow = Power(base * base, exponent / 2);
        if (exponent % 2 != 0)
            pow = pow * base;
        return isNegative ? 1 / pow : pow;
    }

    public static void main(String[] args) {
        Solution solution=new Solution();
        double power = solution.Power(5, 3);
        System.out.println(power);
    }
}