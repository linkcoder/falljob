package cn.linkai.pointoffer.s65;

import java.util.ArrayList;
import java.util.PriorityQueue;

public class Solution {

    public ArrayList<Integer> maxInWindows(int [] num, int size) {
        ArrayList<Integer> re=new ArrayList<>();
        if(num.length<size || size<1) return re;

        PriorityQueue<Integer> queue=new PriorityQueue<>((o1, o2) -> o2-o1);
        for(int i=0;i<size;i++) queue.add(num[i]);
        re.add(queue.peek());
        for(int i=1,j=i+size-1;j<num.length;i++,j++){
            queue.remove(num[i-1]);
            queue.offer(num[j]);
            re.add(queue.peek());
        }

        return re;
    }
}
