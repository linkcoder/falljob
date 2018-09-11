package cn.linkai.newcodetest.huya;

import java.util.HashMap;
import java.util.Scanner;

public class Main2 {

    private static HashMap<Integer,Integer> numsMap=new HashMap<>();

    static {
        numsMap.put(1,5);
        numsMap.put(2,3);
        numsMap.put(3,1);
        numsMap.put(4,2);
        numsMap.put(5,4);
    }

    public static void encode(int[] a){
        if(a==null || a.length==0) return;

        StringBuilder result=new StringBuilder();
        for(int i=0;i<a.length;i++){
            result.append(numsMap.get(a[i]));
        }
        System.out.println(result.toString());
    }

    public static int[] parseSampleInput(){
        Scanner in=new Scanner(System.in);
        if(in.hasNext()){
            String[] t1=in.nextLine().split(" ");
            int[] t2=new int[t1.length];
            for(int i=0;i<t1.length;i++){
                t2[i]=Integer.parseInt(t1[i]);
            }
            return t2;
        }

        return null;
    }

    public static void main(String[] args) {
        int[] a=parseSampleInput();
        encode(a);
    }
}
