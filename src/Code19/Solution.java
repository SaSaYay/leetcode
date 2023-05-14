package Code19;

/**
 * @author sasayaya
 * @create 2022/3/10 23:02
 */
public class Solution {
    public class ListNode {
     int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode dummyNode = new ListNode(0);
        dummyNode.next = head;
        ListNode fast = dummyNode;
        ListNode slow = dummyNode;

        while (n>0){
            fast = fast.next;
            n--;
        }
        ListNode pre = null;
        while (fast!=null){
            pre = slow;
            slow = slow.next;
            fast = fast.next;
        }
        pre.next = slow.next;
        slow.next = null;
        return dummyNode.next;

    }
}
