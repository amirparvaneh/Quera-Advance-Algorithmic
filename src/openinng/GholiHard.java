package openinng;

import java.util.Scanner;

public class GholiHard {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt(), q = scanner.nextInt();
        int[] c = new int[n];
        int[] d = new int[q];
        for (int i = 0 ; i<n ; i++){
            c[i] = scanner.nextInt();
        }
        for (int i = 0 ; i<n ; i++){
            d[i] = scanner.nextInt();
        }
    }

}
