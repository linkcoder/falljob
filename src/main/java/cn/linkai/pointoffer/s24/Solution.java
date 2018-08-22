package cn.linkai.pointoffer.s24;

public class Solution {

    public boolean VerifySquenceOfBST(int [] sequence) {
        if(sequence.length==0) return false;

        if(sequence.length==1) return true;

        return verify(sequence,0,sequence.length-1);
    }

    public boolean verify(int[] seq,int first,int last){

        if(last-first<=1) return true;//当只有两个的序列，在前在后都是可以的
        int root=seq[last];
        int leftCount=first;
        while(leftCount<last && seq[leftCount]<=root){
            leftCount++;
        }

        for(int i=leftCount+1;i<last;i++){
            if(seq[i] < root) return false;
        }

        return verify(seq,first,leftCount-1) && verify(seq,leftCount,last-1);
    }

    public static void main(String[] args) {
        Solution solution=new Solution();
        boolean re = solution.VerifySquenceOfBST(new int[]{1, 2, 3, 6, 0, 4});
        System.out.println(re);
    }
}
