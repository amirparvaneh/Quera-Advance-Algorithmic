package period1;
import java.util.Arrays;
import java.util.Scanner;

public class BarareCompany {

    public static void main(String[] args) {
        Scanner text = new Scanner(System.in);

        int m = Integer.parseInt(text.next());
        int n = Integer.parseInt(text.next());
        long need[] = new long[n];
        long ans = 0;

        for (int i = 0; i < n; i++) {
            need[i] = Integer.parseInt(text.next());
        }
        Arrays.sort(need);
        while(m > 0){
            long cut = 0;
            int j = findAbsoluteMax(need);
            if(j == 0){
                for (int i = 0; i < n; i++) {
                    if(i < m%n)
                        need[i] -= (m/n + 1);
                    else
                        need[i] -= m/n;
                }
                break;
            }else if( (need[j]-need[j-1])*(n-j) >= m ){
                for (int i = n-1; i >= j; i--) {
                    if(i >= n-m%(n-j))
                        need[i] -= (m/(n-j) + 1);
                    else
                        need[i] -= m/(n-j);
                }
                break;
            }else{
                cut = (need[j]-need[j-1]);
                for (int i = n-1; i >= j; i--) {
                    need[i] -= cut;
                }
                m -= cut*(n-j);
            }
        }

        for (int i = 0; i < n; i++) {
            //System.out.println(need[i]);
            ans += need[i]*need[i];
            //System.out.println(ans);
        }
        System.out.println(ans);

    }

    private static int findAbsoluteMax(long[] need) {
        //int max = need[0];
        int i = need.length-1;

        while(i > 0){
            if(need[i] > need[i-1])
                return i;
            i--;
        }
        return i;
    }

}