package oop.homework.homework4.lt1.codelearn13;

import java.util.Stack;

public class Reverse {
    public void reverse(String str) {
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < str.length(); i++) {
            stack.push(str.charAt(i));
        }
        for (int i = 0; i < str.length(); i++) {
            System.out.print(stack.pop());
        }
        System.out.println();
    }
}
