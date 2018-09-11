package cn.linkai.newcodetest.yongyou.test;

import java.util.*;

public class Main1 {

    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        List<String> items=new ArrayList<>();
        String string=in.nextLine();

        String[] res=string.split(" ");

        for(String e:res){
            items.add(e);
        }

        solution(items);
    }

    private static void solution(List<String> items) {
        if(items.size()==0) return;
        items.sort(Comparator.naturalOrder());
        ArrayList<String> results=new ArrayList<>();
        for (String item : items) {
            if (item.length() % 2 != 0) continue;
            if (item.length() > 2 && results.contains(item.substring(0, item.length() - 2))) {
                int tabL = item.length() / 2 - 1;
                String s = newString(item, tabL);
                results.add(s);
            } else if (item.length() == 2) {
                results.add(item);
            }

        }

        printResult(results);

    }

    private static void printResult(ArrayList<String> results) {
        for(String e:results){
            System.out.println(e);
        }
    }

    private static String newString(String e,int tab){
        StringBuilder re=new StringBuilder();
        for(int i=0;i<tab;i++){
            re.append("\t");
        }
        re.append(e);
        return re.toString();
    }

}
