package Problem3;

import Problem2.ListNode;

import java.io.PrintStream;

public class Problem3 {
    public static void printListInReverse(ListNode list, PrintStream print) {
        if(list != null && list.next != null){
            printListInReverse(list.next,print);
            print.print(list.val + " ");
            return;
        }
        if(list != null && list.next == null){
            print.print(list.val + " ");
            return;
        }
    }

}
