package vm;

import java.lang.ref.SoftReference;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;

public class VmTest {

    public static void main(String[] args) {
       // List array=new ArrayList(1000000000);//堆溢出
        SoftReference reference;
        WeakReference weakReference;
        A a=new A();
        a.finalize();
        a=null;

        System.gc();
    }
}

class A extends Object{
    @Override
    public void finalize(){
        System.out.println("finalize");
    }
}
class MyLoad extends ClassLoader{
}