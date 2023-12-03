package hw7_22001603_NguyenDangKhoa.combo2.ex1;

import java.util.Random;

public class TestMain {
    public static void main(String[] args) {
        System.out.println("***************- 100 phần tử random không sắp xếp -***************");

        Random random = new Random();
        SimpleArrayList<Integer> arrayList = new SimpleArrayList<>(100);
        for (int i = 0; i < 100; i++) {
           arrayList.add(random.nextInt());
        }
        SimpleLinkedList<Integer> linkedList = new SimpleLinkedList<>();
        for (int i = 0; i < arrayList.size(); i++) {
            linkedList.addBot(arrayList.get(i));
        }
        LinearSearchArrayList<Integer> linearSearchArrayList = new LinearSearchArrayList<>(arrayList);
        System.out.println("-------Tìm kiếm tuyến tính trên mảng-------");
        linearSearchArrayList.getRunTime(5);
        LinearSearchLinkedList<Integer> linearSearchLinkedList  = new LinearSearchLinkedList<>(linkedList);
        System.out.println("-------Tìm kiếm tuyến tính trên danh sách liên kết-------");
        linearSearchLinkedList.getRunTime(5);

        System.out.println("***************- 100 phần tử có sắp xếp -***************");
        arrayList = new SimpleArrayList<>(100);
        for (int i = 0; i < 100; i++) {
            arrayList.add(i);
        }
        System.out.println("-------Tìm kiếm nhị phân trên mảng sắp xếp -------");
        BinarySearchArrayList<Integer> binarySearchArrayList = new BinarySearchArrayList<>(arrayList);
        binarySearchArrayList.getRunTime(5);
    }
}
