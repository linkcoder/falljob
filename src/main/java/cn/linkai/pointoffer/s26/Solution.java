package cn.linkai.pointoffer.s26;

public class Solution {

    public RandomListNode Clone(RandomListNode pHead) {

        if(pHead==null) return null;

        RandomListNode cur=pHead;
        while(cur!=null){
            RandomListNode newNode=new RandomListNode(cur.label);
            newNode.next=cur.next;
            cur.next=newNode;
            cur=newNode.next;
        }

        cur=pHead;
        while(cur!=null){
            RandomListNode newNode=cur.next;
            if(cur.random!=null){
                newNode.random=cur.random.next;
            }
            cur=newNode.next;
        }

        cur=pHead;
        RandomListNode newList=cur.next;
        while(cur.next!=null){
            RandomListNode newNode=cur.next;
            cur.next=newNode.next;
            cur=newNode;
        }
        return newList;
    }
}


class RandomListNode {
    int label;
    RandomListNode next = null;
    RandomListNode random = null;

    RandomListNode(int label) {
        this.label = label;
    }
}