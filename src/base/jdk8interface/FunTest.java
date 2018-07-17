package base.jdk8interface;

public class FunTest {

    public static void main(String[] args) {
        Face f1=new Func1();
        Face f2=new Fun2();

        f1.fun1();
        f1.fun2();

        f2.fun1();
        f2.fun2();
    }
}
