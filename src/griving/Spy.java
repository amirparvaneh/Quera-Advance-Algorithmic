package griving;

import java.util.Scanner;

public class Spy {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        String[] string1 = new String[n];
        for (int i = 0 ; i<n ; i++){
            string1[i] = scanner.next();
        }
        int q = scanner.nextInt();
        String[] string2 = new String[q];
        for (int j = 0 ; j < q ; j++){
            string2[j] = scanner.next();
        }
    }
}
