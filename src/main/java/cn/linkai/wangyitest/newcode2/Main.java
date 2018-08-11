package cn.linkai.wangyitest.newcode2;

import java.util.Scanner;

public class Main {

    public void solution(int n,int[] nums,int m,int[] res){

        for(int i=0;i<n;i++){
           if(i!=0)
            nums[i]=nums[i]+nums[i-1];
        }

        for(int i=0;i<m;i++){

            int h=n-1;
            int l=0;
            int mid=0;
            while(l<=h){
                mid=(l+h)/2;
                if(mid>0 && nums[mid-1]<res[i] && nums[mid]>=res[i]) break;
                else if(nums[mid]>res[i]) h=mid-1;
                else l=mid+1;

            }
            System.out.println(mid+1);
        }

    }

    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);

        int n=in.nextInt();
        int[] nums=new int[n];
        for(int i=0;i<n;i++){
            nums[i]=in.nextInt();
//            System.out.println(nums[i]);
        }

        int m=in.nextInt();
        int[] res=new int[m];
        for(int i=0;i<m;i++){
            res[i]=in.nextInt();
//            System.out.println(res[i]);
        }

        Main main=new Main();
        main.solution(n,nums,m,res);

    }
}
