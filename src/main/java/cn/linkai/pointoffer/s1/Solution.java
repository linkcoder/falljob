package cn.linkai.pointoffer.s1;

public class Solution {

    public boolean duplicate(int numbers[],int length,int [] duplication) {
        if(numbers==null || numbers.length==0) return false;

        for(int i=0;i<length;i++){

            while(numbers[i]!=i){
                if(numbers[i]==numbers[numbers[i]]){
                    duplication[0]=numbers[i];
                    return true;
                }

                swap(numbers,i,numbers[i]);
            }
        }

        return false;
    }

    private void swap(int[] numbers, int i, int j) {
        int temp=numbers[i];
        numbers[i]=numbers[j];
        numbers[j]=temp;
    }

    public static void main(String[] args) {
        Solution solution=new Solution();
        int[] nums={2,3,1,0,2,5};
        int[] dulipcation=new int[1];
        boolean duplicate = solution.duplicate(nums, nums.length, dulipcation);
        if(duplicate){
            System.out.println(dulipcation[0]);
        }
    }
}
