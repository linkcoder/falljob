package cn.linkai.thread;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.FutureTask;
import java.util.concurrent.locks.ReentrantLock;

public class ExcutorJDK {

    public static void main(String[] args) {
        ExecutorService executor= Executors.newCachedThreadPool();
        Callable callable=new MyCall();
       FutureTask<Integer> future=new FutureTask<>(callable);
//       future.cancel()
//       Thread
//        FutureTask
//        ReentrantLock
    }
}

class MyCall implements Callable<Integer>{

    @Override
    public Integer call() throws Exception {
        return 100;
    }
}