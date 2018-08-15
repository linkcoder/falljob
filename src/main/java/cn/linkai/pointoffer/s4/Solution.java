package cn.linkai.pointoffer.s4;

import java.util.ArrayList;
import java.util.Collections;

public class Solution {

    public ArrayList<Integer> printListFromTailToHead(ListNode listNode) {
        ArrayList<Integer> re=new ArrayList<>();
        while(listNode!=null){
            re.add(listNode.val);
            listNode=listNode.next;
        }
        Collections.reverse(re);
        return re;
    }

}

class ListNode {
    int val;
    ListNode next = null;


    ListNode(int val) {
    this.val = val;
    }
}