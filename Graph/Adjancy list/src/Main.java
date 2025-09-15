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

    public static void main(String[] args) {
        int v = 5; // number of vertices
        ArrayList<Edge>[] graph = new ArrayList[v];

        // initialize adjacency lists
        for (int i = 0; i < v; i++) {
            graph[i] = new ArrayList<>();
        }

        // 0 vertex
        graph[0].add(new Edge(0, 1, 5));

        // 1 vertex
        graph[1].add(new Edge(1, 0, 5));

        // 2 vertex
        graph[2].add(new Edge(2, 3, 1));

        // 3 vertex
        graph[3].add(new Edge(3, 4, 3));

        // Just to test, print adjacency list
        for (int i = 0; i < v; i++) {
            System.out.print("Vertex " + i + " -> ");
            for (Edge e : graph[i]) {
                System.out.print("(" + e.src + "->" + e.dest + " : " + e.wt + ") ");
            }
            System.out.println();
        }
    }
}
