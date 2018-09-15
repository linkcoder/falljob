package cn.linkai.newcodetest.aiqiyi;

import java.util.*;

public class Mian2 {

    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);

        String line1=in.nextLine();
        String[] arg=line1.split(" ");
        int N=Integer.parseInt(arg[0]);
        int M=Integer.parseInt(arg[1]);
        int P=Integer.parseInt(arg[2]);

        int[] ns=new int[N];
        int ai=0;
        while(ai<N){
            ns[ai]=in.nextInt();
            ai++;
        }
        int mi=0;
        while(mi<M){
            String op=in.next();
            int ni=in.nextInt();
            if("A".equals(op)){
                ns[ni-1]=ns[ni-1]+1;
            }else if("B".equals(op)){
                ns[ni-1]=ns[ni-1]-1;
            }
            mi++;
        }

        solution(ns,P);
    }

    private static void solution(int[] ns,int P) {

        int v=ns[P-1];

        Arrays.sort(ns);

        List<Integer>  re=new ArrayList<>();
        for(int v2:ns){
            re.add(v2);
        }

        Collections.reverse(re);

        for(int i=0;i<re.size();i++){
            if(re.get(i)==v) System.out.println(i+1);
        }
    }
}
