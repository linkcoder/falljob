package cn.linkai.newcodetest.huya;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main3 {

    static class MyObject{
        int id;
        int score;

        public MyObject(int id,int score){
            this.id=id;
            this.score=score;
        }

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public int getScore() {
            return score;
        }

        public void setScore(int score) {
            this.score = score;
        }

        @Override
        public String toString() {
            return "{"+id+":"+score+"}";
        }
    }

    public static void sort(MyObject[] a){
        boolean hasSwap=true;

        for(int i=0;i<a.length && hasSwap;i++){
            hasSwap=false;

            for(int j=0;j<a.length-i-1;j++){
                if(a[j].getScore()>a[j+1].getScore()){
                    swap(a[j],a[j+1]);
                    hasSwap=true;
                }
            }

        }

        List<MyObject> list=new ArrayList<>();
        for(int i=0;i<a.length;i++){
            list.add(a[i]);
        }

        System.out.print("Result: ");
        System.out.println(list);
    }

    private static void swap(MyObject v1, MyObject v2) {
        int v1ID=v1.getId();
        int v1Score=v1.getScore();

        v1.setId(v2.getId());
        v1.setScore(v2.getScore());

        v2.setId(v1ID);
        v2.setScore(v1Score);
    }


    public static MyObject[] parseSampleInput(){
        Scanner in=new Scanner(System.in);
        List<MyObject> inList=new ArrayList<>();

        while(in.hasNextInt()){
            int id=in.nextInt();
            int score=in.nextInt();
            inList.add(new MyObject(id,score));
        }

        MyObject[] a=new MyObject[inList.size()];
        return inList.toArray(a);
    }

    public static void main(String[] args) {
        MyObject[] a=parseSampleInput();
        sort(a);
    }
}
