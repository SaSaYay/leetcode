package Code206;

/**
 * @author sasayaya
 * @create 2022/3/10 21:51
 */
class Solution {
    public class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }
    public ListNode reverseList(ListNode head) {
        if (head == null){
            return null;
        }
        if (head.next == null){
            return head;
        }
        ListNode last = reverseList(head.next);

        head.next.next = head;
        head.next = null;
        return last;
//        ListNode pre = null;
//        ListNode cur = head;
//        ListNode temp = null;
//        while (cur!=null){
//            temp = cur.next;
//            cur.next = pre;
//            pre = cur;
//            cur = temp;
//        }
//        return  pre;
//        return  reverse(null, head);
    }
//    private ListNode reverse(ListNode pre, ListNode cur){
//        if (cur==null){
//            return pre;
//        }
//        ListNode temp = cur.next;
//        cur.next = pre;
//
//        return reverse(cur,temp);
//    }
}
