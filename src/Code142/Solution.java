package Code142;


/**
 * @author sasayaya
 * @create 2022/3/15 13:00
 */
public class Solution {
    class ListNode {
        int val;
        ListNode next;
        ListNode(){}
        ListNode(int val) {
            this.val=val;
        }
    }
    public ListNode detectCycle(ListNode head) {
            ListNode slow = head;
            ListNode fast = head;
            while (fast != null && fast.next != null){//不太懂
                slow = slow.next;
                fast = fast.next.next;
                if (slow==fast){
                    ListNode index1 = fast;
                    ListNode index2 = head;
                    while (index1 != index2){
                        index1 = index1.next;
                        index2 =index2.next;
                    }
                    return index1;
                }
            }
            return null;
    }
}
