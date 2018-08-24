package cn.linkai.pointoffer.s33;

import java.util.Arrays;
import java.util.Comparator;

public class Solution {

    public String PrintMinNumber(int [] numbers) {
        if(numbers==null || numbers.length==0) return "";

        String[] nums=new String[numbers.length];
        for(int i=0;i<numbers.length;i++){
            nums[i]=numbers[i]+"";
        }

        Arrays.sort(nums, new Comparator<String>() {
                    @Override
                    public int compare(String s1, String s2) {
                        return (s1+s2).compareTo(s2+s1);
                    }
                }
        );

        StringBuilder builder=new StringBuilder();
        for(String e:nums){
            builder.append(e);
        }
        return builder.toString();
    }

    public static void main(String[] args) {
        Solution solution=new Solution();
        String re = solution.PrintMinNumber(new int[]{3, 32, 321});
        System.out.println(re);
    }
}
