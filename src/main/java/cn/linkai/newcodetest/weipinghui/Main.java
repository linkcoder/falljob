package cn.linkai.newcodetest.weipinghui;

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int k = in.nextInt();
        int n = in.nextInt();

        int[][] nums=new int[n][n];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                nums[i][j]=in.nextInt();
            }
        }

        solution(nums,n,k);
    }

    private static void solution(int[][] nums,int n, int k) {
        PriorityQueue<Integer> nNums=new PriorityQueue<>(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2-o1;
            }
        });

        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                nNums.offer(nums[i][j]);

                if(nNums.size()>k) nNums.poll();
            }
        }
        System.out.println(nNums.poll());
    }
}
