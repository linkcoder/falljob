package cn.linkai.newcodetest.weipinghui;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main2 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str=in.nextLine();
        String[] strs=str.split(" ");

        if(strs.length!=2) System.exit(0);

        String str1=strs[0];
        String str2=strs[1];

        solution(str1,str2);
    }

    private static void solution(String str1, String str2) {
        Integer in1=Integer.parseInt(str1,2);
        Integer in2=Integer.parseInt(str2,2);

        Integer result=in1+in2;
        List<Integer> re=new ArrayList<>();
        while (result!=0){
            re.add(result%2);
            result/=2;
        }
        Collections.reverse(re);
        for(int v:re){
            System.out.print(v);
        }
    }
}
