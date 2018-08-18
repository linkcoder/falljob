package cn.linkai.pointoffer.s16;

public class Solution {

    //头插法
    public ListNode ReverseList(ListNode head) {
        ListNode newLink=new ListNode(-1);

        while(head!=null){
            ListNode next=head.next;
            head.next=newLink.next;
            newLink.next=head;
            head=next;
        }

        return newLink.next;
    }
}
class ListNode {
    int val;
    ListNode next = null;

    ListNode(int val) {
        this.val = val;
    }
}