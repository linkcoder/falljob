package cn.linkai.leetcode.c234;

import java.util.ArrayList;

public class Solution {
    public boolean isPalindrome(ListNode head) {
        ArrayList<Integer> list=new ArrayList();
        while(head!=null){
            list.add(head.val);
            head=head.next;
        }

        for(int i=0,j=list.size()-1;i<=j;i++,j--){
            if(!list.get(i).equals(list.get(j)))
                return false;
        }
        return true;
    }

    public static void main(String[] args) {
        ListNode l1=new ListNode(-129);

        l1.next=new ListNode(-129);

        Solution solution=new Solution();
        System.out.println(solution.isPalindrome(l1));
    }

}
