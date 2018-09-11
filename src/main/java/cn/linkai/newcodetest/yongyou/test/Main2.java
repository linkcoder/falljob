package cn.linkai.newcodetest.yongyou.test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main2 {

    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        List<Integer> items=new ArrayList<>();
        String string=in.nextLine();

        String[] res=string.split(" ");

        for(String e:res){
            items.add(Integer.parseInt(e));
        }

        solution(items);
    }

    private static void solution(List<Integer> items) {
        List<Integer> newItem= new ArrayList<>();
        Collections.copy(newItem,items);
        for(int i=1;i<items.size();i++){
            items.set(i,items.get(i)-items.get(i-1));
        }
        int cnt=0;
        for(int i=0;i<items.size();i++){

            if(items.get(i)==1){
                cnt++;
            }else{
                cnt=1;
            }
        }


    }
}
