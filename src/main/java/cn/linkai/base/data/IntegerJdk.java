package cn.linkai.base.data;

public class IntegerJdk {

    public static void main(String[] args) {
        Integer e1=new Integer(1);
        Integer e2=new Integer(2);

        System.out.println(e1==e2);
        System.out.println(e1==1);

        short e3=1;
//        e3 = e3+2;//编译错误
        e3+=1;//默认转换，编译通过
    }
}
