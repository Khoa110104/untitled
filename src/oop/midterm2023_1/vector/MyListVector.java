package oop.midterm2023_1.vector;

import java.util.ArrayList;
import java.util.List;

public class MyListVector extends AbstractMyVector {
    private List<Double> data;

    /**
     * Khởi tạo mặc định cho vector.
     */
    public MyListVector() {
        /* TODO */
        data = new ArrayList<>();
    }

    @Override
    public int size() {
        /* TODO */
        return data.size();
    }

    @Override
    public double coordinate(int index) {
        /* TODO */
        checkInvalidIndex(index, size());
        return data.get(index);
    }

    @Override
    public double[] coordinates() {
        /* TODO */
        double[] result = new double[data.size()];
        for (int i = 0; i < data.size(); i++) {
            result[i] = data.get(i);
        }
        return result;
    }

    @Override
    public void set(double value, int index) {
        /* TODO */
        if (index < 0 || index > size()) {
            System.out.println("Can't");
        }
        data.set(index, value);
    }

    /**
     * Cộng các giá trị tọa độ với value.
     *
     * @param value
     * @return vector hiện tại.
     */
    public MyListVector add(double value) {
        /* TODO */
        for (int i = 0; i < data.size(); i++) {
            double result = data.get(i) + value;
            data.set(i, result);
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
    public MyListVector add(MyListVector another) {
        /* TODO */
        if (data.size() != another.size()) {
            System.out.println("Can't");
            return null;
        }
        for (int i = 0; i < data.size(); i++) {
            double result = data.get(i) + another.coordinate(i);
            data.set(i, result);
        }
        return this;
    }

    /**
     * Trừ các giá trị tọa độ của vector cho value.
     *
     * @return vector hiện tại.
     */
    public MyListVector minus(double value) {
        /* TODO */
        for (int i = 0; i < size(); i++) {
            double result = data.get(i) - value;
            data.set(i, result);
        }
        return this;
    }

    /**
     * Trừ vector hiện tại với vector khác.
     * Nếu hai vector không cùng số chiều thì không trừ được.
     * In ra thông báo lỗi hoặc ném exception.
     * @return
     */
//    public MyListVector minus() {
//        /* TODO */
//        if (data.size() != )
//    }

    /**
     * Trừ vector hiện tại với vector khác.
     * Nếu hai vector không cùng số chiều thì không trừ được.
     * In ra thông báo lỗi hoặc ném exception.
     *
     * @return vector hiện tại.
     */
    public MyListVector minus(MyListVector another) {
        /* TODO */
        if (data.size() != another.size()) {
            System.out.println("Can't");
            return null;
        }
        for (int i = 0; i < size(); i++) {
            double result = data.get(i) - another.coordinate(i);
            data.set(i, result);
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
    public double dot(MyListVector another) {
        /* TODO */
        double result = 0;
        if (data.size() != another.size()) {
            System.out.println("Can't");
            return -1;
        }
        for (int i = 0; i < size(); i++) {
            result += data.get(i) * another.coordinate(i);
        }
        return result;
    }

    /**
     * Các giá trị của vector được lấy mũ power.
     *
     * @param power
     * @return vector hiện tại.
     */
    public MyListVector pow(double power) {
        /* TODO */
        for (int i = 0; i < size(); i++) {
            double result = Math.pow(data.get(i), power);
            data.set(i, result);
        }
        return this;
    }

    /**
     * Các giá trị tọa độ của vector được nhân với value.
     *
     * @return vector hiện tại.
     */
    public MyListVector scale(double value) {
        /* TODO */
        for (int i = 0; i < size(); i++) {
            double result = data.get(i) * value;
            data.set(i, result);
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
        for (int i = 0; i < size(); i++) {
            result += data.get(i) * data.get(i);
        }
        return Math.sqrt(result);
    }

    /**
     * Thêm một giá trị value vào tọa độ vector ở vị trí cuối cùng.
     *
     * @param value
     * @return vector hiện tại.
     */
    public MyListVector insert(double value) {
        /* TODO */
        data.add(value);
        return this;
    }

    /**
     * Thêm một giá trị vào tọa độ vector ở vị trí index.
     *
     * @param value
     * @param index
     * @return vector hiện tại.
     */
    public MyListVector insert(double value, int index) {
        /* TODO */
        checkInvalidIndex(index, size());
        data.add(index, value);
        return this;
    }

    /**
     * Xóa giá trị ở tọa độ thứ index.
     * Nếu index không hợp lệ thì in ra thông báo lỗi hoặc ném exception.
     *
     * @param index
     * @return vector hiện tại.
     */
    public MyListVector remove(int index) {
        /* TODO */
        checkInvalidIndex(index, size());
        data.remove(index);
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
    public MyListVector extract(double[] indices) {
        MyListVector newListVector = new MyListVector();
        for(int i=0;i<indices.length;i++){
            if(data.contains(indices[i]) == true){
                newListVector.add(indices[i]);
            }
        }
        return newListVector;
    }
}
