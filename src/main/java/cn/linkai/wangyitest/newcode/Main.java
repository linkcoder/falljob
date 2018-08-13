package cn.linkai.wangyitest.newcode;

import java.util.Scanner;

public class Main {

    public int Solution(int n,int k,int[] scores,int [] sleep){

        int max=0;
        int fo1=0;
        for(int i=0;i<n;i++){
            if(sleep[i]==0){
                int tmp=0;
                for(int j=0;j<k && (i+j)<n;j++){
//                    System.out.println(i+j);
                    if(sleep[i+j]==0){
                        tmp+=scores[i+j];
                    }
//                    System.out.println("tmp:"+tmp);
                }
                if(tmp>max) max=tmp;
            }else{
                fo1+=scores[i];
            }
        }

        return max+fo1;
    }

    public static void main(String[] args) {
        Main main=new Main();
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        int k=in.nextInt();
        int[] scores=new int[n];
        int[] sleep=new int[n];

        for(int i=0;i<n;i++){
            scores[i]=in.nextInt();
        }

        for(int i=0;i<n;i++){
            sleep[i]=in.nextInt();
//            System.out.println(sleep[i]);
        }

        int re=main.Solution(n,k,scores,sleep);
        System.out.println(re);
    }
}
