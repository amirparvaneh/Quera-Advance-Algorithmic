package timeAnalysis;

import java.util.Scanner;

public class TriangleSimple {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int answer = 0;
        for (int a = 0 ; a<n ; a++ ){
            for ( int b = a ; b<n ; b++){
                int c = n-a-b;
                if (a+b>c&& c>=b){
                    answer += 1;
                }
            }
        }
        System.out.println(answer);
    }
}
