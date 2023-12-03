package oop.midterm2023_1.vector;

public abstract class AbstractMyVector implements MyVector {
    /**
     * Mô tả vector theo định dạng [a1 a2 ... an]
     *
     * @return
     */
    @Override
    public String toString() {
        /* TODO */
        String result = "[";
        for (int i = 0; i < size(); i++) {
            result += (this.coordinate(i) + " ");
        }
        return result + "]";
    }

    /**
     * So sánh hai vector có bằng nhau không.
     * Hai vector bằng nhau nếu có cùng số chiều và có tọa độ bằng nhau.
     *
     * @param another
     * @return
     */
    @Override
    public boolean equals(MyVector another) {
        /* TODO */
        if (size() == another.size()) {
            for (int i = 0; i < size(); i++) {
                if (this.coordinate(i) == another.coordinate(i)) {
                    return true;
                }
            }
            return false;
        }
        return false;
    }

    public void checkInvalidIndex(int index, int limit) {
        if (index < 0 || index >= limit) {
            throw new ArrayIndexOutOfBoundsException();
        }
    }
}
