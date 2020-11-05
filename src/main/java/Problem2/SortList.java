package Problem2;

import java.util.List;

public class SortList {
    private static final int SENTRY = Integer.MAX_VALUE;
    // DO NOT ADD ANY NEW MEMBER VARIABLE AND MEMBER FUNCTION

    // DO NOT CHANGE ANYTHING IN THIS FUNCTION
    public static ListNode sortList(ListNode head) {
        if (head == null) {
            return null;
        }
        if (head.next == null) {
            return head;
        }
        ListNode mid = findMidAndBreak(head);
        return mergeLists(sortList(head), sortList(mid));
    }

    public static ListNode findMidAndBreak(ListNode head) {
        int listSize = 0;
        ListNode ptr = head;
        ListNode listTwo = head;
        while(ptr.next != null){
            listSize++;
            ptr = ptr.next;
        }
        int mid = listSize / 2;
        for(int i = 0; i < mid; i++){
            listTwo = listTwo.next;
        }
/*
        for(int i = 0; i <= mid; i++){
            ptr2 = ptr2.next;
            if(i == mid){
               listTwo.next == ptr2.next;
               ptr2.next == null;
            }
        }
*/
        return listTwo;
    }

    public static ListNode mergeLists(ListNode list1, ListNode list2) {
        // homework
        return null;
    }
}
