package oop.lab.lab8.lists;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Lists {
    public static void insertFirst(List<Integer> list, int value) {
        if (list == null) {
            return;
        }
        list.add(0, value);
    }

    public static void insertLast(List<Integer> list, int value) {
        if (list == null) {
            return;
        }
        list.add(value);
    }

    public static void replace(List<Integer> list, int value) {
        if (list == null || list.size() < 3) {
            return;
        }
        list.set(2, value);
    }

    public static void removeThird(List<Integer> list) {
        if (list == null || list.size() < 3) {
            return;
        }
        list.remove(2);
    }

    public static void removeEvil(List<Integer> list) {
        if (list == null) {
            return;
        }
        int size = list.size();
        int i = 0;
        while (i < size) {
            if (list.get(i) == 666) {
                list.remove(i);
                size--;
            } else {
                i++;
            }
        }
    }

    public static List<Integer> generateSquare() {
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 1; i < 11; i++) {
            list.add(i * i);
        }
        return list;
    }

    public static boolean contains(List<Integer> list, int value) {
        return list.contains(value);
    }

    public static void copy(List<Integer> source, List<Integer> target) {
        target.clear();
        for (int i : source) {
            target.add(i);
        }
    }

    public static void reverse(List<Integer> list) {
        List<Integer> newList = List.copyOf(list);
        list.clear();
        for (int i = newList.size() - 1; i >= 0; i--) {
            list.add(newList.get(i));
        }
    }

    public static void reverseManual(List<Integer> list) {
        for (int i = 0; i < list.size() / 2; i++) {
            int temp = list.get(i);
            list.set(i, list.get(list.size() - 1 - i));
            list.set(list.size() - 1 - i, temp);
        }
    }

    public static void insertBeginningEnd(LinkedList<Integer> list, int value) {
        list.add(value);
        list.add(0, value);
    }
}

