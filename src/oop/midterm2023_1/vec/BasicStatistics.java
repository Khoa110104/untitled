package oop.midterm2023_1.vec;

import java.util.*;

public class BasicStatistics {
    private MyVector[] vectors;

    public BasicStatistics() {
        this.vectors = insertVectors();
        doSimpleStatic(vectors);
        System.out.println("Printing the rank of the vectors by norm");
        System.out.println(Arrays.toString(rank()));
        System.out.println("Max norm = " + normMax());
        System.out.println("Min norm = " + normMin());
        System.out.println("Printing the ascending array of vectors according to the norm of vectors");
        printVectors(sortNorm(true));
        System.out.println("Printing the descending array of vectors according to the norm of vectors");
        printVectors(sortNorm(false));
        System.out.println("Printing the array of vectors in the 5 to 10 range according to their norm");
        printVectors(filter(5,10));
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
        System.out.println("TESTING ARRAY VECTOR");
        testArrayVector();
        System.out.println("****************************************************");
        System.out.println("TESTING LIST VECTOR");
        testListVector();
        System.out.println("****************************************************");
        System.out.println("TESTING BASIC STATISTICS");
        BasicStatistics basicStatistics = new BasicStatistics();

    }

    public static void testArrayVector() {
        System.out.println("Vector 1");
        MyVector testVector = new MyArrayVector();
        System.out.println("Empty vector");
        System.out.println(testVector);
        System.out.println("Inserting values into the last position");
        ((MyArrayVector) testVector).insert(1,0);
        ((MyArrayVector) testVector).insert(1);
        System.out.println(testVector);
        System.out.println("Removing at a specific index");
        ((MyArrayVector) testVector).remove(1);
        System.out.println(testVector);
        System.out.println("new form of vector 1");
        ((MyArrayVector) testVector).insert(2);
        ((MyArrayVector) testVector).insert(3);
        ((MyArrayVector) testVector).insert(4);
        ((MyArrayVector) testVector).insert(5);
        System.out.println(testVector);
        System.out.println("testing getting coordinate at a specific index");
        System.out.println(testVector.coordinate(3));
        System.out.println("setting a specific index with a specific value");
        testVector.set(10,4);
        System.out.println(testVector);
        System.out.println("getting the norm of the vector");
        System.out.println(testVector.norm());
        System.out.println("____________________________________________________________________________");
        System.out.println("Vector 2");
        MyVector arrayVector = new MyArrayVector();
        ((MyArrayVector) arrayVector).insert(5.0,0);
        ((MyArrayVector) arrayVector).insert(4.0,0);
        ((MyArrayVector) arrayVector).insert(3.0,0);
        ((MyArrayVector) arrayVector).insert(2.0,0);
        ((MyArrayVector) arrayVector).insert(1.0,0);
        System.out.println(arrayVector);
        System.out.println("adding each coordinate with a value");
        System.out.println(((MyArrayVector) arrayVector).add(1));
        System.out.println("adding the original vector with vector1");
        System.out.println(((MyArrayVector) arrayVector).add((MyArrayVector) testVector));
        System.out.println("all coordinates to the power of 2");
        System.out.println(((MyArrayVector) arrayVector).pow(2));
        System.out.println("all coordinates multiply by 3");
        System.out.println(((MyArrayVector) arrayVector).scale(2));
        int[] indices = new int[] {3,1};
        MyVector extractVector = ((MyArrayVector) arrayVector).extract(indices);
        System.out.println("Extracting from array of indices");
        System.out.println(extractVector);
    }

    public static void testListVector() {
        /* TODO */
        System.out.println("Vector 1");
        MyVector testVector = new MyListVector();
        System.out.println("Empty vector");
        System.out.println(testVector);
        System.out.println("Inserting values into the last position");
        ((MyListVector) testVector).insert(1,0);
        ((MyListVector) testVector).insert(1);
        System.out.println(testVector);
        System.out.println("Removing at a specific index");
        ((MyListVector) testVector).remove(1);
        System.out.println(testVector);
        System.out.println("new form of vector 1");
        ((MyListVector) testVector).insert(2);
        ((MyListVector) testVector).insert(3);
        ((MyListVector) testVector).insert(4);
        ((MyListVector) testVector).insert(5);
        System.out.println(testVector);
        System.out.println("testing getting coordinate at a specific index");
        System.out.println(testVector.coordinate(3));
        System.out.println("setting a specific index with a specific value");
        testVector.set(10,4);
        System.out.println(testVector);
        System.out.println("getting the norm of the vector");
        System.out.println(testVector.norm());
        System.out.println("____________________________________________________________________________");
        System.out.println("Vector 2");
        MyVector arrayVector = new MyListVector();
        ((MyListVector) arrayVector).insert(5.0,0);
        ((MyListVector) arrayVector).insert(4.0,0);
        ((MyListVector) arrayVector).insert(3.0,0);
        ((MyListVector) arrayVector).insert(2.0,0);
        ((MyListVector) arrayVector).insert(1.0,0);
        System.out.println(arrayVector);
        System.out.println("adding each coordinate with a value");
        System.out.println(((MyListVector) arrayVector).add(1));
        System.out.println("adding the original vector with vector1");
        System.out.println(((MyListVector) arrayVector).add((MyListVector) testVector));
        System.out.println("all coordinates to the power of 2");
        System.out.println(((MyListVector) arrayVector).pow(2));
        System.out.println("all coordinates multiply by 3");
        System.out.println(((MyListVector) arrayVector).scale(2));
        int[] indices = new int[] {3,1,2};
        MyVector extractVector = ((MyListVector) arrayVector).extract(indices);
        System.out.println("Extracting from array of indices");
        System.out.println(extractVector);
    }

    public static void doSimpleStatic(MyVector[] vectors) {
        /* TODO */
        System.out.println("Original vector list");
        printVectors(vectors);
        System.out.println("********************************************");
    }
    public static void printVectors(MyVector[] myVectors) {
        for (int i = 0; i < myVectors.length; i++) {
            System.out.println(myVectors[i]);
        }
    }
    public MyVector[] insertVectors() {
        MyVector[] vectors = new MyVector[10];
        for (int i = 0; i < 10; i++) {
            MyVector vector = new MyListVector();
            for (int j = 0; j < 4; j++) {
                Random random = new Random();
                double num = random.nextInt(10);
                ((MyListVector) vector).insert(num);
            }
            vectors[i] = vector;
        }
        return vectors;
    }

    /**
     * Lấy giá trị chuẩn lớn nhất trong các vector.
     * @return chuẩn lớn nhất.
     */
    public double normMax() {
        /* TODO */
        if (vectors.length == 0) {
            System.out.println("Empty vectors list");
            return -1;
        }
        double max = -Double.MAX_VALUE;
        for (int i = 0; i < vectors.length; i++) {
            if (vectors[i].norm() > max) {
                max = vectors[i].norm();
            }
        }
        return max;
    }

    /**
     * Lấy giá trị chuẩn nhỏ nhất trong các vector.
     * @return chuẩn nhỏ nhất.
     */
    public double normMin() {
        /* TODO */
        if (vectors.length == 0) {
            System.out.println("Empty vectors list");
            return -1;
        }
        double min = Double.MAX_VALUE;
        for (int i = 0; i < vectors.length; i++) {
            if (vectors[i].norm() < min) {
                min = vectors[i].norm();
            }
        }
        return min;
    }

    /**
     * Lấy ra mảng các vector được sắp xếp theo thứ tự của chuẩn.
     * Nếu order là true thì mảng đầu ra là các vector có chuẩn tăng dần.
     * Nếu order là false thì mảng đầu ra là các vector có chuẩn giảm dần.
     * @return mảng các vector theo thứ tự mảng tăng dần.
     */
    public MyVector[] sortNorm(boolean order) {
        /* TODO */
        if (order) {
            Arrays.sort(this.vectors);
        }
        else {
            Arrays.sort(this.vectors, Comparator.reverseOrder());
        }
        return this.vectors;
    }

    /**
     * Lọc ra mảng các vector có chuẩn năm trong đoạn [from, to].
     * @param from
     * @param to
     * @return các vector có chuẩn nằm trong đoạn [from, to]
     */
    public MyVector[] filter(int from, int to) {
        /* TODO */
        List<MyVector> result = new ArrayList<>();
        for (int i = 0; i < vectors.length; i++) {
            if (vectors[i].norm() >= from && vectors[i].norm() <= to) {
                result.add(vectors[i]);
            }
        }
        return result.toArray(new MyVector[0]);
    }

    /**
     * Lấy ra thông tin rank của các vector trong mảng theo chuẩn.
     * Rank được tính theo quy luật sau, ví dụ
     *   - tập [3 1 4] có rank [2.0 1.0 3.0]
     *   - tập [3 1 3 5] có các rank [2.5 1.0 4.0] (các phần tử có giá trị bằng nhau có rank
     *     được tính bằng trung bình các chỉ số của các phần tử trong tập dữ liệu, chỉ sổ bắt
     *     đầu là 1)
     * @return
     */
    public double[] rank() {
        /* TODO */
        double[] rank = new double[vectors.length];
        for (int i = 0; i < vectors.length; i++) {
            int r = 1;
            int s = 1;
            for (int j = 0; j < vectors.length; j++) {
                if (j != i && vectors[j].norm() < vectors[i].norm()) {
                    r++;
                }
                if (j != i && vectors[j].norm() == vectors[i].norm()) {
                    s++;
                }
            }
            rank[i] = r + (double)(s-1) / 2;
        }
        Set<Double> result = new LinkedHashSet<>();
        for (double num:rank) {
            result.add(num);
        }
        return result.stream().mapToDouble(Double::doubleValue).toArray();
    }
}
