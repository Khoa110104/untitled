package oop.hw8_22001603_NguyenDangKhoa.ex2;

import hw8_22001603_NguyenDangKhoa.Edge;
import hw8_22001603_NguyenDangKhoa.Vertex;

public class WeightedEdge<V, E extends Comparable<? super E>> implements Edge<E>, Comparable<WeightedEdge<V, E>> {
    final Vertex<V>[] endpoints;
    E element;

    public WeightedEdge(Vertex<V> a, Vertex<V> b, E element) {
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
    public Vertex<V>[] endVertices() {
        return endpoints;
    }

    @Override
    public int compareTo(WeightedEdge<V, E> otherEdge) {
        return element.compareTo(otherEdge.getValue());
    }
}