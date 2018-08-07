package cn.linkai.thread.yield;

public class YieldJdk {

    public static void main(String[] args) {

        Thread t1=new Thread(new Runnable() {
            @Override
            public void run() {
                while(true){
                    System.out.println(Thread.currentThread().getName());

                    try {
                        Thread.sleep(500);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        });

        Thread t2=new Thread(new Runnable() {
            @Override
            public void run() {
                while(true){
                    System.out.println(Thread.currentThread().getName());

                    try {
                        Thread.sleep(500);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        });
        Thread t3=new Thread(new Runnable() {
            @Override
            public void run() {
                while(true){
                    System.out.println(Thread.currentThread().getName());
                    Thread.yield();
                    try {
                        Thread.sleep(500);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        });

        t1.start();
        t2.start();
        t3.start();
    }
}
