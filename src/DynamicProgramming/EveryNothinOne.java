package DynamicProgramming;

import java.util.Scanner;

public class EveryNothinOne {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt(),s = scanner.nextInt();

    }
}
/*
import java.util.Scanner;

public class code {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int packs = input.nextInt();
        int money = input.nextInt();
        int[][] cost = new int[packs][];
        int[] number = new int[packs];
        int[] sum = new int[packs];
        int[] min = new int[packs];
        for (int i = 0; i < packs; i++) {
            number[i] = input.nextInt();
            cost[i] = new int[number[i]];
            min[i] = Integer.MAX_VALUE;
            for (int j = 0; j < number[i]; j++) {
                cost[i][j] = input.nextInt();
                sum[i] += cost[i][j];
                if (cost[i][j] < min[i])
                    min[i] = cost[i][j];
            }
        }
        int[][] dp = new int[packs][money + 1];
        int[][] par = new int[packs][money + 1];


        for (int i = 0; i < packs; i++)
            for (int j = 0; j < money + 1; j++) {

                if (i != 0)
                    dp[i][j] = dp[i - 1][j];

                if (j == 0)
                    dp[i][j] = 0;
                else {
                    if (sum[i] <= j) {
                        if (i == 0) {
                            dp[i][j] = number[i];
                            par[i][j] = 2;
                        } else if (dp[i - 1][j - sum[i]] + number[i] > dp[i - 1][j]) {
                            dp[i][j] = dp[i - 1][j - sum[i]] + number[i];
                            par[i][j] = 2;
                        }
                    }
                    if (min[i] <= j && par[i][j] == 0) {
                        if (i == 0) {
                            dp[i][j] = 1;
                            par[i][j] = 1;
                        } else if (dp[i - 1][j - min[i]] + 1 > dp[i - 1][j]) {
                            dp[i][j] = dp[i - 1][j - min[i]] + 1;
                            par[i][j] = 1;
                        }
                    }
                }
            }
        System.out.println(dp[packs - 1][money]);
        int s = money;
        int[] answer = new int[packs];
        for (int i = packs - 1; i >= 0; i--) {
            answer[i] = par[i][s];
            if (par[i][s] == 1)
                s -= min[i];
            else if (par[i][s] == 2)
                s -= sum[i];
        }
        for (int a : answer)
            System.out.print(a);
    }
}*/
