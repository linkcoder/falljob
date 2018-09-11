package cn.linkai.container.collection;

import java.util.ConcurrentModificationException;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.concurrent.BlockingDeque;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ConcurrentLinkedQueue;

public class QueueJDK {
    public static void main(String[] args) {
        Queue link=new LinkedList();
        Queue priorityQ=new PriorityQueue();
        priorityQ.offer(1);
        priorityQ.offer(4);
        priorityQ.offer(3);
        priorityQ.offer(2);

        System.out.println(priorityQ);
    }
}
