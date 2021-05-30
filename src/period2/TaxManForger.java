package period2;

import java.util.Scanner;

public class TaxManForger {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] dp = new int[100005];
        dp[0] = 1;
        dp[1]= 2;
        dp[2] = 3;
        for (int i = 3 ; i<= n ; i++){
            dp[i] = (dp[i-1] + dp[i-3])% 1000000007;
        }
        int[] gn = {2,4,4};
        if (n<3){
            System.out.println(gn[n]);
        }else System.out.println(dp[n]);
    }
}
/*
import java.util.*;

public class Main {
    private static final int c = 1000_000_007;

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        long[][] a = new long[n+6][4];
        a[1][0] = 1;
        a[1][1] = 1;
        a[1][2] = 1;
        a[1][3] = 1;
        for (int i = 2; i < n; i++) {
            a[i][0] = (a[i - 1][0] + a[i - 1][2])%c;
            a[i][1] = a[i - 1][0];
            a[i][2] = a[i - 1][1];
        }
        if (n==1) {
            System.out.println("2");
        } else if (n==2) {
            System.out.println("4");
        } else {
            System.out.println((a[n-1][0]+a[n-1][1]+a[n-1][2])%c);
        }
    }

}*/
