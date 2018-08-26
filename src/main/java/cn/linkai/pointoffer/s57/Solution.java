package cn.linkai.pointoffer.s57;

import java.util.List;
import java.util.TreeMap;
import java.util.TreeSet;

public class Solution {

    public ListNode deleteDuplication(ListNode pHead) {
        if (pHead == null || pHead.next == null)
            return pHead;
        ListNode next = pHead.next;
        if (pHead.val == next.val) {
            while (next != null && pHead.val == next.val)
                next = next.next;
            return deleteDuplication(next);
        } else {
            pHead.next = deleteDuplication(pHead.next);
            return pHead;
        }
    }
}

class ListNode {
    int val;
    ListNode next = null;

    ListNode(int val) {
        this.val = val;
    }
}