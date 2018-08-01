package cn.linkai.leetcode.c24;

public class Solution {

    public ListNode swapPairs(ListNode head) {
        if(head==null || head.next==null)
            return head;

        ListNode temp=head.next;
        head.next=swapPairs(temp.next);
        temp.next=head;
        return temp;

    }

    public static void main(String[] args) {
        ListNode node1=new ListNode(1);
        ListNode node2=new ListNode(2);
        ListNode node3=new ListNode(3);
        ListNode node4=new ListNode(4);

        node1.next=node2;
        node2.next=node3;
        node3.next=node4;

        Solution solution=new Solution();
        ListNode result=solution.swapPairs(node1);

        while(result!=null){
            System.out.println(result.val);
            result=result.next;
        }
    }
}
