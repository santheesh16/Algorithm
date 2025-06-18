package Java.Graph.AdjacencyMatrix;

import java.util.Arrays;

public class GraphWithVertexEdge {
    private int V;
    private int E;
    private int[][] adjMatrix;

    public GraphWithVertexEdge(int nodes){
        this.V = nodes;
        this.E = 0;
        this.adjMatrix = new int[nodes][nodes];
    }

    public void addEdge(int u, int v){
        adjMatrix[u][v] = 1;
        adjMatrix[v][u] = 1;
        E++;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(V + " vertices "+ E +" edges" + "\n" );
        for (int i = 0; i < V; i++) {
            sb.append(i + ": ");
            for (int j : adjMatrix[i]) {
                sb.append(j + " ");
            }
            sb.append("\n");
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        GraphWithVertexEdge g = new GraphWithVertexEdge(4);
        g.addEdge(0,1);
        g.addEdge(1,2);
        g.addEdge(2,3);
        g.addEdge(3,0);
        System.out.println(g.toString());
    }

}
