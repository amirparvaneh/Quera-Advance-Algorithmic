package DynamicProgramming;

import java.util.Scanner;

public class Choice {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int q = scanner.nextInt();
        int[] n = new int[q];
        int[] k = new int[q];
        int[][] array = new int[q][2];
        for (int i = 0; i < q; i++) {
            for (int j = 0; j < 2; j++) {
                array[i][j] = scanner.nextInt();
            }
        }
        for (int i = 0; i < q; i++) {
            n[i] = array[i][0];
        }
        for (int i = 0; i < q; i++) {
            k[i] = array[i][1];
        }
        for (int i = 0 ; i<q ; i++){
            System.out.println(nCrModp(n[i],k[i]));
        }

    }
    static int nCrModp(int n, int r)
    {
        if (r > n - r)
            r = n - r;

        // The array C is going to store last
        // row of pascal triangle at the end.
        // And last entry of last row is nCr
        int C[] = new int[r + 1];

        C[0] = 1; // Top row of Pascal Triangle

        // One by constructs remaining rows of Pascal
        // Triangle from top to bottom
        for (int i = 1; i <= n; i++) {

            // Fill entries of current row using previous
            // row values
            for (int j = Math.min(i, r); j > 0; j--)

                // nCj = (n-1)Cj + (n-1)C(j-1);
                C[j] = (C[j] + C[j - 1])  % 1000000007;
        }
        return C[r];
    }
}