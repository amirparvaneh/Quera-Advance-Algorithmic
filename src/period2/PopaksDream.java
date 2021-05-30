package period2;

import java.util.Scanner;

public class PopaksDream {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt(), b = scanner.nextInt() , x = scanner.nextInt();
        int z = 0 ;
        for (int i = 1 ; i<=a ; i++){
            for ( int j = 1 ; j<=b ;j++){
                if (a%i==0 && b%j==0 && (i+j)<=x){
                    z++;
                }
            }
        }
        System.out.println(z);

    }
}
