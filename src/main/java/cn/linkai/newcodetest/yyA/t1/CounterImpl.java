package cn.linkai.newcodetest.yyA.t1;

import java.util.concurrent.ConcurrentHashMap;

public class CounterImpl implements Counter{

    private ConcurrentHashMap<String,Integer> container=new ConcurrentHashMap<>();

    @Override
    public int get(String str) {
        return container.get(str)==null?0:container.get(str);
    }

    @Override
    public synchronized void add(String str) {
        boolean hasKey=container.containsKey(str);
        if(hasKey){
            container.put(str,container.get(str)+1);
        }else{
            container.put(str,1);
        }
    }

    public static void main(String[] args) {
        Counter counter =new CounterImpl();
        int cnt = counter.get("hello");
        System.out.println(cnt);
    }
}


interface Counter{
    // 获取一个字符串的出现次数
    int get(String str);
    // 增加一个字符串的出现次数
    void add(String str);
}