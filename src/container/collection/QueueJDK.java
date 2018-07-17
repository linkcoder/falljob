package container.collection;

import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

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
