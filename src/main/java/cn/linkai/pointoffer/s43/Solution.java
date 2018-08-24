package cn.linkai.pointoffer.s43;

import java.util.ArrayList;

public class Solution {

    public ArrayList<ArrayList<Integer>> FindContinuousSequence(int sum) {

        ArrayList<ArrayList<Integer>> results=new ArrayList<>();

        int start=1,end=2;
        int cursum=3;

        while(end< sum){
            if(cursum>sum){
                cursum-=start;
                start++;
            }else if(cursum< sum){
                end++;
                cursum+=end;
            }else {
                ArrayList<Integer> result=new ArrayList<>();
                for(int i=start;i<=end;i++){
                    result.add(i);
                }
                results.add(result);
                cursum-=start;
                start++;
                end++;
                cursum+=end;
            }
        }

        return results;
    }

    public static void main(String[] args) {
        Solution solution=new Solution();
        ArrayList<ArrayList<Integer>> arrayLists = solution.FindContinuousSequence(100);
        for(ArrayList<Integer> e:arrayLists){
            System.out.println(e);
        }
    }
}
