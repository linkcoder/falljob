package cn.linkai.container.collection;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetJDK {

    public static void main(String[] args) {
        Set set1=new HashSet();
        set1.add(null);//可以添加null
        Set set3=new LinkedHashSet();
        set3.add(1);//可以添加null
        Set set2=new TreeSet();
        set2.add(null);//不可以，不可以添加null，抛异常，因为null没有comparable

    }
}
