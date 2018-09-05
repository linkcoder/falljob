package cn.linkai.newcodetest.yyA.t2;

public class Solution {

    boolean isAndEqationExist(int[] a){
        if(a==null || a.length==0) return false;
        int key=a[0];
        for(int i=1;i<a.length;i++){
            key&=a[i];
        }

        for(int e:a){
            if(e==key) return true;
        }

        return false;
    }

}
