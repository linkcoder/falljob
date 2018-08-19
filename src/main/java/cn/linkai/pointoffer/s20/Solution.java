package cn.linkai.pointoffer.s20;

import java.util.ArrayList;

public class Solution {

    public ArrayList<Integer> printMatrix(int [][] matrix) {
        ArrayList<Integer> re=new ArrayList<>();
        int minCol=0,maxCol=matrix[0].length-1;
        int minRow=0,maxRow=matrix.length-1;

        while(minCol<=maxCol && minRow<=maxRow){

            for(int i=minCol;i<=maxCol;i++){
                re.add(matrix[minRow][i]);
            }

            for(int i=minRow+1;i<=maxRow;i++){
                re.add(matrix[i][maxCol]);
            }

            if(minRow!=maxRow){
                for(int i=maxCol-1;i>=minCol;i--){
                    re.add(matrix[maxRow][i]);
                }
            }

            if(minCol!=maxCol){
                for(int i=maxRow-1;i>minRow;i--){
                    re.add(matrix[i][minCol]);
                }
            }
            minCol++; maxCol--;
            minRow++; maxRow--;
        }
        return re;
    }

    public static void main(String[] args) {
        int[][] nums={{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
        Solution solution=new Solution();
        ArrayList<Integer> integers = solution.printMatrix(nums);
        for(int e:integers){
            System.out.println(e);
        }
    }
}
