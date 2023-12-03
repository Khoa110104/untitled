package oop.hw8_22001603_NguyenDangKhoa;

import hw8_22001603_NguyenDangKhoa.Vertex;

public interface Edge<E> {
    E getValue();

    void setValue(E value);

    Vertex[] endVertices();

    @Override
    String toString();
}
