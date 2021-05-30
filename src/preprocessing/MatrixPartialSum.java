package preprocessing;

import java.util.Scanner;

public class MatrixPartialSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt(), q = scanner.nextInt();
        int[][] array = new int[n][n];
        int[][] query = new int[q][4];
        for (int i = 0 ;i<n ; i++){
            for (int j = 0 ; j<n ; j++){
                array[i][j] = scanner.nextInt();
            }
        }
        for (int i = 0 ; i<q ; i++){
            for (int j = 0 ; j < 4 ; j++){
                query[i][j] = scanner.nextInt();
            }
        }
    }
}
