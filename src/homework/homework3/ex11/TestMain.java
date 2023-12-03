package homework.homework3.ex11;

public class TestMain {
    public static void main(String[] args) {
        LinkedList list1 = new LinkedList();
        int arr[] = {1, 2, 3, 4, 4, 2, 1};
        for (int i = 0; i < 7; i++) {
            list1.add(arr[i]);
        }
        System.out.println("Linked list1:");
        list1.printList();
        if (list1.isPalindrome(list1.headNode)) {
            System.out.println("Is Palindrome");
        } else {
            System.out.println("Not Palindrome");
        }

        LinkedList list2 = new LinkedList();
        int arr1[] = {1, 2, 3, 4, 3, 2, 1};
        for (int i = 0; i < 7; i++) {
            list2.add(arr1[i]);
        }
        System.out.println("Linked list2:");
        list2.printList();
        if (list2.isPalindrome(list2.headNode)) {
            System.out.println("Is Palindrome");
        } else {
            System.out.println("Not Palindrome");
        }
    }
}
