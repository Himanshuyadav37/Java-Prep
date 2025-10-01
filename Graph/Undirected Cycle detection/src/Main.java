import java.util.ArrayList;

public class Main {

    static class Edge {
        int src;
        int dest;

        public Edge(int s, int d) {
            this.src = s;
            this.dest = d;
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
        graph[0].add(new Edge(0, 1));
        graph[0].add(new Edge(0, 2));

        graph[1].add(new Edge(1, 0));
        graph[1].add(new Edge(1, 3));

        graph[2].add(new Edge(2, 0));
        graph[2].add(new Edge(2, 4));

        graph[3].add(new Edge(3, 1));
        graph[3].add(new Edge(3, 4));
        graph[3].add(new Edge(3, 5));

        graph[4].add(new Edge(4, 2));
        graph[4].add(new Edge(4, 3));
        graph[4].add(new Edge(4, 6));

        graph[5].add(new Edge(5, 3));
        graph[5].add(new Edge(5, 6));

        graph[6].add(new Edge(6, 4));
        graph[6].add(new Edge(6, 5));
    }

    // Detect cycle in an undirected graph
    public static boolean detectCycle(ArrayList<Edge>[] graph) {
        boolean[] vis = new boolean[graph.length];

        for (int i = 0; i < graph.length; i++) {
            if (!vis[i]) {
                if (detectCycleUtil(graph, vis, i, -1)) {
                    return true; // cycle exists
                }
            }
        }
        return false;
    }

    // DFS utility function
    public static boolean detectCycleUtil(ArrayList<Edge>[] graph, boolean[] vis, int curr, int parent) {
        vis[curr] = true;

        for (int i = 0; i < graph[curr].size(); i++) {
            Edge e = graph[curr].get(i);

            // Case 1: not visited
            if (!vis[e.dest]) {
                if (detectCycleUtil(graph, vis, e.dest, curr)) {
                    return true;
                }
            }
            // Case 2: already visited but not parent → cycle found
            else if (e.dest != parent) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int v = 7;
        ArrayList<Edge>[] graph = new ArrayList[v];
        createGraph(graph);

        System.out.println("Is Cycle exists :  " + detectCycle(graph));
    }
}
