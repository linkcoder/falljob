package cn.linkai.pointoffer.s11;

public class Solution {

    public int RectCover(int target) {
        if(target<=2) return target;

        int pre1=1,pre2=2;
        int result = 0;
        for(int i=2;i<target;i++){
            result=pre1+pre2;
            pre1=pre2;
            pre2=result;
        }
        return result;
    }

    public static void main(String[] args) {
        Solution solution=new Solution();
        int re = solution.RectCover(4);
        System.out.println(re);
    }
}
