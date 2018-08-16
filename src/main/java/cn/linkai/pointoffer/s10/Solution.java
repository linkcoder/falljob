package cn.linkai.pointoffer.s10;

public class Solution {
    /**
     *当n = 1 时， 只有一种跳法，即1阶跳：Fib(1) = 1;
     *当n = 2 时， 有两种跳的方式，一阶跳和二阶跳：Fib(2) = Fib(1) + Fib(0) = 2;
     *当n = 3 时，有三种跳的方式，第一次跳出一阶后，后面还有Fib(3-1)中跳法； 第一次跳出二阶后，后面还有Fib(3-2)中跳法；第一次跳出三阶后，后面还有Fib(3-3)中跳法
     *Fib(3) = Fib(2) + Fib(1)+Fib(0)=4;
     *当n = n 时，共有n种跳的方式，第一次跳出一阶后，后面还有Fib(n-1)中跳法； 第一次跳出二阶后，后面还有Fib(n-2)中跳法..........................第一次跳出n阶后，后面还有 Fib(n-n)中跳法.
     *Fib(n) = Fib(n-1)+Fib(n-2)+Fib(n-3)+..........+Fib(n-n)=Fib(0)+Fib(1)+Fib(2)+.......+Fib(n-1)
     *又因为Fib(n-1)=Fib(0)+Fib(1)+Fib(2)+.......+Fib(n-2)
     *两式相减得：Fib(n)-Fib(n-1)=Fib(n-1)         =====》  Fib(n) = 2*Fib(n-1)     n >= 2
     * @param target
     * @return
     */
    public int JumpFloorII(int target) {
        if(target<=2) return target;

        int pre=2;

        for(int i=2;i<target;i++){
            pre=2*pre;
        }
        return pre;
    }

    public static void main(String[] args) {
        Solution solution=new Solution();
        int jumpFloorII = solution.JumpFloorII(3);
        System.out.println(jumpFloorII);
    }
}
