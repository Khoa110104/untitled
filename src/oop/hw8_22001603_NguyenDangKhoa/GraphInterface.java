package oop.hw8_22001603_NguyenDangKhoa;

import hw8_22001603_NguyenDangKhoa.Edge;
import hw8_22001603_NguyenDangKhoa.Vertex;

public interface GraphInterface<V, E> {

    int numVertices();


    int numEdges();


    Iterable<hw8_22001603_NguyenDangKhoa.Vertex<V>> vertices();


    Iterable<hw8_22001603_NguyenDangKhoa.Edge<E>> edges();



    int deg();

    Iterable<hw8_22001603_NguyenDangKhoa.Vertex<V>> linked(hw8_22001603_NguyenDangKhoa.Vertex<V> v);

    int outDegree(hw8_22001603_NguyenDangKhoa.Vertex<V> v) throws IllegalArgumentException;



    int inDegree(hw8_22001603_NguyenDangKhoa.Vertex<V> v) throws IllegalArgumentException;



    Iterable<hw8_22001603_NguyenDangKhoa.Edge<E>> outgoingEdges(hw8_22001603_NguyenDangKhoa.Vertex<V> v) throws IllegalArgumentException;



    Iterable<hw8_22001603_NguyenDangKhoa.Edge<E>> incomingEdges(hw8_22001603_NguyenDangKhoa.Vertex<V> v) throws IllegalArgumentException;


    hw8_22001603_NguyenDangKhoa.Edge<E> getEdge(hw8_22001603_NguyenDangKhoa.Vertex<V> u, hw8_22001603_NguyenDangKhoa.Vertex<V> v) throws IllegalArgumentException;

    hw8_22001603_NguyenDangKhoa.Vertex<V>[] endVertices(hw8_22001603_NguyenDangKhoa.Edge<E> e) throws IllegalArgumentException;

    hw8_22001603_NguyenDangKhoa.Vertex<V> opposite(hw8_22001603_NguyenDangKhoa.Vertex<V> v, hw8_22001603_NguyenDangKhoa.Edge<E> e) throws IllegalArgumentException;


    hw8_22001603_NguyenDangKhoa.Vertex<V> insertVertex(V element);


    hw8_22001603_NguyenDangKhoa.Edge<E> insertEdge(hw8_22001603_NguyenDangKhoa.Vertex<V> u, hw8_22001603_NguyenDangKhoa.Vertex<V> v, E element) throws IllegalArgumentException;


    void removeVertex(Vertex<V> v) throws IllegalArgumentException;

    void removeEdge(Edge<E> e) throws IllegalArgumentException;
}
