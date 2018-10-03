package cn.linkai.newcodetest.xiaomi;

import java.util.*;

public class Main {

    public static void main(String[] args) {

        Scanner in=new Scanner(System.in);
        int n=Integer.parseInt(in.nextLine());
        List<String> ins=new ArrayList<>();
        for(int i=0;i<n;i++){
            ins.add(in.nextLine());
        }

        List<Set<Integer>> inputs=new ArrayList<>();
        for(String es:ins){
            String[] s=es.split(" ");
            Set<Integer> inS=new HashSet<>();
            for(String v:s){
                inS.add(Integer.parseInt(v));
            }
            inputs.add(inS);
        }
        solution(inputs);
    }

    private static void solution(List<Set<Integer>> inputs) {
        int size=inputs.size();
        for(int i=0;i<inputs.size();i++){
            Set<Integer> s1=inputs.get(i);
            for(int j=i+1;j<inputs.size();j++){
                boolean isunit=check(s1,inputs.get(j));
                if(isunit){
                    size--;
                    unit(s1,inputs.get(j));
                    inputs.remove(j);
                }
            }
        }
        int sSize=0;
        for(Set<Integer> v:inputs){
            sSize=Math.max(sSize,v.size());
        }

        System.out.println(size);
        System.out.println(sSize);
    }

    private static void unit(Set<Integer> s1, Set<Integer> integers) {
        s1.addAll(integers);
    }

    private static boolean check(Set<Integer> s1, Set<Integer> integers) {
        for(int v:integers){
            boolean contains = s1.contains(v);
            if(contains) return true;
        }
        return false;
    }
}
