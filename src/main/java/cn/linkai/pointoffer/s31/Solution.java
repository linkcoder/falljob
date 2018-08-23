package cn.linkai.pointoffer.s31;

public class Solution {

    public int FindGreatestSumOfSubArray(int[] array) {

        int greatest=Integer.MIN_VALUE;
        int sum=0;
        for(int e:array){
            sum=sum<=0?e:sum+e;
            greatest=Math.max(greatest,sum);
        }
        return greatest;
    }

    public static void main(String[] args) {
        Solution solution=new Solution();
        int re = solution.FindGreatestSumOfSubArray(new int[]{6, -3, -2, 7, -15, 1, 2, 2});
        System.out.println(re);
    }
}
