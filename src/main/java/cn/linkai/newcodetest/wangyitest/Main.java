package cn.linkai.newcodetest.wangyitest;

import java.util.Scanner;

public class Main {

    public int solution(int x,int f,int d,int p){

        if(d/x<=f) return d/x;

        else {
            d=d-f*x;
            int n=d/(p+x);
            return (n+f);
        }

    }

    public static void main(String[] args) {
        Main in=new Main();
        Scanner scanner=new Scanner(System.in);
        int x=scanner.nextInt();
        int f=scanner.nextInt();
        int d=scanner.nextInt();
        int p=scanner.nextInt();
        int e=in.solution(x,f,d,p);
        System.out.println(e);
    }
}
