package Induction;

import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long x = scanner.nextInt();
        long m = 0;
        while (x>=10){
            long sum = 0;
            while (x>0){
                m =  x%10;
                sum = sum + m;
                x = x/10;
            }
            x = sum;
        }
        System.out.println(x);
    }
}
//answer:
  /*  int m, n, sum = 0;
    Scanner s = new Scanner(System.in);
        m = s.nextInt();
                while(m > 0)
                {
                n = m % 10;
                sum = sum + n;
                m = m / 10;
                }
                System.out.println(sum);*/