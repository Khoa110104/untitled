package hw8_22001603_NguyenDangKhoa.practice3;

import java.util.ArrayList;

public class Solution {
    public ArrayList<Integer> dfsOfGraph(int V, ArrayList<ArrayList<Integer>> adj) {
        ArrayList<Integer> list = new ArrayList<>();
        boolean[] vis = new boolean[V];
        dfs(adj, vis, list, 0);
        return list;
    }

    public void dfs(ArrayList<ArrayList<Integer>> adj, boolean[] vis, ArrayList<Integer> ans, int current) {
        ans.add(current);
        vis[current] = true;
        for (int temp : adj.get(current)) {
            if (!vis[temp])
                dfs(adj, vis, ans, temp);
        }
    }
}
