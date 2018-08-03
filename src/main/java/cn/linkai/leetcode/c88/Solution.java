package cn.linkai.leetcode.c88;

import java.util.ArrayList;
import java.util.List;

public class Solution {

    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int i=0,j=0;

        List<Integer> re=new ArrayList<>();

        for(int k=0;i<m && j<n ;k++){
            if(nums1[i]<=nums2[j]){
                re.add(nums1[i]);
                i++;
            }else{
                re.add(nums2[j]);
                j++;
            }
        }

        if(i==m){
            for(;j<n;j++){
                re.add(nums2[j]);
            }
        }

        if(j==n){
            for(;i<m;i++){
                re.add(nums1[i]);
            }
        }

        for(int t=0;t<n+m;t++){
            nums1[t]=re.get(t);
        }
    }

    public static void main(String[] args) {
        Solution solution=new Solution();
        int[] a1=new int[5];
        int[] a2=new int[3];
        for(int i=1;i<3;i++){
            a1[i-1]=i;
            a2[i-1]=i;
        }

        solution.merge(a1,2,a2,3);

        for(int i=0;i<5;i++){
            System.out.println(a1[i]);
        }
    }
}
