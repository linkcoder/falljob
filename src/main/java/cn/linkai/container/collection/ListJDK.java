package cn.linkai.container.collection;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

public class ListJDK {

    public static void main(String[] args) {
        List arrayList=new ArrayList();
        arrayList.add(null);//可以插入null
        System.out.println(arrayList.get(0));
        List linkList=new LinkedList();
        List vector=new Vector();
    }
}
