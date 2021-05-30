package graph;

public class Primeter {
    public static void main(String[] args) {
        
    }
}
/*import java.util.*;

public class Main {
    public static ArrayList<Integer>[] adj;
    public static int[] distance;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = n - 1;
        int[] v = new int[m * 2];
        for (int i = 0; i < m * 2; i += 2) {
            v[i] = sc.nextInt();
            v[i + 1] = sc.nextInt();
        }

        adj = new ArrayList[n + 1];
        distance = new int[n + 1];
        adj[0] = null;
        for (int i = 1; i <= n; i++) {
            adj[i] = new ArrayList<>();
            distance[i] = Integer.MAX_VALUE;
        }
        for (int i = 0; i < m * 2; i += 2) {
            adj[v[i]].add(v[i + 1]);
            adj[v[i + 1]].add(v[i]);
        }
        bfs(1);
        int max = 0;
        int indexMax = -1;
        for (int i = 1; i < distance.length; i++) {
            if (distance[i] > max) {
                max = distance[i];
                indexMax = i;
            }
        }
        for (int i = 1; i <= n; i++) {
            distance[i] = Integer.MAX_VALUE;
        }
        bfs(indexMax);
        max = Arrays.stream(distance).max().getAsInt();
        System.out.println("" + max);
    }


    public static void bfs(int s) {
        Queue<Integer> queue = new LinkedList<>();
        queue.add(s);
        distance[s] = 0;

        while (queue.size() > 0) {
            int v = queue.remove();
            for (Integer u : adj[v]) {
                if (distance[u] > distance[v] + 1) {
                    distance[u] = distance[v] + 1;
                    queue.add(u);
                }
            }
        }
    }
}*/
