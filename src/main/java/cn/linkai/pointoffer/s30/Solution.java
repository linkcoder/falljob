package cn.linkai.pointoffer.s30;

import java.util.ArrayList;

public class Solution {

    public ArrayList<Integer> GetLeastNumbers_Solution(int [] input, int k) {
        ArrayList<Integer> result=new ArrayList<>();
        if (k > input.length || k <= 0)
            return result;
        findSmallestK(input,k-1);

        for(int i=0;i<k;i++){
            result.add(input[i]);
        }
        return result;
    }

    private void findSmallestK(int[] input, int k) {
        int l=0;int h=input.length-1;

        while(l<h){
            int cut=patition(input,l,h);

            if(cut==k) break;
            if(cut>k) h=cut-1;
            else l=cut+1;
        }
    }

    private int patition(int[] nums,int l,int h){

        while(l<h){
            while(l<h && nums[l]<=nums[h]){
                h--;
            }
            if(l<h){
                swap(nums,l,h);
            }
            while (l<h && nums[l]<=nums[h]){
                l++;
            }
            if(l<h){
                swap(nums,l,h);
            }
        }
        return l;
    }

    private void swap(int[] a, int i, int j) {
        int t = a[i];
        a[i] = a[j];
        a[j] = t;
    }
}
