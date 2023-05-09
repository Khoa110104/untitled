package oop.lab.lab8.lists;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class TestLists {
    public static void main(String[] args) {
        List<Integer> list1 = new ArrayList<>();
        list1.add(3);
        list1.add(35);
        list1.add(666);
        list1.add(0);
        System.out.println(list1);

        Lists.insertFirst(list1, 8);
        System.out.println(list1);

        Lists.insertLast(list1, 10);
        System.out.println(list1);

        Lists.removeThird(list1);
        System.out.println(list1);

        Lists.removeEvil(list1);
        System.out.println(list1);

        Lists.replace(list1, 100);

        Lists.removeThird(list1);


        List<Integer> squareNumbers = Lists.generateSquare();
        System.out.println(squareNumbers);

        System.out.println(Lists.contains(list1, 5));
        Lists.insertFirst(list1, 101);

        List<Integer> list2 = new ArrayList<>();
        list2.add(1);
        list2.add(44);
        System.out.println(list2);

        Lists.copy(list1, list2);
        System.out.println(list1);
        System.out.println(list2);

        Lists.reverse(list1);
        System.out.println(list1);

        Lists.reverseManual(list1);
        System.out.println(list1);

        LinkedList<Integer> linkedList = new LinkedList<>(list1);
        Lists.insertBeginningEnd((LinkedList<Integer>) linkedList, 49);
        System.out.println(linkedList);
        Lists.reverse(linkedList);
        System.out.println(linkedList);
    }
}
