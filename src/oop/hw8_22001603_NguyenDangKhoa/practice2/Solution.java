package oop.hw8_22001603_NguyenDangKhoa.practice2;

import hw8_22001603_NguyenDangKhoa.practice2.Node;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class Solution {
    public hw8_22001603_NguyenDangKhoa.practice2.Node cloneGraph(hw8_22001603_NguyenDangKhoa.practice2.Node node) {

        hw8_22001603_NguyenDangKhoa.practice2.Node start = node;
        HashSet<hw8_22001603_NguyenDangKhoa.practice2.Node> visited = new HashSet<>();
        HashMap<hw8_22001603_NguyenDangKhoa.practice2.Node, hw8_22001603_NguyenDangKhoa.practice2.Node> map = new HashMap<>();
        dfs(start, visited, map);

        addEdges(map);

        return map.get(start);
    }

    public static void addEdges(HashMap<hw8_22001603_NguyenDangKhoa.practice2.Node, hw8_22001603_NguyenDangKhoa.practice2.Node> map) {
        for (Map.Entry m : map.entrySet()) {
            hw8_22001603_NguyenDangKhoa.practice2.Node originalNode = (hw8_22001603_NguyenDangKhoa.practice2.Node) m.getKey();
            map.get(m.getKey()).neighbors.add(originalNode);
        }
    }

    public static void dfs(hw8_22001603_NguyenDangKhoa.practice2.Node start, HashSet<hw8_22001603_NguyenDangKhoa.practice2.Node> visited, HashMap<hw8_22001603_NguyenDangKhoa.practice2.Node, hw8_22001603_NguyenDangKhoa.practice2.Node> map) {
        visited.add(start);
        hw8_22001603_NguyenDangKhoa.practice2.Node copyNode = new hw8_22001603_NguyenDangKhoa.practice2.Node(start.val);
        map.put(start, copyNode);
        for (Node neighbor : start.neighbors) {
            if (!visited.contains(neighbor)) {
                dfs(neighbor, visited, map);
            }
        }

    }
}
