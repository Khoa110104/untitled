package homework.homework4.lt1.codelearn14;

import java.util.Stack;

public class ToBinary {
    public void toBin(int number) {
        Stack<Integer> stack = new Stack<>();
        while (number > 0) {
            int surplus = number % 2;
            stack.push(surplus);
            number = number / 2;
        }
        int size = stack.size();
        for (int i = 0; i < size; i++) {
            System.out.print(stack.pop());
        }
    }
}
