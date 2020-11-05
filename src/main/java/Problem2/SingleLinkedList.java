package Problem2;

import java.util.List;

public class SingleLinkedList {
    private ListNode head;
    private int size;

    public ListNode getHead() {
        return head;
    }

    public SingleLinkedList() {
        head = new ListNode();  // dummy node
    }

    public SingleLinkedList(int[] data) {
        this();
        if (data == null || data.length == 0) {
            return;
        }
        ListNode ptr = head;
        for (int datum : data) {
            ptr.next = new ListNode(datum);
            ptr = ptr.next;
            size++;
        }
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        ListNode ptr = head.next;
        while (ptr != null) {
            builder.append(ptr.val).append(ptr.next == null ? " -> end " : " -> ");
            ptr = ptr.next;
        }
        return builder.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }

        if (!(obj instanceof SingleLinkedList)) {
            return false;
        }

        SingleLinkedList otherList = (SingleLinkedList) obj;

        if (this.size != otherList.size) {
            return false;
        }
        ListNode n1 = head.next;
        ListNode n2 = otherList.head.next;
        while (n1 != null && n2 != null) {
            if (n1.val != n2.val) {
                return false;
            }
            n1 = n1.next;
            n2 = n2.next;
        }
        return (n1 == null && n2 == null);
    }

    public int getSize() {
        return size;
    }

    // reverse the linked list RECURSIVELY
    public void reverse() {
        if(head.next == null){
            return;
        }
        if(head.next.next != null) {
            /*if(head.val == 0){
                head = head.next;
            }*/
            reverseHelper(head, null);
        }
    }
    // can use 2 ptr's per class on Monday
    public ListNode reverseHelper(ListNode ptr1, ListNode ptr2) {
        if(ptr1.next == null){
            head = ptr1;
            ptr1.next = ptr2;
            return head;
        }
        ListNode next1 = ptr1.next;
        ptr1.next = ptr2;
        reverseHelper(next1,ptr1);

        return head;

        /*if(head == null || head.next == null){
            return head;
        }

        ListNode ptr = reverseHelper(head.next);
        head.next.next = head;
        head.next = null;
        return ptr;*/

        /*
        if(list != null && list.next != null){
            reverseHelper(list.next);
            return list;
        }
        if(list != null && list.next == null){
            return list;
        }

        return list;
        */
    }
}
