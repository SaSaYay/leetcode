package code0205;


class ListNode {
    int val;
    ListNode next;
    ListNode(int x) { val = x; }
}

class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        if (l1 == null || l2 == null){
            return l1 == null? l1:l1;
        }
        ListNode d1 = new ListNode(-1);
        d1.next = l1;
        ListNode d2 = new ListNode(-1);
        d2.next = l2;
        ListNode cur1 = d1;
        ListNode cur2 = d2;
        int up = 0;
        while (cur1.next!=null&&cur2.next!=null){
            int sum = cur1.next.val + cur2.next.val + up;
            cur1.next.val = sum%10;
            up = sum/10;
            cur1 = cur1.next;
            cur2 = cur2.next;
        }
        if (cur2.next != null){
            cur1.next = cur2.next;
        }
        while (up>0&&cur1.next != null){
            int sum = cur1.next.val + up;
            cur1.next.val = sum%10;
            up = sum/10;
            cur1 = cur1.next;
        }

        if (up > 0) {
            cur1.next = new ListNode(up);
        }

        return d1.next;

    }
}