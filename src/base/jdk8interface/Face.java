package base.jdk8interface;

public interface Face {

    public static final int x=1;
    public int y=2;

    public void fun1();

    default void fun2(){
        System.out.println("func2");
    }
}
