
/**
 * @author sasayaya
 * @create 2022/3/11 12:59
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
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        int lenA = 0;
        int lenB = 0;

        ListNode curA = headA;
        ListNode curB = headB;
        while (curA != null){
            lenA++;
            curA = curA.next;
        }
        while (curB!= null){
            lenB++;
            curB = curB.next;
        }

        curA = headA;
        curB = headB;

        if (lenB>lenA){
            ListNode tempCode = curB;
            curB = curA;
            curA = tempCode;

            int tempLen = lenA;
            lenA = lenB;
            lenB = tempLen;
        }
        int gap = lenA - lenB;
        while (gap>0){
            curA = curA.next;
            gap--;
        }

        while (curA!=null){
            if (curA == curB){
                return curA;
            }
            curA = curA.next;
            curB = curB.next;
        }
        return null;
    }
}
