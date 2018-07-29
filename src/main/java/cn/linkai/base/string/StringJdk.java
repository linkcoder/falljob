package cn.linkai.base.string;

public class StringJdk {

    public static void main(String[] args) {
        String j="hello";
        String k="hello";
        System.out.println(j==k);//true
        String x=new String("hello");
        String y=new String("hello");
        System.out.println(x==y);//false
        x.intern();
        String t="hello";
        System.out.println(x==t);//false
        System.out.println(x.intern()==t);//引用;

        String l=new String("hello")+new String("haha");
        l.intern();
        String l2="hellohaha";
        System.out.println(l==l2);//true
    }
}
