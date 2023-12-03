package hw8_22001603_NguyenDangKhoa.ex1;

import hw8_22001603_NguyenDangKhoa.Edge;
import hw8_22001603_NguyenDangKhoa.GraphInterface;
import hw8_22001603_NguyenDangKhoa.Vertex;

import java.util.ArrayList;

public class UndirectedUnweightedGraph<V, E> implements GraphInterface<V, E> {
    protected ArrayList<Vertex<V>> vertexArrayList;
    protected ArrayList<Edge<V>> edgeArrayList;
    protected Edge<E>[][] link;

    public UndirectedUnweightedGraph() {
        this.link = new Edge[15][15];
        vertexArrayList = new ArrayList<>(15);
        edgeArrayList = new ArrayList<>(55);
    }

    @Override
    public int numVertices() {
        int n = vertexArrayList.size();
        return n;
    }

    @Override
    public int numEdges() {
        int n = edgeArrayList.size();
        return n;
    }

    @Override
    public Iterable<Vertex<V>> vertices() {
        return vertexArrayList;
    }

    @Override
    public Iterable<Edge<E>> edges() {
        ArrayList<Edge<E>> result = new ArrayList<>();
        for (Edge<V> edge : edgeArrayList) {
            result.add((Edge<E>) edge);
        }
        return result;
    }

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
        return count;
    }

    @Override
    public Iterable<Vertex<V>> linked(Vertex<V> v) {
        if (v == null || !vertexArrayList.contains(v)) {
            throw new IllegalArgumentException("Unknown vertex!!!");
        }

        ArrayList<Vertex<V>> linkedVertices = new ArrayList<>();
        for (Edge<E> edge : outgoingEdges(v)) {
            Vertex<V> oppositeVertex = opposite(v, edge);
            if (!linkedVertices.contains(oppositeVertex)) {
                linkedVertices.add(oppositeVertex);
            }
        }

        return linkedVertices;
    }

    @Override
    public int outDegree(Vertex<V> v) throws IllegalArgumentException {
        if (v == null || !vertexArrayList.contains(v)) {
            throw new IllegalArgumentException("Unknown vertex!!!");
        }

        int count = 0;
        Edge<E>[] incidentEdges = link[vertexArrayList.indexOf(v)];

        for (Edge<E> edge : incidentEdges) {
            if (edge != null) {
                count++;
            }
        }

        return count;
    }

    @Override
    public int inDegree(Vertex<V> v) throws IllegalArgumentException {
        return outDegree(v);
    }

    @Override
    public Iterable<Edge<E>> outgoingEdges(Vertex<V> v) throws IllegalArgumentException {
        if (v == null || !vertexArrayList.contains(v)) {
            throw new IllegalArgumentException("Unknown vertex!!!");
        }

        ArrayList<Edge<E>> incidentEdges = new ArrayList<>();
        Edge<E>[] edgesArray = link[vertexArrayList.indexOf(v)];

        for (Edge<E> edge : edgesArray) {
            if (edge != null) {
                incidentEdges.add(edge);
            }
        }

        return incidentEdges;
    }


    @Override
    public Iterable<Edge<E>> incomingEdges(Vertex<V> v) throws IllegalArgumentException {
        return outgoingEdges(v);
    }

    @Override
    public Edge<E> getEdge(Vertex<V> u, Vertex<V> v) throws IllegalArgumentException {
        if (u == null || v == null || !vertexArrayList.contains(u) || !vertexArrayList.contains(v)) {
            throw new IllegalArgumentException("Unknown vertex!!!");
        }
        int uIndex = vertexArrayList.indexOf(u);
        int vIndex = vertexArrayList.indexOf(v);

        return link[uIndex][vIndex];
    }

    @Override
    public Vertex<V>[] endVertices(Edge<E> e) throws IllegalArgumentException {
        if (e == null || !edgeArrayList.contains(e)) {
            throw new IllegalArgumentException("Unknown Edge!!!");
        }

        return e.endVertices();
    }

    @Override
    public Vertex<V> opposite(Vertex<V> v, Edge<E> e) throws IllegalArgumentException {
        if (v == null || e == null || !edgeArrayList.contains(e) || !vertexArrayList.contains(v))
            throw new IllegalArgumentException("Unknown vertex!!!");
        Vertex<V>[] vertices = e.endVertices();
        if (vertices[0] == v)
            return vertices[1];
        else if (vertices[1] == v)
            return vertices[0];
        else
            throw new IllegalArgumentException("Edge doesn't connect that vertex!!!");
    }

    @Override
    public Vertex<V> insertVertex(V element) {
        Vertex<V> vertex = new Vertex<>(element);
        vertexArrayList.add(vertex);
        if (vertexArrayList.size() > link.length) {
            Edge<E>[][] edgesTemp = new Edge[vertexArrayList.size() * 3 / 2][vertexArrayList.size() * 3 / 2];
            for (int i = 0; i < link.length; i++) {
                System.arraycopy(link[i], 0, edgesTemp[i], 0, link[i].length);
            }
            link = edgesTemp;
        }
        return vertex;
    }

    @Override
    public Edge<E> insertEdge(Vertex<V> u, Vertex<V> v, E element) throws IllegalArgumentException {
        if (v == null || u == null || !vertexArrayList.contains(u) || !vertexArrayList.contains(v))
            throw new IllegalArgumentException("Unknown vertex!!!");
        int uIndex = vertexArrayList.indexOf(u);
        int vIndex = vertexArrayList.indexOf(v);
        link[uIndex][vIndex] = link[vIndex][uIndex] = new UnWeighedEdge(u, v, element);
        edgeArrayList.add((Edge<V>) link[vIndex][uIndex]);
        return link[uIndex][vIndex];
    }

    @Override
    public void removeVertex(Vertex<V> v) throws IllegalArgumentException {
        if (v == null || !vertexArrayList.contains(v))
            throw new IllegalArgumentException("Unknown vertex!!!");
        int index = vertexArrayList.indexOf(v);
        vertexArrayList.remove(v);
        if (link.length - 1 - index >= 0)
            System.arraycopy(link, index + 1, link, index, link.length - 1 - index);
        link[link.length - 1] = null;
        for (int i = 0; i < link.length; i++) {
            if (link[i] != null) {
                edgeArrayList.remove(link[i][index]);
                if (link[i].length - 1 - index >= 0)
                    System.arraycopy(link[i], index + 1, link[i], index, link[i].length - index - 1);
                link[i][link[i].length - 1] = null;
            }
        }
    }

    @Override
    public void removeEdge(Edge<E> e) throws IllegalArgumentException {
        if (e == null || !edgeArrayList.contains(e))
            throw new IllegalArgumentException("Unknown edge!!!");

        Vertex<V>[] endpoints = e.endVertices();
        int uIndex = vertexArrayList.indexOf(endpoints[0]);
        int vIndex = vertexArrayList.indexOf(endpoints[1]);

        link[uIndex][vIndex] = link[vIndex][uIndex] = null;
        edgeArrayList.remove(e);
    }

}
