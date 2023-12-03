package oop.midterm2023_1.vec;

public abstract class AbstractMyVector implements MyVector {

    public int compareTo(MyVector another) {
        return Double.compare(this.norm(), another.norm());
    }

    /**
     * Mô tả vector theo định dạng [a1 a2 ... an]
     * @return
     */
    @Override
    public String toString() {
        /* TODO */
        StringBuilder s = new StringBuilder();
        s.append("[");
        if (size() != 0) {
            for (int i = 0; i < size(); i++) {
                s.append(String.format("%s ",coordinate(i)));
            }
            s.delete(s.length()-1,s.length());
        }
        s.append("]");
        return s.toString();
    }

    /**
     * So sánh hai vector có bằng nhau không.
     * Hai vector bằng nhau nếu có cùng số chiều và có tọa độ bằng nhau.
     * @param another
     * @return
     */
    @Override
    public boolean equals(MyVector another) {
        /* TODO */
        if (this.size() != another.size()) {
            return false;
        }
        for (int i = 0; i < size(); i++) {
            if (coordinate(i) != another.coordinate(i)) {
                return false;
            }
        }
        return true;
    }
    public static void checkBoundaries(int index,int limit) {
        if (index < 0 || index >= limit) {
            throw new ArrayIndexOutOfBoundsException();
        }
    }
    public static void checkEmpty(int size) {
        if (size == 0) {
            throw new IllegalArgumentException("EMPTY VECTOR");
        }
    }
    public static void checkEqualSize(int size1,int size2) {
        if (size1 != size2) {
            throw new IllegalArgumentException("DIMENSIONS DISAGREE");
        }
    }

}
