import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class Main {

    static class Edge {
        int src;
        int dest;
        int wt;

        public Edge(int s, int d, int w) {
            this.src = s;
            this.dest = d;
            this.wt = w;
        }
    }

    // Function to create graph
    static void createGraph(ArrayList<Edge>[] graph) {
        int v = 7; // number of vertices

        // initialize adjacency lists
        for (int i = 0; i < v; i++) {
            graph[i] = new ArrayList<>();
        }

        // add edges (undirected graph)
        graph[0].add(new Edge(0, 1, 2));
        graph[0].add(new Edge(0, 2, 4));

        graph[1].add(new Edge(1, 0, 2));
        graph[1].add(new Edge(1, 3, 7));

        graph[2].add(new Edge(2, 0, 4));
        graph[2].add(new Edge(2, 4, 1));

        graph[3].add(new Edge(3, 1, 7));
        graph[3].add(new Edge(3, 4, 3));
        graph[3].add(new Edge(3, 5, 2));

        graph[4].add(new Edge(4, 2, 1));
        graph[4].add(new Edge(4, 3, 3));
        graph[4].add(new Edge(4, 6, 5));

        graph[5].add(new Edge(5, 3, 2));
        graph[5].add(new Edge(5, 6, 6));

        graph[6].add(new Edge(6, 4, 5));
        graph[6].add(new Edge(6, 5, 6));
    }

    // BFS Traversal
    public static void bfs(ArrayList<Edge>[] graph, int start) {
        Queue<Integer> q = new LinkedList<>();
        boolean[] vis = new boolean[graph.length];

        q.add(start);

        while (!q.isEmpty()) {
            int curr = q.remove();

            if (!vis[curr]) {
                System.out.print(curr + " ");
                vis[curr] = true;

                for (int i = 0; i < graph[curr].size(); i++) {
                    Edge e = graph[curr].get(i);
                    q.add(e.dest);
                }
            }
        }
    }

    // DFS Traversal
    public static void dfs(ArrayList<Edge>[] graph, int curr, boolean[] vis) {
        System.out.print(curr + " ");
        vis[curr] = true;

        for (int i = 0; i < graph[curr].size(); i++) {
            Edge e = graph[curr].get(i);

            if (!vis[e.dest]) {   // ✅ FIXED: check neighbor, not curr
                dfs(graph, e.dest, vis);
            }
        }
    }


    public static boolean hasPath(ArrayList<Edge> graph , int src, int dest, int vis[]){
        if(src == dest){
            return true;
        }

        for (int i = 0; i < graph[src].size(); i++) {
            Edge e = graph[src].get(i);

            // e.dest = neibhour
            if(!vis[e.dest] && hasPath(graph, e.dest, vis)){
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int v = 7;
        ArrayList<Edge>[] graph = new ArrayList[v];
        createGraph(graph);

        System.out.println("BFS Traversal starting from node 0:");
        bfs(graph, 0);

        System.out.println("\nDFS Traversal starting from node 0:");
        dfs(graph, 0, new boolean[v]);
    }
}
