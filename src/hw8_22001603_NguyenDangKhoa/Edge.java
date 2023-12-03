package hw8_22001603_NguyenDangKhoa;

public interface Edge<E> {
    E getValue();

    void setValue(E value);

    Vertex[] endVertices();

    @Override
    String toString();
}
