package Java.Graph.AdjacencyList;

import java.util.LinkedList;

public class GraphLinkedList {

    LinkedList<Integer>[] adj;
    private int V;
    private int E;

    public GraphLinkedList(int nodes){
        this.V = nodes;
        this.E = 0;
        this.adj = new LinkedList[nodes];
        for (int v = 0; v < V; v++) {
            adj[v] = new LinkedList<>();
        }
    }

    public void addEdge(int u, int v){
        adj[u].add(v);
        adj[v].add(u);
        E++;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(V + " vertices "+ E +" edges" + "\n" );
        for (int i = 0; i < V; i++) {
            sb.append(i + ": ");
            for (int j : adj[i]) {
                sb.append(j + " ");
            }
            sb.append("\n");
        }
        return sb.toString();
    }
    public static void main(String[] args) {
        GraphLinkedList g = new GraphLinkedList(4);
        g.addEdge(0,1);
        g.addEdge(1,2);
        g.addEdge(2,3);
        g.addEdge(3,0);
        System.out.println(g);
    }
}
