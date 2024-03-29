package oop.hw8_22001603_NguyenDangKhoa;

public class Vertex<V> {
    V value;

    public Vertex(V value) {
        this.value = value;
    }

    public V getValue() {
        return value;
    }

    public void setValue(V value) {
        this.value = value;
    }


    @Override
    public String toString() {
        return "Vertex[" +
                "value=" + value +
                ']';
    }
}
