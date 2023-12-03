package oop.hw8_22001603_NguyenDangKhoa.ex1;

import hw8_22001603_NguyenDangKhoa.Edge;
import hw8_22001603_NguyenDangKhoa.Vertex;

public class UnWeighedEdge<V, E> implements Edge<E> {
    final Vertex<V>[] endpoints;
    E element;

    public UnWeighedEdge(Vertex<V> a, Vertex<V> b, E element) {
        endpoints = new Vertex[]{a, b};
        this.element = element;
    }

    @Override
    public E getValue() {
        return element;
    }

    @Override
    public void setValue(E value) {
        this.element = value;
    }

    @Override
    public Vertex[] endVertices() {
        return endpoints;
    }
}
