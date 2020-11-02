package Problem3;

import Problem2.ListNode;

import java.io.PrintStream;

public class Problem3 {
    public static void printListInReverse(ListNode list, PrintStream print) {
        if(list != null && list.next != null){
            list = list.next;
        }
        printListInReverse(list,print);
        print.print(list);
    }

    public static void printListHelper(ListNode list){
        if(list != null && list.next != null){
            list = list.next;
        }
        printListHelper(list);
    }
}
