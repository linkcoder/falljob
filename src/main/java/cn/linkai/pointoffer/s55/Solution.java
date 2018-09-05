package cn.linkai.pointoffer.s55;

import java.util.LinkedList;
import java.util.Queue;

public class Solution {

    private int[] cnts = new int[256];
    private Queue<Character> queue = new LinkedList<>();

    public void Insert(char ch) {
        cnts[ch]++;
        queue.add(ch);
        while (!queue.isEmpty() && cnts[queue.peek()] > 1)
            queue.poll();
    }

    public char FirstAppearingOnce() {
        return queue.isEmpty() ? '#' : queue.peek();
    }

    public static void main(String[] args) {
        Solution solution=new Solution();
        solution.Insert('g');
        solution.Insert('o');
        solution.Insert('o');
        char c = solution.FirstAppearingOnce();
        System.out.println(c);
    }
}
