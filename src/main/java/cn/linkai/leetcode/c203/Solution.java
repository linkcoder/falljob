package cn.linkai.leetcode.c203;

public class Solution {

    public ListNode removeElements(ListNode head, int val) {

        if(head==null) return null;
        ListNode listNode=new ListNode(0);
        ListNode index=listNode;
        ListNode cut=listNode;
        while(head!=null){
            if(head.val!=val){
                index.next=head;
                cut=head;
                index=index.next;
            }
            head=head.next;
        }

        cut.next=null;
        return listNode.next;
    }

    public static void main(String[] args) {
        ListNode node1=new ListNode(1);
        ListNode node2=new ListNode(3);
        ListNode node3=new ListNode(2);
        ListNode node4=new ListNode(3);

        node1.next=node2;
        node2.next=node3;
        node3.next=node4;

        Solution solution=new Solution();
        ListNode node=solution.removeElements(node1,3);

        while(node!=null){
            System.out.print(node.val + " ");
            node=node.next;
        }
    }
}


class ListNode {
    int val;
    ListNode next;
    ListNode(int x) { val = x; }
}