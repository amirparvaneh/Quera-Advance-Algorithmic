package period1;

import java.util.Scanner;

public class Steps {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        System.out.println(fromItoN(0,n));

    }
    static int fromItoN(int i , int n){
        if (i>n)return 0;
        if (i==n)return 1;
        else return fromItoN(i+1 , n) + fromItoN(i+2,n)+fromItoN(i+5,n);
    }
}
