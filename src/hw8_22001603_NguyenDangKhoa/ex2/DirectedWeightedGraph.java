package hw8_22001603_NguyenDangKhoa.ex2;

import hw8_22001603_NguyenDangKhoa.Edge;
import hw8_22001603_NguyenDangKhoa.GraphInterface;
import hw8_22001603_NguyenDangKhoa.Vertex;

import java.util.ArrayList;
import java.util.Iterator;

public class DirectedWeightedGraph<V, E extends Comparable<? super E>> implements GraphInterface<V, E> {
    protected ArrayList<Vertex<V>> vertexList;
    protected ArrayList<Edge<V>> edgeList;
    protected Edge<E>[][] link;

    public DirectedWeightedGraph() {
        this.link = new Edge[10][10];
        vertexList = new ArrayList<>(10);
        edgeList = new ArrayList<>(50);
    }

    @Override
    public int numVertices() {
        int n = vertexList.size();
        return n;
    }

    @Override
    public int numEdges() {
        int n = edgeList.size();
        return n;
    }

    @Override
    public Iterable<Vertex<V>> vertices() {
        return new Iterable<Vertex<V>>() {
            @Override
            public Iterator<Vertex<V>> iterator() {
                return new Iterator<Vertex<V>>() {
                    private int currentIndex = 0;

                    @Override
                    public boolean hasNext() {
                        return currentIndex < vertexList.size();
                    }

                    @Override
                    public Vertex<V> next() {
                        return vertexList.get(currentIndex++);
                    }
                };
            }
        };
    }


    @Override
    public Iterable<Edge<E>> edges() {
        return new Iterable<Edge<E>>() {
            @Override
            public Iterator<Edge<E>> iterator() {
                return new Iterator<Edge<E>>() {
                    private int currentIndex = 0;

                    @Override
                    public boolean hasNext() {
                        return currentIndex < edgeList.size();
                    }

                    @Override
                    public Edge<E> next() {
                        return (Edge<E>) edgeList.get(currentIndex++);
                    }
                };
            }
        };
    }


    @Override
    public int deg() {
        int count = 0;
        for (Edge[] edges : link) {
            int tmpCount = 0;
            for (Edge edge : edges) {
                if (edge != null)
                    tmpCount++;
            }
            if (count != tmpCount)
                count = tmpCount;
        }
        for (int i = 0; i < link[0].length; i++) {
            int tempCount = 0;
            for (Edge<E>[] edge : link) {
                if (edge[i] != null)
                    tempCount++;
            }
            if (count != tempCount)
                count = tempCount;
        }
        return count;
    }

    @Override
    public Iterable<Vertex<V>> linked(Vertex<V> v) {
        if (v == null || !vertexList.contains(v)) {
            throw new IllegalArgumentException("Unknown vertex!!!");
        }

        ArrayList<Vertex<V>> linkedVertices = new ArrayList<>();

        for (Edge<E> edge : this.outgoingEdges(v)) {
            Vertex<V> oppositeVertex = opposite(v, edge);
            if (!linkedVertices.contains(oppositeVertex)) {
                linkedVertices.add(oppositeVertex);
            }
        }

        return linkedVertices;
    }

    @Override
    public int outDegree(Vertex<V> v) throws IllegalArgumentException {
        if (v == null || !vertexList.contains(v)) {
            throw new IllegalArgumentException("Unknown vertex!!!");
        }

        int count = 0;

        for (Edge<E>[] edges : link) {
            if (edges[vertexList.indexOf(v)] != null) {
                count++;
            }
        }

        return count;
    }

    @Override
    public int inDegree(Vertex<V> v) throws IllegalArgumentException {
        if (v == null || !vertexList.contains(v)) {
            throw new IllegalArgumentException("Unknown vertex!!!");
        }

        int count = 0;

        for (Edge<E> edge : link[vertexList.indexOf(v)]) {
            if (edge != null) {
                count++;
            }
        }
        return count;
    }

    @Override
    public Iterable<Edge<E>> outgoingEdges(Vertex<V> v) throws IllegalArgumentException {
        if (v == null || !vertexList.contains(v)) {
            throw new IllegalArgumentException("Unknown vertex!!!");
        }

        ArrayList<Edge<E>> edges = new ArrayList<>();

        for (Edge<E> edge : link[vertexList.indexOf(v)]) {
            if (edge != null) {
                edges.add(edge);
            }
        }

        return edges;
    }

    @Override
    public Iterable<Edge<E>> incomingEdges(Vertex<V> v) throws IllegalArgumentException {
        if (v == null || !vertexList.contains(v)) {
            throw new IllegalArgumentException("Unknown vertex!!!");
        }

        ArrayList<Edge<E>> edges = new ArrayList<>();

        for (Edge<E>[] edgeArray : link) {
            if (edgeArray[vertexList.indexOf(v)] != null) {
                edges.add(edgeArray[vertexList.indexOf(v)]);
            }
        }

        return edges;
    }

    @Override
    public Edge<E> getEdge(Vertex<V> u, Vertex<V> v) throws IllegalArgumentException {
        if (v == null || u == null || !vertexList.contains(u) || !vertexList.contains(v)) {
            throw new IllegalArgumentException("Unknown vertex!!!");
        }

        int uIndex = vertexList.indexOf(u);
        int vIndex = vertexList.indexOf(v);

        return link[uIndex][vIndex];
    }

    @Override
    public Vertex<V>[] endVertices(Edge<E> e) throws IllegalArgumentException {
        if (!edgeList.contains(e))
            throw new IllegalArgumentException("Unknown Edge!!!");
        return e.endVertices();
    }

    @Override
    public Vertex<V> opposite(Vertex<V> v, Edge<E> e) throws IllegalArgumentException {
        if (v == null || e == null || !edgeList.contains(e) || !vertexList.contains(v)) {
            throw new IllegalArgumentException("Unknown vertex!!!");
        }

        Vertex<V>[] vertices = e.endVertices();
        if (vertices[0].equals(v)) {
            return vertices[1];
        } else if (vertices[1].equals(v)) {
            return vertices[0];
        } else {
            throw new IllegalArgumentException("Edge doesn't connect that vertex!!!");
        }
    }

    @Override
    public Vertex<V> insertVertex(V element) {
        Vertex<V> vertex = new Vertex<>(element);
        vertexList.add(vertex);
        if (vertexList.size() > link.length) {
            Edge<E>[][] edgesTemp = new Edge[vertexList.size()][vertexList.size()];
            for (int i = 0; i < link.length; i++) {
                System.arraycopy(link[i], 0, edgesTemp[i], 0, link[i].length);
            }
            link = edgesTemp;
        }
        return vertex;
    }

    @Override
    public Edge<E> insertEdge(Vertex<V> u, Vertex<V> v, E element) throws IllegalArgumentException {
        if (v == null || u == null || !vertexList.contains(u) || !vertexList.contains(v))
            throw new IllegalArgumentException("Unknown vertex!!!");
        int uIndex = vertexList.indexOf(u);
        int vIndex = vertexList.indexOf(v);
        link[uIndex][vIndex] = new WeightedEdge(u, v, element);
        edgeList.add((Edge<V>) link[uIndex][vIndex]);
        return link[uIndex][vIndex];
    }

    @Override
    public void removeVertex(Vertex<V> v) throws IllegalArgumentException {
        if (v == null || !vertexList.contains(v))
            throw new IllegalArgumentException("Unknown vertex!!!");
        int index = vertexList.indexOf(v);
        vertexList.remove(v);
        if (link.length - 1 - index >= 0)
            System.arraycopy(link, index + 1, link, index, link.length - 1 - index);
        link[link.length - 1] = null;
        for (int i = 0; i < link.length; i++) {
            if (link[i] != null) {
                edgeList.remove(link[i][index]);
                if (link[i].length - 1 - index >= 0)
                    System.arraycopy(link[i], index + 1, link[i], index, link[i].length - index - 1);
                link[i][link[i].length - 1] = null;
            }
        }
    }

    @Override
    public void removeEdge(Edge<E> e) throws IllegalArgumentException {
        if (e == null || !edgeList.contains(e))
            throw new IllegalArgumentException("Unknown vertex!!!");
        Vertex[] point = e.endVertices();
        int uIndex = vertexList.indexOf(point[0]);
        int vIndex = vertexList.indexOf(point[1]);
        link[uIndex][vIndex] = null;
    }



}
