package DynamicProgramming;
//very hard
import java.util.Scanner;

public class GoingTochal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
    }
}
/*
import java.util.*;

public class Main {

    public static int mod = 1000000007;

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        List h = new ArrayList();
        for (int i = 0; i < n; i++) {
            h.add(in.nextInt());
        }
        System.out.println(letsGoTochaal(h, n));
    }

    public static int letsGoTochaal(List<Integer> h, int n) {
        int[][][] dp = new int[n][n + 1][n + 1];

        int[] cmp = compressed(h);

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                dp[i][i][j] = 1;
            }
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                dp[i][i + 1][j] = 1 + (cmp[i] >= j ? 1 : 0);
            }
        }

        for (int sizeOfSegment = 2; sizeOfSegment <= n; sizeOfSegment++) {
            for (int l = 0; l + sizeOfSegment <= n; l++) {
                int r = l + sizeOfSegment;
                for (int k = 0; k < n; k++) {
                    dp[l][r][k] = (dp[l + 1][r][k] + dp[l][r - 1][k] - dp[l + 1][r - 1][k]) % mod;
                    if (cmp[l] == cmp[r - 1] && cmp[l] >= k) {
                        dp[l][r][k] = (dp[l][r][k] + dp[l + 1][r - 1][cmp[l]]) % mod;
                    }
                }
            }
        }
        return (dp[0][n][0] + mod - 1) % mod;
    }

    private static int[] compressed(List<Integer> h) {
        SortedSet<Integer> set = new TreeSet<>(h);
        List<Integer> tm = new ArrayList<>();
        tm.addAll(set);

        int[] compressed = new int[h.size()];
        for (int i = 0; i < h.size(); i++) {
            int x = Collections.binarySearch(tm, h.get(i));
            compressed[i] = x + 1;
        }
        return compressed;
    }

}*/
