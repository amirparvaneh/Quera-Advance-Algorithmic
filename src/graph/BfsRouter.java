package graph;

import java.util.Scanner;

public class BfsRouter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt(),
                m = scanner.nextInt(),
                s = scanner.nextInt(),
                t = scanner.nextInt();
        int[] v = new int[m * 2];
        for (int i = 0 ; i<m*2 ; i+=2){
            v[i] = scanner.nextInt();
            v[i+1] = scanner.nextInt();
        }
        
    }
}
/*
import java.util.*;

public class Main {
    public static ArrayList<Integer>[] adj;
    public static int[] distance;
    public static String[] path;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int s = sc.nextInt();
        int t = sc.nextInt();
        int[] v = new int[m * 2];
        for (int i = 0; i < m * 2; i+=2) {
            v[i] = sc.nextInt();
            v[i + 1] = sc.nextInt();
        }
        adj = new ArrayList[n + 1];
        distance = new int[n + 1];
        path = new String[n + 1];
        adj[0] = null;
        for (int i = 1; i <= n; i++) {
            adj[i] = new ArrayList<>();
            distance[i] = Integer.MAX_VALUE;
            path[i] = i + " ";
        }
        for (int i = 0; i < m * 2; i+=2) {
            adj[v[i]].add(v[i + 1]);
            adj[v[i + 1]].add(v[i]);
        }
        bfs(s);
        if (distance[t] != Integer.MAX_VALUE) {
            System.out.println(distance[t]);
            System.out.println(path[t]);
        } else {
            System.out.println("-1");
        }
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
                    path[u] = path[v] + path[u];
                    queue.add(u);
                }
            }
        }
    }
}*/
