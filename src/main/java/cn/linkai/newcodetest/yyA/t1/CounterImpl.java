package cn.linkai.newcodetest.yyA.t1;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;

public class CounterImpl implements Counter2{

    private ConcurrentHashMap<String, AtomicInteger> container=new ConcurrentHashMap<>();

    @Override
    public int get(String str) {
        return container.get(str).get();
    }

    @Override
    public void add(String str) {
        if (container.containsKey(str)) {
            container.get(str).getAndIncrement();
        } else {
            synchronized (container) {
                if(!container.containsKey(str))
                    container.put(str, new AtomicInteger(1));
                else
                    add(str);
            }
        }
    }

    public static void main(String[] args) {
        Counter2 counter =new CounterImpl();
        int cnt = counter.get("hello");
        System.out.println(cnt);
    }
}


interface Counter2{
    // 获取一个字符串的出现次数
    int get(String str);
    // 增加一个字符串的出现次数
    void add(String str);
}