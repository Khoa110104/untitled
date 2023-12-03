package oop.homework.homework4.lt3;

import java.util.Stack;

public class DeleteMid {
    public void deleteMid(Stack<Integer> stack, int sizeOfStack) {
        deleteMidEle(stack, 0, sizeOfStack);
    }

    private void deleteMidEle(Stack<Integer> stack, int curr, int sizeOfStack) {
        if (curr == sizeOfStack / 2) {
            stack.pop();
            return;
        }
        int tempData = stack.pop();
        deleteMidEle(stack,curr + 1, sizeOfStack );
        stack.push(tempData);
    }
}
