package cn.linkai.newcodetest.haoweilai.t1;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String str=scanner.nextLine();
        String maxContinueSubStr = getMaxContinueSubStr(str);
        System.out.println(maxContinueSubStr);
    }

    public static String getMaxContinueSubStr(String str){
        if(str==null || str.length()<=1) return str;
        int preIndex=0,fastIndex=1;
        char[] strChar=str.toCharArray();
        int len=str.length();
        String tmp="";

        while(fastIndex<len){
            if(strChar[fastIndex]-strChar[fastIndex-1]==1){
                fastIndex++;
                int newLen=fastIndex-preIndex+1;
                if(newLen>tmp.length()){
                    tmp=str.substring(preIndex, fastIndex);
                }
            }else{

                preIndex=fastIndex;
                fastIndex=fastIndex+1;
            }
        }
        return tmp;
    }
}
