package cn.linkai.thread.jmm;

import java.util.concurrent.atomic.AtomicInteger;

public class AtomicJdk {

    public static void main(String[] args) {
        //源码
        //里面全部调用了Unsafe类的cas方法来保证修改的原子性
        // setup to use Unsafe.compareAndSwapInt for updates
        AtomicInteger in=new AtomicInteger(1);
    }
}
