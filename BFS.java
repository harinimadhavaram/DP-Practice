import java.util.*;

public class BFS {

    private int V;
    private LinkedList<Integer> adj[];

    BFS(int v) {
        V = v;
        adj = new LinkedList[v];
        for (int i = 0; i < v; ++i)
            adj[i] = new LinkedList();
    }

    public void addEdge(int v, int w) {
        adj[v].add(w);
    }

    public void BFSRecur(Queue<Integer> q, boolean visited[]) {
        if (q.isEmpty())
            return;
        int s = q.poll();
        visited[s] = true;
        System.out.println(s + " ");
        for (int i : adj[s]) {
            if (!visited[i]) {
                visited[i] = true;
                q.add(i);
            }
        }
        BFSRecur(q, visited);

    }

    public void BFSIter(int s) {
        boolean visited[] = new boolean[V];

        Queue<Integer> q = new LinkedList<>();

        visited[s] = true;
        q.add(s);

        while (!q.isEmpty()) {
            s = q.poll();
            System.out.println(s + " ");
            for (int i : adj[s]) {
                if (!visited[i]) {
                    visited[i] = true;
                    q.add(i);
                }
            }
        }
    }

    public static void main(String args[]) {
        BFS g = new BFS(4);

        g.addEdge(0, 1);
        g.addEdge(0, 2);
        g.addEdge(1, 2);
        g.addEdge(2, 0);
        g.addEdge(2, 3);
        g.addEdge(3, 3);

        System.out.println("Following is Breadth First Traversal " + "(starting from vertex 2)");

        // g.BFSIter(2);
        Queue<Integer> q = new LinkedList<>();
        boolean visited[] = new boolean[4];
        q.add(2);
        g.BFSRecur(q, visited);
        

    }

}
