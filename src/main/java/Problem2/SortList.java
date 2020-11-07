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
        if(head == null || head.next == null){
            head = null;
            return head;
        }
        int listSize = 1;
        ListNode ptr = head;
        ListNode listTwo = head;
        while(ptr.next != null){
            listSize++;
            ptr = ptr.next;
        }
        ptr = head;
        int mid = listSize / 2;
        for(int i = 0; i < mid; i++){
            listTwo = listTwo.next;
            if(i == mid - 1){
                ptr.next = null;
            }
            else{
                ptr = ptr.next;
            }
        }
        return listTwo;
    }

    public static ListNode mergeLists(ListNode list1, ListNode list2) {
        if(list1 == null){
            return list2;
        }

        if(list2 == null){
            return list1;
        }

        if(list1.val < list2.val){
            list1.next = mergeLists(list1.next,list2);
            return list1;
        }

        else{
            list2.next = mergeLists(list1, list2.next);
            return list2;
        }
    }
}
