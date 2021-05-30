package timeAnalysis;

import java.util.Scanner;

public class TriangleModerate {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        long answer = 0;
        for(int a = 1 ; a<=n/3 ; a++){
            answer +=  (n-3*a)/2-Math.max(0,n/2-2*a+1)+1;;
        }
        System.out.println(answer);
    }
}
/*
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        long ans=0;
        for(int i=1;i<=n/3;i++)
            ans+=(n-3*i)/2-Math.max(0,n/2-2*i+1)+1;
        System.out.println(ans);
    }

}*/
