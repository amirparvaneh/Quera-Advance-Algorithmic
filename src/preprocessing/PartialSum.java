package preprocessing;

import java.util.Arrays;
import java.util.Scanner;

public class PartialSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt(), q = scanner.nextInt();
        long[] array = new long[n];
        for (int i = 0 ; i<n ; i++){
            array[i] = scanner.nextInt();
        }
        int[] l = new int[q],r = new int[q];
        for (int i = 0 ; i<q ; i++){
            l[i] = scanner.nextInt();
            r[i] = scanner.nextInt();
        }
        long[] ps = calculate(array);
        for (int i = 0 ; i<q; i++){
            System.out.println(ps[r[i]+1]-ps[l[i]]);
        }

    }
    public static long[] calculate(long[] a){
        long sum = 0;
        long[] ps = new long[a.length+1];
        ps[0]=0;
        for (int i = 1 ; i<=a.length ; i++){
            sum += a[i-1];
            ps[i] = sum;
        }
        return ps;
    }

}
/*
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int q = sc.nextInt();
        long[] a = new long[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextLong();
        }
        int[] l = new int[q];
        int[] r = new int[q];
        for (int i = 0; i < q; i++) {
            l[i] = sc.nextInt();
            r[i] = sc.nextInt();
        }
        long[] ps = calculate(a);
        for (int i = 0; i < q; i++) {
            System.out.println(ps[r[i] + 1] - ps[l[i]]);
        }
    }

    public static long[] calculate(long[] a) {
        long sum = 0;
        long[] ps = new long[a.length + 1];
        ps[0] = 0;
        for (int i = 1; i <= a.length; i++) {
            sum += a[i - 1];
            ps[i] = sum;
        }
        return ps;
    }
}
*/
