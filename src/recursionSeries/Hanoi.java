package recursionSeries;

import java.util.Scanner;

public class Hanoi {
   static int moveNumber=1;
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        hanoi('A','B','C',n);
    }
    static void hanoi(char from , char to , char help , int n){
        if (n==1){
            System.out.println(moveNumber+" "+from+" "+to);
            moveNumber++;
            return;
        }
        hanoi(from,help,to,n-1);
        System.out.println(moveNumber+" "+from+" "+to);
        moveNumber++;
        hanoi(help,to,from,n-1);
}
/*
import java.util.Scanner;

public class Main
{
    static int moveNumber=1;
    public static void main(String[] args)
    {
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        hanoi('A','B','C',n);
    }

    static void hanoi(char from, char to, char help, int n)
    {
        if(n==1)
        {
            System.out.println(moveNumber+" "+from+" "+to);
            moveNumber++;
            return ;
        }
        hanoi(from,help,to,n-1);// n-1 taie kochiko az from mibrim be help
        System.out.println(moveNumber+" "+from+" "+to);// ydoneie gonde ro az from mibrim be to
        moveNumber++;
        hanoi(help,to,from,n-1);// n-1 taie kochiko az help mibrim be to
    }

*/

}