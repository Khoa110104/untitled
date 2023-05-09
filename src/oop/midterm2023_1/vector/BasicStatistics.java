package oop.midterm2023_1.vector;

import java.util.Arrays;

public class BasicStatistics {
    private MyVector[] vectors;

    public BasicStatistics(MyVector[] vectors) {
        this.vectors = vectors;
    }

    public static void main(String[] args) {
        /*
         TODO

         Thực hiện các yêu cầu sau.

         I. Test chức năng vector
           - Viết các hàm testArrayVector để test các chứ năng của array vector, như thêm vào tọa độ, xóa bớt số trục tọa độ,
             sửa giá trị tọa độ, cộng các vector, nhân vector với giá trị vô hướng, nhân vô hướng 2 vector, ...
           - Viết các hàm testListVector để test các chứ năng của list vector, như thêm vào tọa độ, xóa bớt số trục tọa độ,
             sửa giá trị tọa độ, cộng các vector, nhân vector với giá trị vô hướng, nhân vô hướng 2 vector, ...

         II. Thực hiện thống kê đơn giản với các vector
           - Tạo ra ít nhất 10 vector và cho vào mảng vectors để quản lý. Trong đó có ít nhất 2 nhóm các vector
             có chuẩn bằng nhau.
           - Tìm và in ra thông tin chuẩn nhó nhất, chuẩn lớn nhất của các vector.
           - In ra các vector có chuẩn sắp xếp theo thứ tự tăng dần, giản dần.
           - In ra các vector có chuẩn nằm trong một đoạn [a, b] cho trước.
           - In ra rank của các vector theo thứ tự trong mảng vectors.

         III. Lưu các kết quả chạy chương trình vào file text có tên <Ten_MaSinhVien_Vector>.txt
              (ví dụ NguyenVanA_123456_Vector.txt) và nộp cùng source code.
         */
        testArrayVector();
        testListVector();
        doSimpleStatic();
    }

    public static void testArrayVector() {
        /* TODO */
        MyArrayVector myArrayVector1 = new MyArrayVector();
        myArrayVector1.insert(1);
        myArrayVector1.insert(9);
        myArrayVector1.insert(6);
        myArrayVector1.insert(3);
        myArrayVector1.set(5,1);
        myArrayVector1.remove(0);
        myArrayVector1.insert(2,1);
        myArrayVector1.add(2);
        myArrayVector1.minus(1);
        System.out.println(myArrayVector1.coordinate(2));
        System.out.println(Arrays.toString(myArrayVector1.coordinates()));

        MyArrayVector myArrayVector2 = new MyArrayVector();
        myArrayVector2.insert(1);
        myArrayVector2.insert(9);
        myArrayVector2.insert(6);
        myArrayVector2.insert(3);
        myArrayVector2.set(5,1);
        myArrayVector2.remove(0);
        myArrayVector2.insert(2,1);
        myArrayVector2.add(2);
        myArrayVector2.minus(1);
        System.out.println(myArrayVector2.coordinate(2));
        System.out.println(Arrays.toString(myArrayVector2.coordinates()));

        System.out.println(myArrayVector1.pow(2));
        System.out.println("add: " + myArrayVector1.add(myArrayVector2));
        System.out.println("minus: " + myArrayVector1.minus(myArrayVector2));
        System.out.println("dot:" + myArrayVector1.dot(myArrayVector2));

    }

    public static void testListVector() {
        /* TODO */
        MyListVector myListVector1 = new MyListVector();
        myListVector1.insert(1);
        myListVector1.insert(3);
        myListVector1.insert(5,1);
        myListVector1.insert(7);
        myListVector1.insert(9);
        myListVector1.add(2);
        myListVector1.minus(1);
        System.out.println(myListVector1.coordinate(3));
        System.out.println(Arrays.toString(myListVector1.coordinates()));
        myListVector1.set(2,2);
        myListVector1.remove(1);

        MyListVector myListVector2 = new MyListVector();
        myListVector2.insert(2);
        myListVector2.insert(4);
        myListVector2.insert(6,1);
        myListVector2.insert(8);
        myListVector2.insert(10);
        myListVector1.add(2);
        myListVector1.minus(1);
        System.out.println(myListVector2.coordinate(3));
        System.out.println(Arrays.toString(myListVector2.coordinates()));
        myListVector2.set(2,3);
        myListVector2.remove(3);

        System.out.println(myListVector1.pow(2));
        System.out.println("add:" + myListVector1.add(myListVector2));
        System.out.println("minus:" + myListVector1.minus(myListVector2));
        System.out.println("scale:" + myListVector1.scale(2));
        System.out.println("dot: " + myListVector1.dot(myListVector2));
        System.out.println("norm: " + myListVector1.norm());
        double[] data ={2.0,6.0};
        System.out.println(myListVector2.extract(data));

    }

    public static void doSimpleStatic() {
        /* TODO */
        MyVector[] myList = new MyVector[2];
        MyListVector test = new MyListVector();
        test.add(1);
        test.add(3);
        test.add(3);
        test.add(3);
        test.add(2);
        myList[0] = test;
        MyListVector test2 = new MyListVector();
        test.add(3);
        test2.add(1);
        test.add(4);
        test.add(4);
        test.add(4);
        myList[1] = test2;
        BasicStatistics myTest = new BasicStatistics(myList);
        System.out.println(myTest.normMax());
        System.out.println(myTest.normMin());
        System.out.println(Arrays.toString(myTest.sortNorm(true)));
        System.out.println(Arrays.toString(myTest.sortNorm(false)));
        System.out.println(Arrays.toString(myTest.filter(0, 10)));
        System.out.println(Arrays.toString(myTest.rank()));
    }
    /**
     * Lấy giá trị chuẩn lớn nhất trong các vector.
     *
     * @return chuẩn lớn nhất.
     */
    public double normMax() {
        /* TODO */
        double normMax = vectors[0].norm();
        for (int i = 1; i < vectors.length; i++) {
            if (normMax < vectors[i].norm()) {
                normMax = vectors[i].norm();
            }
        }
        return normMax;
    }

    /**
     * Lấy giá trị chuẩn nhỏ nhất trong các vector.
     *
     * @return chuẩn nhỏ nhất.
     */
    public double normMin() {
        /* TODO */
        double normMin = vectors[0].norm();
        for (int i = 1; i < vectors.length; i++) {
            if (normMin > vectors[i].norm()) {
                normMin = vectors[i].norm();
            }
        }
        return normMin;
    }

    /**
     * Lấy ra mảng các vector được sắp xếp theo thứ tự của chuẩn.
     * Nếu order là true thì mảng đầu ra là các vector có chuẩn tăng dần.
     * Nếu order là false thì mảng đầu ra là các vector có chuẩn giảm dần.
     *
     * @return mảng các vector theo thứ tự mảng tăng dần.
     */
    public MyVector[] sortNorm(boolean order) {
        /* TODO */
        if (order) {
            for (int i = 0; i < vectors.length - 1; i++) {
                int minIndex = i;
                for (int j = i + 1; j < vectors.length; j++) {
                    if (vectors[minIndex].norm() > vectors[j].norm()) {
                        minIndex = j;
                    }
                }
                if (minIndex != i) {
                    MyVector temp = vectors[minIndex];
                    vectors[minIndex] = vectors[i];
                    vectors[i] = temp;
                }
            }
        } else {
            for (int i = 0; i < vectors.length - 1; i++) {
                int minIndex = i;
                for (int j = i + 1; j < vectors.length; j++) {
                    if (vectors[minIndex].norm() < vectors[j].norm()) {
                        minIndex = j;
                    }
                }
                if (minIndex != i) {
                    MyVector temp = vectors[minIndex];
                    vectors[minIndex] = vectors[i];
                    vectors[i] = temp;
                }
            }
        }
        return vectors;
    }

    /**
     * Lọc ra mảng các vector có chuẩn năm trong đoạn [from, to].
     *
     * @param from
     * @param to
     * @return các vector có chuẩn nằm trong đoạn [from, to]
     */
    public MyVector[] filter(int from, int to) {
        /* TODO */
        MyVector[] myVectors = new MyVector[vectors.length];
        int index = 0;
        for (int i = 0; i < vectors.length; i++) {
            if (vectors[i].norm() >= from && vectors[i].norm() <= to) {
                myVectors[index] = vectors[i];
                index++;
            }
        }
        return myVectors;
    }

    /**
     * Lấy ra thông tin rank của các vector trong mảng theo chuẩn.
     * Rank được tính theo quy luật sau, ví dụ
     * - tập [3 1 4] có rank [2.0 1.0 3.0]
     * - tập [3 1 3 5] có các rank [2.5 1.0 4.0] (các phần tử có giá trị bằng nhau có rank
     * được tính bằng trung bình các chỉ số của các phần tử trong tập dữ liệu, chỉ sổ bắt
     * đầu là 1)
     *
     * @return
     */
    public double[] rank() {
        /* TODO */
        double[] result = new double[vectors.length];

        for (int i = 0; i < vectors.length; i++) {
            int r = 1, s = 1;
            for (int j = 0; j < vectors.length; j++) {
                if (j != i && vectors[j].norm() < vectors[i].norm()) {
                    r++;
                }
                if (j != i && vectors[j].norm() == vectors[i].norm()) {
                    s++;
                }
            }
            result[i] = r + (s - 1) / 2.0;
        }

        return result;
    }
}
