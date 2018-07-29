package cn.linkai.thread.unsafe;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicBoolean;

public class VolatileExample {

    public static void main(String[] args) {
        ExecutorService executorService= Executors.newCachedThreadPool();
        AtomicBoolean stop = new AtomicBoolean(false);
        executorService.submit(()->{
            while(!stop.get()){
                System.out.println(System.currentTimeMillis()+">>>>>hello");
                System.out.println(stop);
            }
        });
        executorService.submit(()-> {
            stop.set(true);
            System.out.println("stop");
        });
        executorService.shutdown();
    }

    //
    public synchronized static void hello(){

    }
}
