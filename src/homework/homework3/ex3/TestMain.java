package homework.homework3.ex3;

public class TestMain {
    public static void main(String[] args) {
        SimpleLinkedList simpleLinkedList = new SimpleLinkedList();
        System.out.println("Empty:" + simpleLinkedList.isEmpty());

        simpleLinkedList.addBot("6");
        System.out.println("Thêm phần tử 6:");
        simpleLinkedList.printLinkedList(simpleLinkedList);

        System.out.println("Empty:" + simpleLinkedList.isEmpty());

        simpleLinkedList.addTop("4");
        System.out.println("Sau khi thêm phần tử 4 vào đầu:");
        simpleLinkedList.printLinkedList(simpleLinkedList);

        simpleLinkedList.addBot("12");
        System.out.println("Sau khi thêm phần tử 12 vào cuối:");
        simpleLinkedList.printLinkedList(simpleLinkedList);

        simpleLinkedList.addBot("3");
        System.out.println("Sau khi thêm phần tử 3 vào cuối:");
        simpleLinkedList.printLinkedList(simpleLinkedList);

        simpleLinkedList.addTop("66");
        System.out.println("Sau khi thêm phần tử 66 vào đầu:");
        simpleLinkedList.printLinkedList(simpleLinkedList);

        System.out.println("Lấy ra phần tử ở index 1: " + simpleLinkedList.get(1));

        simpleLinkedList.remove("4");
        System.out.println("Sau khi xóa phần tử 4:");
        simpleLinkedList.printLinkedList(simpleLinkedList);

        simpleLinkedList.set(2, 99);
        System.out.println("Sau khi xét giá trị ở index 2 bằng 99");
        simpleLinkedList.printLinkedList(simpleLinkedList);

        System.out.println("Tìm trong list có phần tử 4 không: " + simpleLinkedList.isContain(4));

        System.out.println("Tìm trong list có phần tử 99 không: " + simpleLinkedList.isContain(99));

        simpleLinkedList.removeTop();
        System.out.println("Sau khi xóa vị trí đầu:");
        simpleLinkedList.printLinkedList(simpleLinkedList);

        simpleLinkedList.removeBot();
        System.out.println("Sau khi xóa vị trí cuối:");
        simpleLinkedList.printLinkedList(simpleLinkedList);
    }
}
