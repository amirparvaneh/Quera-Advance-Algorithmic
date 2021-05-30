package DynamicProgramming;
import java.util.Scanner;

public class LCS {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String s = input.next();
        String p = input.next();

        int[][] dp = new int[s.length() + 1][p.length() + 1];
        int[][] par = new int[s.length() + 1][p.length() + 1];

        for (int i = 0; i <= s.length(); i++)
            for (int j = 0; j <= p.length(); j++)
                if (i == 0 || j == 0) {
                    dp[i][j] = 0;
                } else {
                    if (p.charAt(j - 1) == s.charAt(i - 1)) {
                        if (dp[i - 1][j] > dp[i][j - 1]) {
                            if (dp[i - 1][j] > dp[i - 1][j - 1] + 1) {
                                dp[i][j] = dp[i - 1][j];
                                par[i][j] = 0;
                            } else {
                                dp[i][j] = dp[i - 1][j - 1] + 1;
                                par[i][j] = 2;
                            }
                        } else {
                            if (dp[i][j - 1] > dp[i - 1][j - 1] + 1) {
                                dp[i][j] = dp[i][j - 1];
                                par[i][j] = 1;
                            } else {
                                dp[i][j] = dp[i - 1][j - 1] + 1;
                                par[i][j] = 2;
                            }
                        }
                    } else {
                        if (dp[i - 1][j] > dp[i][j - 1]) {
                            dp[i][j] = dp[i - 1][j];
                            par[i][j] = 0;
                        } else {
                            dp[i][j] = dp[i][j - 1];
                            par[i][j] = 1;
                        }
                    }
                }
        //System.out.println(dp[s.length()][p.length()]);
        String answer = "";
        int i = s.length();
        int j = p.length();
        do {
            switch (par[i][j]) {
                case 0:
                    i--;
                    break;
                case 1:
                    j--;
                    break;
                case 2:
                    answer += p.charAt(j - 1);
                    i--;
                    j--;
                    break;
            }
        } while (i != 0 && j != 0);

        for (int a = answer.length() - 1; a >= 0; a--)
            System.out.print(answer.charAt(a));
    }
}