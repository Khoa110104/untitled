package oop.midterm2023_1.students;

public class   TestMyList {
    public static void main(String[] args) {
        /*
         TODO

         - Chạy demo các hàm test.
         - Lưu kết quả chạy chương trình vào file text có tên <Ten_MaSinhVien_MyList>.txt
           (ví dụ, NguyenVanA_123456_MyList.txt)
         - Nộp kết quả chạy chương trình (file text trên) cùng với các file source code.
         */
        testMyArrayList();
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
        System.out.println("=================BasicStatistics ArrayList=================");
        MyList myList = new MyArrayList();
        initAndSort(myList);
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
        System.out.println("=================BasicStatistics LinkedList=================");
        MyList myList = new MyLinkedList();
        initAndSort(myList);
        System.out.println("=================End=================");
    }

    private static void initAndSort(MyList myList) {
        myList.append(new Student("Khoa", "Nguyen", 7));
        myList.append(new Student("Khoi", "Nguyen", 8));
        myList.insert(new Student("Khiem", "Hoang", 9), 1);
        myList.insert(new Student("Tuan", "Pham", 9),2 );
        myList.append(new Student("Khue", "Nguyen", 10));
        myList.append(new Student("Dung", "Nguyen", 7.5));
        myList.insert(new Student("Nam", "Truong", 7), 2);
        myList.append(new Student("Dang", "Le", 5));
        myList.insert(new Student("Anh", "Vu", 4), 1);
        myList.append(new Student("Phuong", "Nguyen", 7));
        myList.append(new Student("Nam", "Vu", 2));
        myList.append(new Student("Hieu", "Vu", 2));
        myList.set(new Student("Khoa","Vu", 10), 2);
        myList.remove(5);

        StudentStatistics studentStatistics = new StudentStatistics(myList);

        System.out.println("\t\t*** Sort by fullname increase ***");
        myList = studentStatistics.sortByFullname(true);
        testIterator(myList);
        System.out.println();

        System.out.println("\t\t*** Sort by fullname reduce ***");
        myList = studentStatistics.sortByFullname(false);
        testIterator(myList);
        System.out.println();

        System.out.println("\t\t*** Sort by average increase ***");
        myList = studentStatistics.sortByAverage(true);
        testIterator(myList);
        System.out.println();

        System.out.println("\t\t*** Sort by average reduce ***");
        myList = studentStatistics.sortByAverage(false);
        testIterator(myList);
        System.out.println();
    }

    public static void testIterator(MyList myList) {
        for (MyIterator iterator = myList.iterator(); iterator.hasNext(); ) {
            System.out.println(iterator.next());
        }
    }
}
