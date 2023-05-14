package Code207;

/**
 * @author sasayaya
 * @create 2022/3/10 20:38
 */

class Solution {
    public class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }
    public ListNode removeElements(ListNode head, int val) {
         ListNode dummyNode = new ListNode(-1,head);
         ListNode pre = dummyNode;


         while (pre.next!=null){
             if (pre.next.val==val){
                 ListNode delNode = pre.next;
                 pre.next=delNode.next;
                 delNode.next=null;
             }else {
                 pre=pre.next;
             }
         }
        return dummyNode.next;

    }
}