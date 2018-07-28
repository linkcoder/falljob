package base.datatype;

import java.util.Comparator;

public class Cachepool {

    public static void main(String[] args) {
        Integer x = new Integer(123);
        Integer y = new Integer(123);
        System.out.println(x == y);    // false
        Integer z = Integer.valueOf(1222);
        Integer k = Integer.valueOf(1222);
        System.out.println(z == k);   //true
//      Boolean.valueOf()
//      Byte.valueOf()
//        String
//        StringBuilder
//        StringBuffer

//        Object
//        Comparator
    }

}
