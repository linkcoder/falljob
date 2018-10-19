package cn.linkai.leetcode.c881;

import java.util.Arrays;

/**
 * <b><code>Solution</code></b>
 * <p/>
 * Description
 * <p/>
 * <b>Creation Time:</b> 2018/10/19 9:41.
 *
 * @author linkai
 * @since falljob 0.1.0
 */
public class Solution {

    public int numRescueBoats(int[] people, int limit) {
        if(people==null || people.length==0) return 0;
        if(people.length==1) return 1;

        Arrays.sort(people);
        int i=0,j=people.length-1;
        int count=0;
        while(i<=j){
            count++;
            if(people[i]+people[j]<=limit)
                i++;
            j--;
        }
        return count;
    }

    public static void main(String[] args) {
        Solution solution=new Solution();
        int[] people=new int[]{3,2,2,1};
        int re = solution.numRescueBoats(people, 3);
        System.out.println(re);
    }
}
