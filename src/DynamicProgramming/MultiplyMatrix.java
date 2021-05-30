package DynamicProgramming;

import java.util.*;

public class MultiplyMatrix {

    private static int c = 1000_000_007;

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        long[] a = new long[n + 2];
        for (int i = 1; i <= n + 1; i++) {
            a[i] = in.nextInt();
        }
        long min, x;
        long[][] dp = new long[n + 1][n + 1];
        for (int i = 2; i <= n; i++) {
            for (int j = 1; j <= n - i + 1; j++) {
                min = Long.MAX_VALUE;
                for (int k = 1; k < i; k++) {
                    x = dp[k][j];
                    x += dp[i - k][j + k];
                    x += (a[j] * a[j + k] * a[i + j]);
                    if (x < min) {
                        min = x;
                    }
                }
                dp[i][j] = min;
            }
        }
        System.out.println(dp[n][1]);

    }

}