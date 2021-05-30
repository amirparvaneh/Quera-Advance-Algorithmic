package griving;

import java.util.Scanner;

public class EnergyDrink {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt(), k = scanner.nextInt();
        int[][] array = new int[n][2];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < 2; j++) {
                array[i][j] = scanner.nextInt();
            }
        }
        int b[] = new int[n];
        for (int i = 0; i < n; i++) {
            b[i] = array[i][0];
        }
        int a[] = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = array[i][1];
        }

        for (int i = 0 ; i<n ; i++){
            if (b[i]<a[i] && k>= 0){
                k = k - b[i] + a[i];
            }
        }
        System.out.println(k);
    }
}