package cn.linkai.leetcode.c27;

public class Solution {

    public int removeElement(int[] nums, int val) {
        if(nums==null || nums.length==0) return 0;

        int index=0;

        for(int i=0;i<nums.length;i++){
            if(nums[i]==val)
                continue;
            nums[index++]=nums[i];
        }
        return index;
    }

    public static void main(String[] args) {
        int[] nums={1,1,2,2,2,6,4,3,22,22};

        Solution solution=new Solution();
        int len=solution.removeElement(nums,22);

        for(int i=0;i<len;i++){
            System.out.print(nums[i]+" ");
        }
    }
}
