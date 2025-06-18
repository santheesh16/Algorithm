package Java.Graph;

import java.util.LinkedList;
import java.util.Stack;

public class UndirectedDFS {
    LinkedList<Integer>[] adj;
    private int V;
    private int E;

    public UndirectedDFS(int nodes){
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

    public void dfs(int s){
        boolean[] visited = new boolean[V];
        Stack<Integer> stack = new Stack<>();
        stack.push(s);
        while(!stack.isEmpty()){
            int u = stack.pop();
            if(!visited[u]){
                visited[u] = true;
                System.out.println(u + " ");
                for (int v : adj[u]) {
                    if (!visited[v]) {
                        stack.push(v);
                    }
                }
            }
        }
    }
    public static void main(String[] args) {
        UndirectedDFS g = new UndirectedDFS(5);
        g.addEdge(0,1);
        g.addEdge(1,2);
        g.addEdge(2,3);
        g.addEdge(3,0);
        g.addEdge(3,4);
        g.dfs(0);
    }
}
