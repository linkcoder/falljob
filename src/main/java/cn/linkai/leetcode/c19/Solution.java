package cn.linkai.leetcode.c19;

public class Solution {


    public ListNode removeNthFromEnd(ListNode head, int n) {

        if(head==null) return null;

        ListNode p_index;
        ListNode l_index;
        p_index=l_index=head;

        for(int i=0;i<n;i++){
            l_index=l_index.next;
        }

        if(l_index==null) return head.next;//特殊，删除第一个元素

        while(l_index.next!=null){
            p_index=p_index.next;
            l_index=l_index.next;
        }

        p_index.next=p_index.next.next;

        return head;
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
        ListNode result=solution.removeNthFromEnd(node1,4);
        while(result!=null){
            System.out.print(result.val+ " ");
            result=result.next;
        }
    }

}

class ListNode {
    int val;
    ListNode next;
    ListNode(int x) { val = x; }
}
