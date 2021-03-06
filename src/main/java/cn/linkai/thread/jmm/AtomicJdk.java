package cn.linkai.thread.jmm;

import java.util.concurrent.atomic.AtomicInteger;

public class AtomicJdk {

    public static void main(String[] args) {
        //源码
        //里面全部调用了Unsafe类的cas方法来保证修改的原子性
        // setup to use Unsafe.compareAndSwapInt for updates
        AtomicInteger in=new AtomicInteger(1);
        //volatile不能保证原子性的原因是因为多个线程的load assign 和 store的操作合起来不是原子性
        //sychronized使用的是lock和unlock操作，来锁主存的变量，所以能保证las三步的原子性
        //cas缺点：
        //1.循环开销；2.只能同步一个变量；3.ABA问题（如果这种问题采用互斥同步性能较高）
    }
}
