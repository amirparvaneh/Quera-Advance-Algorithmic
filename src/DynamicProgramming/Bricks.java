package DynamicProgramming;

import java.util.Scanner;

public class Bricks {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int q = scanner.nextInt();
        int[] array = new int[q];
        for (int i = 0 ; i<q ; i++){
            array[i] = scanner.nextInt();
        }
        for (int i = 0 ; i<q ; i++){
            System.out.println(f(array[i]));
        }
    }
    static int f(int n){
        int ans = 0;
        if (n <3){
            ans = 1;
        }else if (n==3){
            ans = 2;
        }if (n>3)ans = (f(n-1) % 1000000007+
                f(n-2) % 1000000007+
                f(n-3) % 1000000007-f(n-4) % 1000000007) % 1000000007;
        return ans;
    }
}
