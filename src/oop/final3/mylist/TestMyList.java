package oop.final3.mylist;

import java.util.Random;

public class TestMyList {
    public TestMyList() {
    }

    public static void main(String[] args) {
        MyList myLinkedList = new MyLinkedList();
        MyList myArrayList = new MyArrayList();
        Random random = new Random();
        for (int i = 0; i < 5; i++) {
            myLinkedList.add(random.nextInt(9) + 1);
            myArrayList.add(random.nextInt(9) + 1);
            myLinkedList.add(random.nextInt(9) + 1, random.nextInt(myLinkedList.size() + 1));
            myArrayList.add(random.nextInt(9) + 1, random.nextInt(myArrayList.size() + 1));
        }
        System.out.println("MyLinkedList: " + myLinkedList);
        System.out.println("Add to myLinkedList value 8 at index 2: ");
        myLinkedList.add(8, 2);
        System.out.println(myLinkedList);
        System.out.println("Size: " + myLinkedList.size());
        System.out.println("Remove myLinkedList at index 4: ");
        myLinkedList.remove(4);
        System.out.println(myLinkedList);
        System.out.println("Size: " + myLinkedList.size());
        System.out.println("Element at index 5: " + myLinkedList.get(5));

        System.out.println("==================================");
        System.out.println("MyArrayList: " + myArrayList);
        System.out.println("Add to myArrayList value 2 at index 10: ");
        myArrayList.add(2, 10);
        System.out.println(myArrayList);
        System.out.println("Size: " + myArrayList.size());
        System.out.println("Remove myArrayList at index 8: ");
        myArrayList.remove(8);
        System.out.println(myArrayList);
        System.out.println("Size: " + myArrayList.size());
        System.out.println("Element at index 9: " + myArrayList.get(9));
    }
}
