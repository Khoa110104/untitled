package hw8_22001603_NguyenDangKhoa.practice2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.*;

public class GFG {
    static class FastReader {
        BufferedReader br;
        StringTokenizer st;

        public FastReader() {
            br = new BufferedReader(new InputStreamReader(System.in));
        }

        String next() {
            while (st == null || !st.hasMoreElements()) {
                try {
                    st = new StringTokenizer(br.readLine());
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            return st.nextToken();
        }

        String nextLine() {
            String str = "";
            try {
                str = br.readLine();
            } catch (IOException e) {
                e.printStackTrace();
            }
            return str;
        }

        Integer nextInt() {
            return Integer.parseInt(next());
        }
    }

    static ArrayList<Node> bfs(Node src) {
        ArrayList<Node> ans = new ArrayList<>();
        HashSet<Node> visited = new HashSet<>();
        Queue<Node> q = new LinkedList<>();
        q.add(src);
        visited.add(src);

        while (!q.isEmpty()) {
            Node u = q.poll();
            ans.add(u);
            ArrayList<Node> v = u.neighbors;
            for (Node x : v) {
                if (!visited.contains(x)) {
                    visited.add(x);
                    q.add(x);
                }
            }
        }

        return ans;
    }

    static boolean checkedClone(Node prev, Node new1) {
        ArrayList<Node> prevAns = bfs(prev);
        ArrayList<Node> newAns = bfs(new1);
        for (int i = 0; i < prevAns.size(); i++) {
            if (prevAns.get(i) == newAns.get(i))
                return false;
        }
        return true;
    }

    public static void main(String[] args) throws IOException {
        FastReader sc = new FastReader();
        PrintWriter out = new PrintWriter(System.out);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            Node root = null;
            Node v[] = new Node[n];
            for (int i = 0; i < n; i++) v[i] = new Node(i);
            Solution ob = new Solution();
            for (int i = 0; i < n; i++) {
                ArrayList<Node> list = new ArrayList<>();
                String arr[] = sc.nextLine().split(" ");
                for (String s : arr) {
                    list.add(v[Integer.parseInt(s)]);
                }
                v[i].neighbors = list;
            }
            ArrayList<Node> prev = bfs(v[0]);
            Node cloneGraph = ob.cloneGraph(v[0]);
            ArrayList<Node> now = bfs(cloneGraph);
            out.println(checkedClone(v[0], cloneGraph) ? "1" : "0");
        }
        out.flush();
    }
}
