package cn.linkai.leetcode.c2;

public class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode dummyHead = new ListNode(0);
        ListNode p = l1, q = l2, curr = dummyHead;
        int carry = 0;
        while (p != null || q != null) {
            int x = (p != null) ? p.val : 0;
            int y = (q != null) ? q.val : 0;
            int sum = carry + x + y;
            carry = sum / 10;
            curr.next = new ListNode(sum % 10);//这一步才赋值
            curr = curr.next;
            if (p != null) p = p.next;
            if (q != null) q = q.next;
        }
        if (carry > 0) {
            curr.next = new ListNode(carry);
        }
        return dummyHead.next;
    }

    public static void main(String[] args) {
        ListNode l1=new ListNode(2);
        ListNode l2=new ListNode(5);

        l1.next=new ListNode(4);
        l1.next.next=new ListNode(3);
        l2.next=new ListNode(6);
        l2.next.next=new ListNode(4);

        Solution solution=new Solution();
        ListNode e=solution.addTwoNumbers(l1,l2);
        while(e!=null){
            System.out.println(e.val);
            e=e.next;
        }

    }
}
