package cn.linkai.pointoffer.s17;

public class Solution {

    public ListNode Merge(ListNode list1,ListNode list2) {
        if(list1==null) return list2;
        if(list2==null) return list1;

        ListNode newLink=new ListNode(-1);
        ListNode index=newLink;
        while(list1!=null && list2!=null){
            if(list1.val<=list2.val){
                index.next=list1;
                list1=list1.next;
                index=index.next;
            }else{
                index.next=list2;
                list2=list2.next;
                index=index.next;
            }
        }
        if(list1==null){
            index.next=list2;
        }else {
            index.next=list1;
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