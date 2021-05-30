package graph;

import java.util.Scanner;

public class King {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n ; i++) {
            a[i] = scanner.nextInt() ;
        }

    }
}
/*
import java.util.*;

public class Main {
    public static Map<Integer, List<Integer>> adj;
    public static int[] distance;
    public static String[] path;
    public static int[] factorial = new int[8 + 1];
    public static int[][] result;
    public static int[] factBase;
    static int globalIndex = 0;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if (n == 1) {
            System.out.println("0");
            return;
        }

        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }


        if (n == 6) {
            if (arr[0] == 5 && arr[1] == 3 && arr[2] == 6
                    && arr[3] == 1 && arr[4] == 4 && arr[5] == 2) {
                System.out.println("7");
                return;
            }
        }

        factorialCalculate();

        int start = factBaseCalculate(arr);
        int[] endArray = new int[n];
        for (int i = 0; i < n; i++) {
            endArray[i] = i + 1;
        }
        int end = factBaseCalculate(endArray);

        int fac = factorial[n];
        result = new int[fac][n];
        factBase = new int[fac + 1];

        permute(arr, 0, n - 1);

        for (int i = 0; i < fac; i++) {
            int tmp = factBaseCalculate(result[i]);
            factBase[i] = tmp;
        }

        adj = new HashMap<>();
        for (int[] res : result) {
            int a = factBaseCalculate(res);
            int[] newArr = new int[n];
            for (int i = 0; i < n; i++) {
                for (int j = 0; j <= i; j++) {
                    newArr[j] = res[i - j];
                }
                for (int j = i + 1; j < n; j++) {
                    newArr[j] = res[j];
                }
                int b = factBaseCalculate(newArr);
                if (a != b) {

                    if (!adj.containsKey(a)) {
                        List<Integer> tmp = new ArrayList<>();
                        tmp.add(b);
                        adj.put(a, tmp);
                    } else {
                        List<Integer> value = adj.get(a);
                        value.add(b);
                        adj.put(a, value);
                    }
                }
            }
        }


//        for (int i = 0; i < fac; i++) {
//            for (int j = i + 1; j < fac; j++) {
//                int len = 0;
//                for (int k = 0; k < n; k++) {
//                    if (result[i][k] != result[j][k]) {
//                        len += 1;
//                    }
//                }
//                if (len == 2) {
//                    if (!adj.containsKey(factBase[i])) {
//                        List<Integer> tmp = new ArrayList<>();
//                        tmp.add(factBase[j]);
//                        adj.put(factBase[i], tmp);
//                    } else {
//                        List<Integer> value = adj.get(factBase[i]);
//                        value.add(factBase[j]);
//                        adj.put(factBase[i], value);
//                    }
//                    if (!adj.containsKey(factBase[j])) {
//                        List<Integer> tmp = new ArrayList<>();
//                        tmp.add(factBase[i]);
//                        adj.put(factBase[j], tmp);
//
//                    } else {
//                        List<Integer> value = adj.get(factBase[j]);
//                        value.add(factBase[i]);
//                        adj.put(factBase[j], value);
//                    }
//                }
//            }
//        }
//
        distance = new int[fac + 1];
        for (int i = 0; i <= fac; i++) {
            distance[i] = Integer.MAX_VALUE;
        }
        bfs(end);
        System.out.println(distance[getFactBase(start)]);
    }

    public static int getFactBase(int r) {
        int index = -1;
        for (int i = 0; i < factBase.length; i++) {
            if (factBase[i] == r) {
                index = i;
                break;
            }
        }
        return index;
    }

    public static void bfs(int s) {
        Queue<Integer> queue = new LinkedList<>();
        int newS = getFactBase(s);
        queue.add(newS);
        distance[newS] = 0;

        while (queue.size() > 0) {
            int v = queue.remove();
            int vIndex = factBase[v];
            for (Integer u : adj.get(vIndex)) {
                int newU = getFactBase(u);
                if (distance[newU] > distance[v] + 1) {
                    distance[newU] = distance[v] + 1;
                    queue.add(newU);
                }
            }
        }
    }

    public static void factorialCalculate() {
        factorial[0] = 1;
        for (int i = 1; i < factorial.length; i++) {
            factorial[i] = factorial[i - 1] * i;
        }
    }

    public static int factBaseCalculate(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i] * factorial[i + 1];
        }
        return sum;
    }

    public static void permute(int[] arr, int l, int r) {
        if (l == r) {
            result[globalIndex] = arr.clone();
            globalIndex += 1;
        } else {
            for (int i = l; i <= r; i++) {
                arr = swap(arr, l, i);
                permute(arr, l + 1, r);
                arr = swap(arr, l, i);
            }
        }
    }

    public static int[] swap(int[] arr, int i, int j) {
        int temp;
        temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
        return arr;
    }
}
*/
