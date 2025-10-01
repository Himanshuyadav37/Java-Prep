import java.util.ArrayList;

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

    // DFS to check if path exists
    public static boolean hasPath(ArrayList<Edge>[] graph, int src, int dest, boolean[] vis) {
        if (src == dest) {
            return true;
        }

        vis[src] = true; // mark visited

        for (int i = 0; i < graph[src].size(); i++) {
            Edge e = graph[src].get(i);
            if (!vis[e.dest]) {
                if (hasPath(graph, e.dest, dest, vis)) {
                    return true;
                }
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int v = 7;
        ArrayList<Edge>[] graph = new ArrayList[v];
        createGraph(graph);

        boolean[] vis = new boolean[v];
        System.out.println(hasPath(graph, 0, 5, vis));
    }
}
