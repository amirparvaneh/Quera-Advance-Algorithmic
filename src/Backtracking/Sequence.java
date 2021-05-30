package Backtracking;

import java.util.Scanner;

public class Sequence {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        for (int i = 0 ; i<n ; i++){
            int len = scanner.nextInt();
            int[] seq = new int[len];
            for (int j = 0 ; j<len ; j++){
                seq[j] = scanner.nextInt();
            }
            find(n,len,seq);
        }

    }
    static int find(int n , int current_sq , int[] seq){
        boolean[] mark = new boolean[current_sq];
        if (current_sq==n)return 1;
        int result = 0;
        for (int i = 0 ; i<seq.length ; i++){
            int x = seq[current_sq] * i;
            if (mark[x]== false ){
                mark[x] = true;
                result += find(n,current_sq+1 , seq);
                mark[x] = false;
            }
        }
        return result;
    }
}
