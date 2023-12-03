package oop.homework.homework3.ex2;

import homework.homework3.ex2.SimpleArrayList;

public class TestMain {
    public static void main(String[] args) {
        int capacity = 1;
        SimpleArrayList simpleArrayList = new SimpleArrayList<>(capacity);
        //Add
        simpleArrayList.add(1);
        simpleArrayList.add(2);
        simpleArrayList.add(3);
        simpleArrayList.add(4);

        System.out.println("List: " + simpleArrayList.toString(simpleArrayList));
        simpleArrayList.add(5);
        System.out.println("Sau khi thêm phần tử 5:");
        System.out.println(simpleArrayList.toString(simpleArrayList));
        //Size
        System.out.println("Size: " + simpleArrayList.size());

        System.out.println("Lấy ra phần tử ở vị trí 0: " + simpleArrayList.get(0));
        System.out.println("Kiểm tra có xuất hiện phần tử 6 không: " + simpleArrayList.isContain(6));
        simpleArrayList.remove(3);
        System.out.println("Sau khi xóa phần tử 3:");
        System.out.println(simpleArrayList.toString(simpleArrayList));
        simpleArrayList.set(0,99);
        System.out.println("Sau khi set giá trị ở index 0 thành 99:");
        System.out.println(simpleArrayList.toString(simpleArrayList));


    }
}
