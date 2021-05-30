package period2;

import java.util.Scanner;

public class TorajSequence {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int k = scanner.nextInt(), d = scanner.nextInt();

    }
}

/*
import java.util.*;

public class Test {

    private static final int c = 1000_000_007;

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int k = in.nextInt();
        int d = in.nextInt();
        long[][] a = new long[k + 1][k * d + 20];
        a[0][10] = 1;
        for (int i = 1; i <= k; i++) {
            for (int j = 10; j <= d * i + 10; j++) {
                int l = (j - d > 10) ? j - d - 1 : 0;
                int r = (j + d < (d * (i - 1)+10)) ? j + d : (d * (i - 1)+10);
                a[i][j] = c+a[i - 1][r] - a[i - 1][l] + a[i][j - 1];
                a[i][j] %= c;
            }
        }

        System.out.println(a[k][d * k + 10] % c);
    }
}
*/
