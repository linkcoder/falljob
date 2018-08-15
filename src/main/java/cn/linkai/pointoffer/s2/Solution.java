package cn.linkai.pointoffer.s2;

public class Solution {

    public boolean Find(int target, int [][] array) {
        if(array==null || array.length==0 || array[0].length==0) return false;

        int i=0;
        int j=array[0].length-1;

        while(i<array.length && j>=0){

            if(target==array[i][j]){
                return true;
            }
            if(target<array[i][j]){
                j--;
            }else{
                i++;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        int[][] nums = {
            {1, 4, 7, 11, 15},
            {2, 5, 8, 12, 19},
            {3, 6, 9, 16, 22},
            {10, 13, 14, 17, 24},
            {18, 21, 23, 26, 30}
        };
        boolean find = solution.Find(20 , nums);
        System.out.println(find);
    }
}
