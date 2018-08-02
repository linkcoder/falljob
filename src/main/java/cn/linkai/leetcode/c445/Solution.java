package cn.linkai.leetcode.c445;

import java.util.Stack;

public class Solution {

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {

        Stack<Integer> l1Stack = loadData(l1);
        Stack<Integer> l2Stack = loadData(l2);
        ListNode head = new ListNode(-1);
        int carry = 0;
        while (!l1Stack.isEmpty() || !l2Stack.isEmpty() || carry != 0) {
            int x = l1Stack.isEmpty() ? 0 : l1Stack.pop();
            int y = l2Stack.isEmpty() ? 0 : l2Stack.pop();
            int sum = x + y + carry;
            ListNode node = new ListNode(sum % 10);
            node.next = head.next;
            head.next = node;
            carry = sum / 10;
        }
        return head.next;
    }


    private Stack<Integer> loadData(ListNode list){
        Stack<Integer> data=new Stack<>();
        while (list!=null){
            data.push(list.val);
            list=list.next;
        }
        return data;
    }

    public static void main(String[] args) {
        Solution solution=new Solution();

        ListNode node11=new ListNode(5);
//        ListNode node12=new ListNode(2);
//        ListNode node13=new ListNode(6);
//        ListNode node14=new ListNode(4);

//        node11.next=node12;
//        node12.next=node13;
//        node13.next=node14;

        ListNode node21=new ListNode(5);
//        ListNode node22=new ListNode(2);
//        ListNode node23=new ListNode(3);
//        ListNode node24=new ListNode(4);

//        node21.next=node22;
//        node22.next=node23;
//        node23.next=node24;


        ListNode l=solution.addTwoNumbers(node11,node21);

        while(l!=null){
            System.out.print(l.val);
            l=l.next;
        }
    }
}

class ListNode {
    int val;
    ListNode next;
    ListNode(int x) { val = x; }
}
