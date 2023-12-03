package hw8_22001603_NguyenDangKhoa.practice4;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class Solution {
    public ArrayList<Integer> bfsOfGraph(int V, ArrayList<ArrayList<Integer>> adj) {
        ArrayList<Integer> list = new ArrayList<>();
        Queue<Integer> queue = new LinkedList<>();
        boolean visited[] = new boolean[V];
        queue.add(0);
        while (!queue.isEmpty()) {
            int current = queue.remove();
            if (!visited[current]) {
                list.add(current);
                visited[current] = true;
                for (int i = 0; i < adj.get(current).size(); i++) {
                    queue.add(adj.get(current).get(i));
                }
            }
        }
        return list;
    }
}
