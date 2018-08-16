package cn.linkai.pointoffer.s9;

public class Solution {
    /**
     * n=1 f(1)=1
     * n=2 f(2)=2
     * n>2 f(n)=f(n-1)+f(n-2)
     * @param target
     * @return
     */
    public int JumpFloor(int target) {
        if(target<=2) return target;

        int pre1=1,pre2=2;
        int tmp;
        for(int i=2;i<target;i++){
            tmp=pre2;
            pre2=pre1+pre2;
            pre1=tmp;
        }
        return pre2;
    }
}
