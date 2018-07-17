package thread.xprocessor;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class WaitNotify {

    public synchronized void before() {
        System.out.println("before");
        notifyAll();
    }

    public synchronized void after() {
        try {
            wait();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("after");
    }

    public static void main(String[] args) {
        ExecutorService executorService = Executors.newCachedThreadPool();
        WaitNotify example = new WaitNotify();
        executorService.execute(() -> example.after());
        executorService.execute(() -> example.before());
    }
}
