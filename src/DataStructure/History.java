package DataStructure;

import java.util.Scanner;
import java.util.Stack;

public class History {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int q = scanner.nextInt();
        String array[] = new String[q];
        for (int i = 0 ; i<q ; i++ ){
            array[i] = scanner.next();
        }
        Stack<String> a = new Stack<>();
        for (int i = 0 ; i<q ; i++){
            if (array[i].contains("insert")){

            }else if (array[i].contains("delete")){
               
            }else System.out.println("undo");
        }


    }
}
