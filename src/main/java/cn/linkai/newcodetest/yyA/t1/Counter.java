package cn.linkai.newcodetest.yyA.t1;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicInteger;

public class Counter {

    private ConcurrentHashMap<String, AtomicInteger> cntForStr = new ConcurrentHashMap<>();

    public int get(String str) {
        return cntForStr.get(str).get();
    }

    public void add(String str) {
        if (!cntForStr.containsKey(str)) {
            synchronized (cntForStr) {
                if (!cntForStr.containsKey(str)) {
                    cntForStr.put(str, new AtomicInteger());
                }
            }
        }
        cntForStr.get(str).incrementAndGet();
    }

    public static void main(String[] args) throws InterruptedException {
        final int threadSize = 10000;
        final int targetCnt = 10000;
        final int strNum = 100;
        Counter counter = new Counter();

        for (int i = 0; i < strNum; i++) {
            String s = i + "";
            final CountDownLatch countDownLatch = new CountDownLatch(threadSize);
            ExecutorService executorService = Executors.newCachedThreadPool();
            for (int j = 0; j < threadSize; j++) {
                executorService.execute(() -> {
                    counter.add(s);
                    countDownLatch.countDown();
                });
            }
            countDownLatch.await();
            executorService.shutdown();
            assert counter.get(s) == targetCnt;
            System.out.println(counter.get(s));
        }
    }
}
