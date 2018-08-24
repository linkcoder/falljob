package cn.linkai.pointoffer.s38;

public class Solution {

    public int GetNumberOfK(int [] array , int k) {
        if(array==null || array.length==0) return 0;

        int l=0;
        int h=array.length-1;
        int m=0;
        while(l<=h){
            m=(l+h)/2;
            if(array[m]<k){
                l=m+1;
            }else if(array[m]>k){
                h=m-1;
            }else {
                break;
            }
        }
        int cnt=1;
        if(array[m]==k){
            int pre=m-1,next=m+1;
            while(pre>=0 && array[pre--]==k){
                cnt++;
            }
            while(next<array.length && array[next++]==k){
                cnt++;
            }
            return cnt;
        }else{
            return 0;
        }
    }


    public static void main(String[] args) {
        Solution solution=new Solution();
        int re = solution.GetNumberOfK(new int[]{1, 2, 5, 5, 8, 9, 9, 9, 9, 10, 12}, 12);
        System.out.println(re);
    }

}
