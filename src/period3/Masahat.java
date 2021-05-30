package period3;

import java.util.Scanner;

public class Masahat{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] h = new int[n];
        for (int i = 0 ; i < n ; i++){
            h[i] = scanner.nextInt();
        }

    }
}
/*
import java.util.*;

public class MasahatMahsor{
    static Scanner in=new Scanner(System.in);
    public static void main(String[] args){
        int n=in.nextInt();
        int[] h=new int[n];
        for(int i=0;i<n;i++)
            h[i]=in.nextInt();
        int i,top;
        long area=0,max=-1;
        Stack<Integer> s=new Stack<>();
        for(i=0;i<n;){
            if(s.isEmpty() || h[s.peek()]<=h[i])
                s.push(i++);
            else{
                top=s.peek();
                s.pop();
                if(s.isEmpty())
                    area=h[top]*i;
                else
                    area=h[top]*(i-s.peek()-1);
                if(area>max)
                    max=area;
            }
        }
        while(!s.isEmpty()){
            top=s.peek();
            s.pop();
            if(s.isEmpty())
                area=h[top]*i;
            else
                area=h[top]*(i-s.peek()-1);
            if(area>max)
                max=area;
        }
        System.out.println(max);
    }
}*/
