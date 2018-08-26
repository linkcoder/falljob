package cn.linkai.pointoffer.s56;

public class Solution {

    public ListNode EntryNodeOfLoop(ListNode pHead) {
        if(pHead==null || pHead.next==null) return null;

        ListNode slow=pHead,fast=pHead;

        do{
            fast=fast.next.next;
            slow=slow.next;
        }while(fast!=slow);

        fast=pHead;
        while(fast!=slow){
            fast=fast.next;
            slow=slow.next;
        }

        return slow;
    }
}

class ListNode {
    int val;
    ListNode next = null;

    ListNode(int val) {
        this.val = val;
    }
}