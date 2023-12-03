package oop.homework.homework4.lt3;

import homework.homework4.lt3.DeleteMid;

import java.util.Stack;

public class TestMain {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);
        stack.push(22);
        System.out.println("Before delete mid:");
        System.out.println(stack);
        DeleteMid deleteMid = new DeleteMid();
        deleteMid.deleteMid(stack, stack.size());
        System.out.println("After delete mid:");
        System.out.println(stack);
    }
}
