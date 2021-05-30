package griving;

import java.util.Arrays;
import java.util.Scanner;

public class Clerk {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] array = new int[n];
        for (int i = 0 ; i < n ; i++){
            array[i] = scanner.nextInt();
        }
        System.out.println("" + solve(array));
    }
    public static int solve(int[] array){
        int currentTime = 0 ;
        int ans = 0 ;
        Arrays.sort(array);
        for (int i = 0 ; i<array.length ; i++){
            if (currentTime<array[i]){
                currentTime++;
                ans++;
            }
        }
        return currentTime;
    }
}
/*
import java.util.Arrays;
        import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("" + solve(arr));
    }

    public static int solve(int[] arr) {
        int cnt = 0;
        int timer = 0;
        Arrays.sort(arr);
        for (int i = 0; i < arr.length; i++) {
            if (timer < arr[i]) {
                cnt++;
                timer++;
            }
        }
        return cnt;
    }
}
*/
