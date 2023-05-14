package Code24;

/**
 * @author sasayaya
 * @create 2022/3/10 22:33
 */
class Solution {


     public class ListNode {
          int val;
         ListNode next;
          ListNode() {}
          ListNode(int val) { this.val = val; }
          ListNode(int val, ListNode next) { this.val = val; this.next = next; }
      }

    public ListNode swapPairs(ListNode head) {
         ListNode dummyCode = new ListNode(0);
         dummyCode.next = head;
         ListNode pre = dummyCode;
         while (pre.next!=null && pre.next.next!=null){
             ListNode temp = head.next.next;
             pre.next = head.next;
             head.next.next = head;
             head.next = temp;
             pre =head;
             head = temp;
         }

         return dummyCode.next;
//         if (head == null || head.next == null){
//             return head;
//         }
//
//         ListNode next = head.next;
//         ListNode newCode = swapPairs(next.next);
//         next.next = head;
//         head.next = newCode;
//         return next;

    }
}
