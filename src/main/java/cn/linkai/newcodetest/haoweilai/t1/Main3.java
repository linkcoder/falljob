package cn.linkai.newcodetest.haoweilai.t1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main3 {

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        List<Integer> arr=new ArrayList<>();
        String[] e1=scanner.nextLine().split(" ");
        for(String e:e1){
            arr.add(Integer.valueOf(e));
        }

        int re=moreHalf(arr);
        System.out.println(re);
    }

    private static int moreHalf(List<Integer> arr) {
        int cnt=1;
        int target = 0;
        for(int num:arr){
            cnt=target==num?cnt+1:cnt-1;
            if(cnt==0){
                target=num;
                cnt=1;
            }
        }

        int cntTarget=0;
        for(int num:arr){
            if(num==target)
                cntTarget++;
        }

        if(cnt>0){
            if(cntTarget>=arr.size()/2){

            }else {
                target=0;
            }
        }else {
            target=0;
        }
        return target;
    }
}
