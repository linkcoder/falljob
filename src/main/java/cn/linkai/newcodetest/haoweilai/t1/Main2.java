package cn.linkai.newcodetest.haoweilai.t1;

import java.util.*;

public class Main2 {

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        List<Integer> arr=new ArrayList<>();
        String[] e1=scanner.nextLine().split(" ");
        for(String e:e1){
            arr.add(Integer.valueOf(e));
        }
        int[] arr2=new int[arr.size()-1];
        int minK=arr.get(arr.size()-1);

        for(int i=0;i<arr.size()-1;i++){
            arr2[i]=arr.get(i);
        }
        int[] re=finMinN(arr2,minK);

        StringBuilder builder=new StringBuilder();
        for(int k=0;k<re.length;k++){
            builder.append(re[k]+" ");
        }
        builder.deleteCharAt(builder.length()-1);
        System.out.println(builder.toString());
    }

    private static int[] finMinN(int[] toArray, int minK) {

        PriorityQueue<Integer> minKQ=new PriorityQueue<>((o1, o2) -> o2-o1);

        for(int e:toArray){
            minKQ.offer(e);
            if(minKQ.size()>minK){
                minKQ.poll();
            }
        }

        int[] re=new int[minK];
        for(int i=re.length-1;i>=0;i--){
            re[i]=minKQ.poll();
        }

        return re;
    }
}
