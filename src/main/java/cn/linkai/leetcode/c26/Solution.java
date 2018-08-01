package cn.linkai.leetcode.c26;

public class Solution {

    public int removeDuplicates(int[] nums) {
        if(nums==null || nums.length==0) return 0;

        int index=1;
        int tmp=nums[0];

        for(int i=1;i<nums.length;i++){
            if(nums[i]==tmp)
                continue;

            nums[index++]=nums[i];
            tmp=nums[i];
        }

        return index;
    }

    public static void main(String[] args) {
        int[] nums={1,1,2,2,2,6,4,3,22,22};

        Solution solution=new Solution();
        int len=solution.removeDuplicates(nums);

        for(int i=0;i<len;i++){
            System.out.print(nums[i]+" ");
        }
    }
}
