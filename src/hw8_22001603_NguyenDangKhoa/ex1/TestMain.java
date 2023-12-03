package hw8_22001603_NguyenDangKhoa.ex1;

import hw8_22001603_NguyenDangKhoa.Edge;
import hw8_22001603_NguyenDangKhoa.Vertex;

public class TestMain {
    public static void main(String[] args) {
        UndirectedUnweightedGraph<String, Integer> graph = new UndirectedUnweightedGraph<>();

        // Insert vertices
        Vertex<String> vertexA = graph.insertVertex("A");
        Vertex<String> vertexB = graph.insertVertex("B");
        Vertex<String> vertexC = graph.insertVertex("C");
        Vertex<String> vertexD = graph.insertVertex("D");

        // Insert edges
        Edge<Integer> edge1 = graph.insertEdge(vertexA, vertexB, 1);
        Edge<Integer> edge2 = graph.insertEdge(vertexB, vertexC, 2);
        Edge<Integer> edge3 = graph.insertEdge(vertexC, vertexA, 3);
        Edge<Integer> edge4 = graph.insertEdge(vertexA, vertexD, 4);

        // Test numVertices and numEdges
        System.out.println("Số đỉnh: " + graph.numVertices());
        System.out.println("Số cạnh: " + graph.numEdges());

        // Test vertices and edges
        System.out.println("Đỉnh :");
        for (Vertex<String> vertex : graph.vertices()) {
            System.out.println(vertex.getValue());
        }

        System.out.println("Cạnh: ");
        for (Edge<Integer> edge : graph.edges()) {
            System.out.println(edge.getValue());
        }

        // Test deg
        System.out.println("Degree: " + graph.deg());

        // Test linked
        System.out.println("Các đỉnh liên kết với A:");
        for (Vertex<String> linkedVertex : graph.linked(vertexA)) {
            System.out.println(linkedVertex.getValue());
        }

        // Test outDegree
        System.out.println("Out degree của A: " + graph.outDegree(vertexA));

        // Test inDegree
        System.out.println("In degree của A: " + graph.inDegree(vertexA));

        // Test outgoingEdges
        System.out.println("Cạnh đi từ A:");
        for (Edge<Integer> outgoingEdge : graph.outgoingEdges(vertexA)) {
            System.out.println(outgoingEdge.getValue());
        }

        // Test incomingEdges
        System.out.println("Cạnh đi đến A:");
        for (Edge<Integer> incomingEdge : graph.incomingEdges(vertexA)) {
            System.out.println(incomingEdge.getValue());
        }

        // Test getEdge
        Edge<Integer> retrievedEdge = graph.getEdge(vertexA, vertexB);
        System.out.println("Giá trị cạnh được lấy: " + retrievedEdge.getValue());

        // Test endVertices
        Vertex<String>[] endVertices = graph.endVertices(edge1);
        System.out.println("Đỉnh đối của edge1: " + endVertices[0].getValue() + ", " + endVertices[1].getValue());

        // Test opposite
        Vertex<String> oppositeVertex = graph.opposite(vertexA, edge1);
        System.out.println("Đỉnh đối diện của A ở edge1: " + oppositeVertex.getValue());

        // Test removeEdge
        graph.removeEdge(edge1);
        System.out.println("Số cạnh sau khi loại bỏ: " + graph.numEdges());

        // Test removeVertex
        graph.removeVertex(vertexA);
        System.out.println("Số đỉnh sau khi loại bỏ: " + graph.numVertices());
    }
}
