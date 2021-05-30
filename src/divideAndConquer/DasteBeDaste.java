package divideAndConquer;

import java.util.*;

public class DasteBeDaste {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int x = 1;
        while (n-- > 0) {
            x *= 2;
        }
        int[] a = new int[x];
        for (int i = 0; i < x; i++) {
            a[i] = in.nextInt();
        }
        System.out.println(f(a, 0, x));
    }

    private static long f(int[] a, int i, int n) {
        if (i == n-2) {
            return 0l+a[i]+a[i+1];
        }
        int mid = (n + i) / 2;
        long x = f(a, i, mid) + max(a, mid, n);
        long y = f(a, mid, n) + max(a, i, mid);
        if (x > y) {
            return x;
        } else {
            return y;
        }
    }

    private static long max(int[] a, int i, int n) {
        int m = 0;
        while (i < n) {
            if (a[i] > m) {
                m = a[i];
            }
            i++;
        }
        return m;
    }

}