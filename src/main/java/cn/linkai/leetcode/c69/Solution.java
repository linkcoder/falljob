package cn.linkai.leetcode.c69;

/**
 * <b><code>Solution</code></b>
 * <p/>
 * Description
 * <p/>
 * <b>Creation Time:</b> 2018/10/19 11:06.
 *
 * @author linkai
 * @since falljob 0.1.0
 */
public class Solution {

    public int mySqrt(int x) {

        long l=0,h=x;

        while(l<=h){
            long mid=l+(h-l)/2;
            if(mid*mid>x) h=mid-1;
            else l=mid+1;
        }
        return (int) (l-1);
    }

    public static void main(String[] args) {
        Solution solution=new Solution();
        int re = solution.mySqrt(2147395599);
        System.out.println(re);
    }
}
