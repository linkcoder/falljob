package cn.linkai.base.string;

import org.junit.Test;

public class StringJdk {

    public static void main(String[] args) {
        String j="hello";
        String k="hello";
        System.out.println(j==k);//true
        String x=new String("helloe");
        String y=new String("helloe");
        System.out.println(x==y);//false
        x.intern();
        String t="helloe";
        System.out.println(x==t);//false
        System.out.println(x.intern()==t);//引用;

        String l=new String("hello")+new String("haha");

        String l2="hellohaha";
        String l3="hello"+"haha";
        l.intern();
        System.out.println(l==l2);//true
        System.out.println(l==l3);
        System.out.println(l2==l3);
    }

    protected class hello{

    }

    @Test
    public void test(){
        String s = new String("1");
        s.intern();
        String s2 = "1";
        System.out.println(s == s2);

        String s3 = new String("1") + new String("1");
        s3.intern();
        String s4 = "11";
        System.out.println(s3 == s4);
    }
}
