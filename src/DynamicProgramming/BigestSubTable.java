package DynamicProgramming;

import java.util.Arrays;
import java.util.Scanner;

public class BigestSubTable {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt(), m =scanner.nextInt();
        int[][] array = new int[n][m];
        for (int i = 0 ; i<n ; i++){
            for (int j = 0 ; j<m ; j++ ){
                array[i][j] = scanner.nextInt();
            }
        }
        int b = 0;
        for (int i = 0 ; i<m ; i++){
            for (int j = 0 ; j<n ; j++){
                b += array[i][j];
            }
        }
    }
}
