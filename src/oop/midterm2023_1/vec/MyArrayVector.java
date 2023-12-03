package oop.midterm2023_1.vec;

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
        this.data = new double[DEFAULT_CAPACITY];
        this.size = 0;
    }

    @Override
    public int size() {
        /* TODO */
        return this.size;
    }

    @Override
    public double coordinate(int index) {
        /* TODO */
        checkBoundaries(index,size());
        return data[index];
    }

    @Override
    public double[] coordinates() {
        /* TODO */
        return Arrays.copyOf(data,size());
    }

    @Override
    public void set(double value, int index) {
        /* TODO */
        checkBoundaries(index,size());
        data[index] = value;
    }

    /**
     * Cộng các giá trị tọa độ với value.
     * @param value
     * @return vector hiện tại.
     */
    public MyArrayVector add(double value) {
        /* TODO */
        checkEmpty(size());
        for (int i = 0; i < size(); i++) {
            data[i] += value;
        }
        return this;
    }

    /**
     * Cộng vector khác vào vector hiện tại.
     * Nếu hai vector không cùng số chiều thì không cộng được.
     * In ra thông báo lỗi hoặc ném exception.
     * @param another
     * @return vector hiện tại.
     */
    public MyArrayVector add(MyArrayVector another) {
        /* TODO */
        checkEmpty(this.size());
        checkEmpty(another.size());
        checkEqualSize(this.size(),another.size());
        for (int i = 0; i < size(); i++) {
            data[i] += another.coordinate(i);
        }
        return this;
    }

    /**
     * Trừ các giá trị tọa độ của vector cho value.
     * @return vector hiện tại.
     */
    public MyArrayVector minus(double value) {
        /* TODO */
        checkEmpty(size());
        for (int i = 0; i < size(); i++) {
            data[i] -= value;
        }
        return this;
    }

    /**
     * Trừ vector hiện tại với vector khác.
     * Nếu hai vector không cùng số chiều thì không trừ được.
     * In ra thông báo lỗi hoặc ném exception.
     * @return vector hiện tại.
     */
    public MyArrayVector minus(MyArrayVector another) {
        /* TODO */
        checkEmpty(this.size());
        checkEmpty(another.size());
        checkEqualSize(this.size(),another.size());
        for (int i = 0; i < size(); i++) {
            data[i] -= another.coordinate(i);
        }
        return this;
    }

    /**
     * Tích vô hướng của hai vector.
     * Hai vector chỉ có tích vô hướng nếu có cùng số chiều.
     * Nếu hai vector không cùng số chiều, in ra thông báo lỗi hoặc ném exception.
     * @return vector hiện tại.
     */
    public double dot(MyArrayVector another) {
        /* TODO */
        checkEmpty(this.size());
        checkEmpty(another.size());
        checkEqualSize(this.size(),another.size());
        double result = 0;
        for (int i = 0; i < size(); i++) {
            result += this.data[i] * another.coordinate(i);
        }
        return result;
    }

    /**
     * Các giá trị của vector được lấy mũ power.
     * @param power
     * @return vector hiện tại.
     */
    public MyArrayVector pow(double power) {
        /* TODO */
        checkEmpty(size());
        for (int i = 0; i < size(); i++) {
            data[i] = Math.pow(data[i],power);
        }
        return this;
    }

    /**
     * Các giá trị tọa độ của vector được nhân với value.
     * @return vector hiện tại.
     */
    public MyArrayVector scale(double value) {
        /* TODO */
        checkEmpty(size());
        for (int i = 0; i < size(); i++) {
            data[i] *= value;
        }
        return this;
    }

    /**
     * Lấy chuẩn của vector.
     * @return chuẩn của vector.
     */
    @Override
    public double norm() {
        /* TODO */
        return Math.sqrt(dot(this));
    }

    /**
     * Thêm một giá trị value vào tọa độ vector ở vị trí cuối cùng.
     * Nếu vector không còn đủ chỗ, mở rộng thêm kích thước vector.
     * @param value
     * @return vector hiện tại.
     */
    public MyArrayVector insert(double value) {
        /* TODO */
        if (size == data.length) {
            enlarge();
        }
        data[size] = value;
        size++;
        return this;
    }

    /**
     * Thêm một giá trị vào tọa độ vector ở vị trí index.
     * Nếu vector không còn đủ chỗ, mở rộng thêm kích thước vector.
     * @param value
     * @param index
     * @return vector hiện tại.
     */
    public MyArrayVector insert(double value, int index) {
        /* TODO */
        checkBoundaries(index,size() + 1);
        if (size == data.length) {
            enlarge();
        }
        for (int i = size() - 1; i >= index; i--) {
            data[i+1] = data[i];
        }
        data[index] = value;
        size++;
        return this;
    }

    /**
     * Xóa giá trị ở tọa độ thứ index.
     * Nếu index không hợp lệ thì in ra thông báo lỗi hoặc ném exception.
     * @param index
     * @return vector hiện tại.
     */
    public MyArrayVector remove(int index) {
        /* TODO */
        checkBoundaries(index,size());
        for (int i = index; i < size() - 1; i++) {
            data[i] = data[i+1];
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
     * @param indices
     * @return vector mới có tọa độ được trích xuất từ vector hiện tại.
     */
    public MyArrayVector extract(int[] indices) {
        /* TODO */
        checkEmpty(size());
        checkEmpty(indices.length);
        MyArrayVector result = new MyArrayVector();
        for (int i = 0; i < indices.length; i++) {
            checkBoundaries(indices[i] -1, size());
            result.insert(this.coordinate(indices[i] - 1));
        }
        return result;
    }

    /**
     * Mở rộng kích thước vector lên gấp đôi khi cần thiết.
     * @return vector hiện tại.
     */
    private MyArrayVector enlarge() {
        /* TODO */
        this.data = Arrays.copyOf(this.data,this.size() * 2);
        return this;
    }

}
