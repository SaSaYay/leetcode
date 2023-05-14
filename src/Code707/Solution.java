package Code707;

import java.time.Period;
import java.util.function.Predicate;

/**
 * @author sasayaya
 * @create 2022/3/10 21:01
 */
class MyLinkedList {
    class ListNode {
        int val;
        ListNode next;
        ListNode(){}
        ListNode(int val) {
            this.val=val;
        }
    }
//    记录数量
    int size;
//    虚拟节点
    ListNode dummyHead;


    public MyLinkedList() {
        this.size = 0;
        this.dummyHead = new ListNode(-1);
    }

    public int get(int index) {
        if (index < 0 || index>size){
            return -1;
        }
        ListNode pre = dummyHead;
        for (int i = 0; i <= size; i++) {
            pre = pre.next;
        }
        return pre.val;
    }

    public void addAtHead(int val) {
        addAtIndex(0,val);
    }

    public void addAtTail(int val) {
        addAtIndex(size,val);
    }
//    在链表中的第 index 个节点之前添加值为 val  的节点。如果 index 等于链表的长度，则该节点将附加到链表的末尾。如果 index 大于链表长度，则不会插入节点。如果index小于0，则在头部插入节点。
    public void addAtIndex(int index, int val) {
        if (index > size){
            return;
        }
        if (index < 0){
            index =0;
        }
        size++;
        ListNode pre = dummyHead;
        for (int i = 0; i < index; i++) {
            pre = pre.next;
        }
        ListNode addNode = new ListNode(val);

        addNode.next=pre.next;
        pre.next = addNode;



    }

    public void deleteAtIndex(int index) {
        if (index < 0 || index>=size){
            return;
        }
        ListNode pre = dummyHead;
        size--;
        for (int i = 0; i < index; i++) {
            pre = pre.next;
        }
        ListNode delNode = pre.next;
        pre.next = delNode.next;
        delNode.next = null;

    }
}