package codestar;


import java.util.Scanner;

public class DontLate {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        int  x = scanner.nextInt();
        String[] array = new String[x];
        for (int i = 0 ; i<x ; i++){
            array[i] = scanner.next();
        }
        int ans = 0;
        for (int i = 0 ; i<array.length;i++){
            if (str.contains(array[i])){
                ans++;
            }
        }
        System.out.println(ans);
    }
}
