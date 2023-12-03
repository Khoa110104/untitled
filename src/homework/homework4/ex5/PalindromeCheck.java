package homework.homework4.ex5;


public class PalindromeCheck {
    public  boolean isPalindrome(String stringInput) {
        String str = stringInput.replaceAll(" ","");
        LinkedListQueue queue = new LinkedListQueue<>();
        LinkedListStack stack = new LinkedListStack();
        for (int i = 0; i < str.length(); i++) {
            queue.enqueue(str.charAt(i));
            stack.push(str.charAt(i));
        }
        while (! queue.isEmpty() && !stack.isEmpty()){
            if (queue.dequeue() != stack.pop()) {
                return false;
            }
        }
        return true;
    }
}
