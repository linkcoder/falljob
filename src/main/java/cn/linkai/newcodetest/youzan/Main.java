package cn.linkai.newcodetest.youzan;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        String input=in.nextLine();

        boolean solution = solution(input);
        System.out.println(solution);
    }

    private static boolean solution(String input) {
        String[] strs=input.split(";");

        if(strs.length<2) return false;

        String aStr=strs[0];
        String bStr=strs[1];

        if(aStr.equals(bStr)) return true;

        for(int i=1,len=aStr.length();i<len;i++){

            String ls=aStr.substring(0,i);
            String rs=aStr.substring(i,len);
            String newStr=rs+ls;
            if(newStr.equals(bStr)) return true;
        }

        return false;
    }
}


