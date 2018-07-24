package leetcode.c11;

public class Solution {
    public int maxArea(int[] height) {
        int maxArea=0,p_index=0,l_index=height.length-1;
        while(p_index<l_index){
            maxArea=Math.max(maxArea,Math.min(height[p_index],height[l_index])*(l_index-p_index));
            if(height[p_index]<height[l_index]){
                p_index++;
            }else{
                l_index--;
            }
        }
        return maxArea;
    }

    public static void main(String[] args) {
        int[] height={1,8,6,2,5,4,8,3,7};
        Solution solution=new Solution();
        System.out.println(solution.maxArea(height));
    }
}
