package cn.linkai.leetcode.c134;

public class Solution {

    public int canCompleteCircuit(int[] gas, int[] cost) {

        int less,i,j,count;

        int len=gas.length==cost.length?gas.length:0;

        for(i=0;i<len;i++){
            less=0;
            count=0;
            for(j=i;count<len;j++){
                less=less+gas[j%len];
                if(less>=cost[j%len]){
                    count++;
                    less=less-cost[j%len];
                    continue;
                }
                break;
            }

            if(count==len) return i;
        }
        return -1;
    }

    public static void main(String[] args) {
        Solution solution=new Solution();
        int[] gas={1,2,3,4,5};
        int[] costs={3,4,5,1,2};
        System.out.println(solution.canCompleteCircuit(gas,costs));
    }
}
