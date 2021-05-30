package DynamicProgramming;

import java.util.Scanner;

public class MaxOfWeight {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt(), m = scanner.nextInt();
        int[][] array = new int[n][m];
        for (int i = 0 ; i<n ; i++){
            for (int j = 0 ; j<m ; j++){
                array[i][j] = scanner.nextInt();
            }
        }


    }

}
