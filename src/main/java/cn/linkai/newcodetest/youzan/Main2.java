package cn.linkai.newcodetest.youzan;

import java.util.Scanner;

public class Main2 {

    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        String line=in.nextLine();

        String l1=line.replace("[","");
        String l2=l1.replace("]","");
        String[] strs=l2.split(",");

        int[] nums=new int[strs.length];
        for(int i=0,len=strs.length;i<len;i++){
            nums[i]=Integer.parseInt(strs[i]);
        }

        boolean solution = solution(nums);
        System.out.println(solution);
    }

    private static boolean solution(int[] nums) {
        int len=nums.length;
        boolean[] booleans=new boolean[len];
        boolean flag=true;
        for(int i=0;i<len;i++){
            flag=nums[i]>0?true:false;
            if(nums[i]+i>=len || nums[i]+i<0){
                return true;
            }
            else{
                if(booleans[i]&&flag) return false;
                else {
                        i=i+nums[i];
                        booleans[i]=true;
                    }
            }

        }
        return true;
    }
}
