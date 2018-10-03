package cn.linkai.newcodetest.tengxun;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {

    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);

        int N=in.nextInt();

        int re=solution(N);
        System.out.println(re);
    }

    private static int solution(int n) {
        int m=n+1;
        Set<Integer> s1=new HashSet<>();
        Set<Integer> s2=new HashSet<>();

        while(true){

            for(int i=n+1;i<=m;i++){
                option(i,s1);
            }

            for(int j=1;j<=m;j++){
                option(j,s2);
            }

            if(s1.equals(s2)) {
                return m;
            }
            m=m+1;
        }
    }

    private static void option(int i, Set<Integer> s) {
        boolean flag=true;

        while(flag){

            if(i%2==0){
               s.add(2);
               i=i/2;
               continue;
            }

            if(i%3==0){
                s.add(3);
                i=i/3;
                continue;
            }

            if(i%5==0){
                s.add(5);
                i=i/5;
                continue;
            }

            if(i%7==0){
                s.add(7);
                i=i/7;
                continue;
            }

            if(i%11==0){
                s.add(11);
                i=i/11;
                continue;
            }

            if(i%13==0){
                s.add(13);
                i=i/13;
                continue;
            }

            if(i%17==0){
                s.add(17);
                i=i/17;
                continue;
            }

            if(i%19==0){
                s.add(19);
                i=i/19;
                continue;
            }

            if(i%23==0){
                s.add(23);
                i=i/23;
                continue;
            }

            flag=false;
        }

        s.add(i);
    }


}
