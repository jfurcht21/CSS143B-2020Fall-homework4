package Problem1;

import java.util.Stack;

//Used reference: https://algorithms.tutorialhorizon.com/reverse-a-stack-using-recursion-in-place-without-using-extra-memory/
public class ReverseStack {
    public static void reverseStack(Stack<Integer> stack) {
        Stack<Integer> newStack = new Stack<>();
        if(stack.size() > 0){
            int x = stack.pop();
            reverseStack(stack);
            reverseStackHelper(stack, x);
        }
    }

    public static void reverseStackHelper(Stack<Integer> stack, int x){
        if(stack.size() == 0){
            stack.push(x);
            return;
        }
        int y = stack.pop();
        reverseStackHelper(stack, x);

        stack.push(y);

    }
}