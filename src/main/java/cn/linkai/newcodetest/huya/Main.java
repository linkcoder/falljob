package cn.linkai.newcodetest.huya;

import java.util.Scanner;
import java.util.Stack;

public class Main {

    public static void order(String[] a){

        if(a==null || a.length==0) {
            System.out.println("");
            return;
        }

        int len=a.length;
        Stack<Integer> nodes=new Stack<>();
        StringBuilder builder=new StringBuilder();

        nodes.push(0);

        while(!nodes.isEmpty()){
            int nodeIndex=nodes.pop();

            String nodeVal=a[nodeIndex];
            if(!nodeVal.equals("#"))
                builder.append(nodeVal);

            int leftChil=2*nodeIndex+1;
            int rightChil=2*nodeIndex+2;

            if(rightChil<len){
                nodes.push(rightChil);
            }
            if(leftChil<len){
                nodes.push(leftChil);
            }
        }

        System.out.println(builder.toString());
    }

    public static String[] parseSampleInput(){
        Scanner in=new Scanner(System.in);
        if(in.hasNext()){
            return in.nextLine().split(" ");
        }

        return null;
    }

    public static void main(String[] args) {
        String[] a=parseSampleInput();
        order(a);
    }
}
