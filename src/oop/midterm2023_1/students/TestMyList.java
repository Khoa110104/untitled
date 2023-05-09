package oop.midterm2023_1.students;

public class TestMyList {
    public static void main(String[] args) {
        /*
         TODO

         - Chạy demo các hàm test.
         - Lưu kết quả chạy chương trình vào file text có tên <Ten_MaSinhVien_MyList>.txt
           (ví dụ, NguyenVanA_123456_MyList.txt)
         - Nộp kết quả chạy chương trình (file text trên) cùng với các file source code.
         */
        testMyArrayList();
        System.out.println();
        testMyLinkedList();
    }

    public static void testMyArrayList() {
        /*
         TODO

         - Tạo ra một list kiểu MyArrayList có ít nhất 10 Student.

         - Sử dụng StudentStatistics để
             + Sắp xếp và in ra danh sách các Student theo thứ tự tăng dần theo tên và họ.
             + Sắp xếp và in ra danh sách các Student theo thứ tự giảm dần theo tên và họ.
             + Sắp xếp và in ra danh sách các Student theo thứ tự tăng dần về average.
             + Sắp xếp và in ra danh sách các Student theo thứ tự giảm dần về average.
         */
        System.out.println("Test ArrayList");
        MyList myList = new MyArrayList();
        initStudents(myList);
        sortAndPrint(myList);
    }

    private static void initStudents(MyList myList) {
        myList.insert(new Student("A", "Nguyen", 10), 0);
        myList.append(new Student("B", "Pham", 9));
        myList.insert(new Student("N", "Le", 9.5), 1);
        myList.append(new Student("H", "Hoang", 9));
        myList.insert(new Student("H", "Pham", 8), 1);
        myList.append(new Student("D", "Nguyen", 7.5));
        myList.insert(new Student("A", "Luong", 6), 1);
        myList.append(new Student("D", "Bui", 7));
        myList.insert(new Student("A", "Vu", 7.5), 1);
        myList.append(new Student("P", "Nguyen", 9.5));
    }

    private static void sortAndPrint(MyList myList) {
        StudentStatistics studentStatistics = new StudentStatistics(myList);

        System.out.println("Sort by fullname asc");
        studentStatistics.sortByFullname(true);
        testIterator(myList);

        System.out.println("Sort by fullname desc");
        studentStatistics.sortByFullname(false);
        testIterator(myList);

        System.out.println("Sort by average desc");
        studentStatistics.sortByAverage(false);
        testIterator(myList);

        System.out.println("Sort by average asc");
        studentStatistics.sortByAverage(true);
        testIterator(myList);
    }

    public static void testMyLinkedList() {
        /*
         TODO

         - Tạo ra một list kiểu MyLinkedList có ít nhất 10 Student.

         - Sử dụng StudentStatistics để
             + Sắp xếp và in ra danh sách các Student theo thứ tự tăng dần theo tên và họ.
             + Sắp xếp và in ra danh sách các Student theo thứ tự giảm dần theo tên và họ.
             + Sắp xếp và in ra danh sách các Student theo thứ tự tăng dần về average.
             + Sắp xếp và in ra danh sách các Student theo thứ tự giảm dần về average.
         */
        System.out.println("Test LinkedList");
        MyList myList = new MyLinkedList();
        initStudents(myList);
        sortAndPrint(myList);
    }

    public static void testIterator(MyList myList) {
        /*
         TODO

         Sử dụng iterator duyệt qua tất cả các phần tử trong danh sách myList và in ra thông tin về phần tử đó.
         */
        for (MyIterator iterator = myList.iterator(); iterator.hasNext(); ) {
            System.out.println(iterator.next());
        }
    }
}
