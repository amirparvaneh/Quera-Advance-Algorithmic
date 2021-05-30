package graph;

import java.util.Scanner;

public class DFS {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt(), m = scanner.nextInt(),
                s = scanner.nextInt(), t = scanner.nextInt();
        int[] v = new int[m * 2];
        for (int i = 0; i < m * 2; i += 2) {
            v[i] = scanner.nextInt();
            v[i + 1] = scanner.nextInt();

        }
    }

}
/*
import java.util.*;

public class Main {
    public static ArrayList<Integer>[] adj;
    public static boolean[] mark;

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
        adj[0] = null;
        mark = new boolean[n + 1];
        mark[0] = false;
        for (int i = 1; i <= n; i++) {
            adj[i] = new ArrayList<>();
            mark[i] = false;
        }
        for (int i = 0; i < m * 2; i+=2) {
            adj[v[i]].add(v[i + 1]);
            adj[v[i + 1]].add(v[i]);
        }
        dfs(s);
        String message = mark[t] == true ? "YES" : "NO";
        System.out.println(message);
    }

    public static void dfs(int v) {
        mark[v] = true;
        for (int i = 0; i < adj[v].size(); i++) {
            int elm = adj[v].get(i);
            if (mark[elm] == false) {
                dfs(elm);
            }
        }
    }
}*/
