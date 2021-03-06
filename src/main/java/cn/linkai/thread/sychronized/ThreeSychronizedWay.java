package cn.linkai.thread.sychronized;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreeSychronizedWay {

    public synchronized void test1(){
        while(true) {//如果这里一直是运行test1的方法，则锁门sychronized在同步的时候不会释放锁
            System.out.println("test1: "+Thread.currentThread().getId());
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

    }

    public synchronized void test11(){
        while (true){
            System.out.println("test11: "+Thread.currentThread().getId());
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

    }

    public void test2(){
        synchronized (this){
            System.out.println("test2: "+ Thread.currentThread().getId());
        }
    }

    public void test3(){
        synchronized (ThreeSychronizedWay.class){
            System.out.println("test3: "+Thread.currentThread().getId());
        }
    }

    public static void main(String[] args) {
        ThreeSychronizedWay test=new ThreeSychronizedWay();
        ThreeSychronizedWay test2=new ThreeSychronizedWay();

        ExecutorService executorService = Executors.newCachedThreadPool();

//        executorService.submit(new Runnable() {
//            @Override
//            public void run() {
//                test.test1();
//            }
//        });
//
//        executorService.submit(new Runnable() {
//            @Override
//            public void run() {
//                test.test2();
//            }
//        });
//        executorService.submit(new Runnable() {
//            @Override
//            public void run() {
//                test.test2();
//            }
//        });
//
//        executorService.submit(new Runnable() {
//            @Override
//            public void run() {
//                test.test3();
//            }
//        });
//
//        executorService.submit(new Runnable() {
//            @Override
//            public void run() {
//                test.test3();
//            }
//        });
        executorService.submit(()->{
            test.test11();
        });
        executorService.submit(()->{
           test.test1();
        });


    }
}
