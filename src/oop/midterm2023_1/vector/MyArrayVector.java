package oop.midterm2023_1.vector;

import java.util.Arrays;

public class MyArrayVector extends AbstractMyVector {
    private static final int DEFAULT_CAPACITY = 1;
    private double[] data;
    private int size;

    /**
     * Khởi tạo mặc định cho vector.
     */
    public MyArrayVector() {
        /* TODO */
        data = new double[DEFAULT_CAPACITY];
        this.size = 0;
    }

    @Override
    public int size() {
        /* TODO */
        return size;
    }

    @Override
    public double coordinate(int index) {
        /* TODO */
        checkInvalidIndex(index, size);
        return data[index];
    }

    @Override
    public double[] coordinates() {
        /* TODO */
        return data;
    }

    @Override
    public void set(double value, int index) {
        /* TODO */
        checkInvalidIndex(index, size);
        data[index] = value;
    }

    /**
     * Cộng các giá trị tọa độ với value.
     *
     * @param value
     * @return vector hiện tại.
     */
    public MyArrayVector add(double value) {
        /* TODO */
        for (int i = 0; i < size; i++) {
            data[i] = data[i] + value;
        }
        return this;
    }

    /**
     * Cộng vector khác vào vector hiện tại.
     * Nếu hai vector không cùng số chiều thì không cộng được.
     * In ra thông báo lỗi hoặc ném exception.
     *
     * @param another
     * @return vector hiện tại.
     */
    public MyArrayVector add(MyArrayVector another) {
        /* TODO */
        if (data.length != another.size()) {
            System.out.println("Can't");
            return null;
        }
        for (int i = 0; i < data.length; i++) {
            data[i] = data[i] + another.coordinate(i);
        }
        return this;
    }

    /**
     * Trừ các giá trị tọa độ của vector cho value.
     *
     * @return vector hiện tại.
     */
    public MyArrayVector minus(double value) {
        /* TODO */
        for (int i = 0; i < data.length; i++) {
            data[i] = data[i] - value;
        }
        return this;
    }

    /**
     * Trừ vector hiện tại với vector khác.
     * Nếu hai vector không cùng số chiều thì không trừ được.
     * In ra thông báo lỗi hoặc ném exception.
     * @return
     */
//    public MyArrayVector minus() {
//        /* TODO */
//        if (data.length !=)
//    }

    /**
     * Trừ vector hiện tại với vector khác.
     * Nếu hai vector không cùng số chiều thì không trừ được.
     * In ra thông báo lỗi hoặc ném exception.
     *
     * @return vector hiện tại.
     */
    public MyArrayVector minus(MyArrayVector another) {
        /* TODO */
        for (int i = 0; i < data.length; i++) {
            data[i] = data[i] - another.coordinate(i);
        }
        return this;
    }

    /**
     * Tích vô hướng của hai vector.
     * Hai vector chỉ có tích vô hướng nếu có cùng số chiều.
     * Nếu hai vector không cùng số chiều, in ra thông báo lỗi hoặc ném exception.
     *
     * @return vector hiện tại.
     */
    public double dot(MyArrayVector another) {
        /* TODO */
        double result = 0;
        if (data.length != another.size) {
            System.out.println("Can't");
            return -1;
        }
        for (int i = 0; i < data.length; i++) {
            result += data[i] * another.coordinate(i);
        }
        return result;
    }

    /**
     * Các giá trị của vector được lấy mũ power.
     *
     * @param power
     * @return vector hiện tại.
     */
    public MyArrayVector pow(double power) {
        /* TODO */
        for (int i = 0; i < data.length; i++) {
            data[i] = Math.pow(data[i], power);
        }
        return this;
    }

    /**
     * Các giá trị tọa độ của vector được nhân với value.
     *
     * @return vector hiện tại.
     */
    public MyArrayVector scale(double value) {
        /* TODO */
        for (int i = 0; i < data.length; i++) {
            data[i] = data[i] * value;
        }
        return this;
    }

    /**
     * Lấy chuẩn của vector.
     *
     * @return chuẩn của vector.
     */
    @Override
    public double norm() {
        /* TODO */
        double result = 0;
        for (int i = 0; i < data.length; i++) {
            result += data[i] * data[i];
        }
        return Math.sqrt(result);
    }

    /**
     * Thêm một giá trị value vào tọa độ vector ở vị trí cuối cùng.
     * Nếu vector không còn đủ chỗ, mở rộng thêm kích thước vector.
     *
     * @param value
     * @return vector hiện tại.
     */
    public MyArrayVector insert(double value) {
        /* TODO */
        if (size == data.length) {
            enlarge();
        }
        data[size++] = value;
        return this;
    }

    /**
     * Thêm một giá trị vào tọa độ vector ở vị trí index.
     * Nếu vector không còn đủ chỗ, mở rộng thêm kích thước vector.
     *
     * @param value
     * @param index
     * @return vector hiện tại.
     */
    public MyArrayVector insert(double value, int index) {
        /* TODO */
        if (size == data.length) {
            enlarge();
        } else if (index == size) {
            this.insert(value);
        } else {
            double[] newVector = new double[size + 1];
            for (int i = 0; i < index; i++) {
                newVector[i] = data[i];
            }
            for (int i = size; i > index; i--) {
                newVector[i] = data[i - 1];
            }
            newVector[index] = value;
            this.data = newVector;
            size++;
            return this;
        }
        return null;
    }

    /**
     * Xóa giá trị ở tọa độ thứ index.
     * Nếu index không hợp lệ thì in ra thông báo lỗi hoặc ném exception.
     *
     * @param index
     * @return vector hiện tại.
     */
    public MyArrayVector remove(int index) {
        /* TODO */
        checkInvalidIndex(index, size);
        for (int i = index; i < size - 1; i++) {
            data[i] = data[i + 1];
        }
        size--;
        return this;
    }

    /**
     * Trích xuất ra một vector con của vector ban đầu, có các giá trị tọa độ
     * được lấy theo các chỉ số của mảng đầu vào.
     * Ví dụ, cho vector [1 2 3 4 5], cho mảng đầu vào là {2, 1} thì vector trích xuất ra
     * có tọa độ là [2 1].
     * Nếu có thỉ số trong mảng đầu vào không hợp lệ thì in ra thông báo lỗi,
     * hoặc ném exception.
     *
     * @param indices
     * @return vector mới có tọa độ được trích xuất từ vector hiện tại.
     */
    public MyArrayVector extract(int[] indices) {
        /* TODO */
        MyArrayVector newVector = new MyArrayVector();
        int index = 0;
        for (int i = 0; i < indices.length; i++) {
            if (binarySearch(data, indices[i]) != -1) {
                newVector.add(indices[i]);
            }
        }
        return newVector;
    }

    /**
     * Mở rộng kích thước vector lên gấp đôi khi cần thiết.
     *
     * @return vector hiện tại.
     */
    private MyArrayVector enlarge() {
        /* TODO */
        data = Arrays.copyOf(data, data.length * 2);
        return this;
    }

    private int binarySearch(double[] data, double key) {
        int iL = 0;
        int iR = data.length - 1;
        while (iL <= iR) {
            int iM = (iL + iR) / 2;
            if (data[iM] == key) {
                return iM;
            } else if (data[iM] > key) {
                iL = iM + 1;
            } else if (data[iM] < key) {
                iR = iM - 1;
            }
        }
        return -1;
    }
}
