package oop.homework.homework4.ex1;

import java.util.Stack;

public class TestMain {
    public static void main(String[] args) {
        Stack<Character> stack = new Stack();
        String str = "nguyendangkhoa";
        for (int i =0 ; i < str.length(); i++) {
            if (i % 2 == 0) {
                stack.push(str.charAt(i));
            }
            if (i % 3 == 0) {
                stack.pop();
            }
        }
        System.out.println(stack);
    }

}
