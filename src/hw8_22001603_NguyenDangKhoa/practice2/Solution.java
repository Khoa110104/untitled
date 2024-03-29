package hw8_22001603_NguyenDangKhoa.practice2;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class Solution {
    public Node cloneGraph(Node node) {

        Node start = node;
        HashSet<Node> visited = new HashSet<>();
        HashMap<Node, Node> map = new HashMap<>();
        dfs(start, visited, map);

        addEdges(map);

        return map.get(start);
    }

    public static void addEdges(HashMap<Node, Node> map) {
        for (Map.Entry m : map.entrySet()) {
            Node originalNode = (Node) m.getKey();
            map.get(m.getKey()).neighbors.add(originalNode);
        }
    }

    public static void dfs(Node start, HashSet<Node> visited, HashMap<Node, Node> map) {
        visited.add(start);
        Node copyNode = new Node(start.val);
        map.put(start, copyNode);
        for (Node neighbor : start.neighbors) {
            if (!visited.contains(neighbor)) {
                dfs(neighbor, visited, map);
            }
        }

    }
}
