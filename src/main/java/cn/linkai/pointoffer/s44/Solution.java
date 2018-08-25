package cn.linkai.pointoffer.s44;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.function.Consumer;

public class Solution {

    public ArrayList<Integer> FindNumbersWithSum(int [] array, int sum) {

        int l=0;
        int h=array.length-1;
        while(l<h){

            if(array[l]+array[h]==sum){
                break;
            }else if(array[l]+array[h]<sum){
                l++;
            }else {
                h--;
            }
        }

        if(l<h){
            return new ArrayList<>(Arrays.asList(array[l],array[h]));
        }else{
            return new ArrayList<>();
        }
    }


    public static void main(String[] args) {
        Solution solution=new Solution();
        int[] nums={2,3,50,50,2450,2498,2499};
        ArrayList<Integer> re = solution.FindNumbersWithSum(nums, 2500);
        re.forEach(new Consumer<Integer>() {
            @Override
            public void accept(Integer v) {
                System.out.println(v);
            }
        });
    }
}
