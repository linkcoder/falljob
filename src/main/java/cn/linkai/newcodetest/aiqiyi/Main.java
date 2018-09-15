package cn.linkai.newcodetest.aiqiyi;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        String line=in.nextLine();

        int re=solution(line);
        System.out.println(re);
    }

    private static int solution(String line) {
        if(line==null || line.length()!=6) return 0;

        String sub1=line.substring(0,3);
        String sub2=line.substring(3,6);

        int sum1=0,sum2=0;
        int[] bits=new int[3];
        for(int i=0;i<3;i++){
            sum1+=sub1.charAt(i)-'0';
            sum2+=sub2.charAt(i)-'0';
            bits[i]=sub1.charAt(i)-sub2.charAt(i);
        }

        if(sum1==sum2) return 0;
        else {
            int cha=0;
            for(int x:bits){
                cha+=x;
            }
            cha=Math.abs(cha);
            int cnt=1;
            while (cha%9!=0){
                cnt++;
                cha=(cha-9)<=0?0:(cha-9);
            }
            return cnt;
        }
    }
}
